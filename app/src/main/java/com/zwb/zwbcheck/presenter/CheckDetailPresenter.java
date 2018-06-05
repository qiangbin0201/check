package com.zwb.zwbcheck.presenter;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.zwb.zwbcheck.CollectionUtil;
import com.zwb.zwbcheck.bean.CheckDetail;
import com.zwb.zwbcheck.bean.Goods;
import com.zwb.zwbcheck.db.CheckDetailDao;
import com.zwb.zwbcheck.db.DaoMaster;
import com.zwb.zwbcheck.db.DaoSession;
import com.zwb.zwbcheck.db.GoodsDao;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

/**
 * Created by Administrator on 2018/6/5
 */
public class CheckDetailPresenter {
    private static CheckDetailPresenter checkDetailPresenter;

    private CheckDetailDao mCheckDetailDao;

    public static CheckDetailPresenter getInstance() {
        if (checkDetailPresenter == null) {
            synchronized (CheckDetailPresenter.class) {
                checkDetailPresenter = new CheckDetailPresenter();
            }
        }
        return checkDetailPresenter;
    }

    public void initDbHelp(Context context) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, "check-detail-db", null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        DaoSession daoSession = daoMaster.newSession();
        mCheckDetailDao = daoSession.getCheckDetailDao();
    }

    public List<CheckDetail> queryAllData(){
        List<CheckDetail> list = mCheckDetailDao.loadAll();
        return list;
    }

    public List<CheckDetail> queryByCode(String code){
        QueryBuilder<CheckDetail> qb = mCheckDetailDao.queryBuilder();
        List<CheckDetail> list = qb.where(CheckDetailDao.Properties.Barcode.eq(code)).list();
        return list;
    }

    public void insertDetailData(CheckDetail checkDetail){
        mCheckDetailDao.insert(checkDetail);

    }

    public void updateDetailData(CheckDetail checkDetail){
        List<CheckDetail> list = mCheckDetailDao.queryBuilder().where(CheckDetailDao.Properties.Barcode.eq(checkDetail.getBarcode())).list();
        if(CollectionUtil.isNotEmpty(list)){
            Long id = list.get(0).getId();
            checkDetail.setId(id);
            mCheckDetailDao.insert(checkDetail);
        }
    }

}
