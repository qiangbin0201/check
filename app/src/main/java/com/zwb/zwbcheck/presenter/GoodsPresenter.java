package com.zwb.zwbcheck.presenter;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.zwb.zwbcheck.bean.Goods;
import com.zwb.zwbcheck.db.DaoMaster;
import com.zwb.zwbcheck.db.DaoSession;
import com.zwb.zwbcheck.db.GoodsDao;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

/**
 * Created by Administrator on 2018/6/5
 */
public class GoodsPresenter extends BasePresenter{

    private static GoodsPresenter goodsPresenter;

    private GoodsDao mGoodsDao;

    public static GoodsPresenter getInstance() {
        if (goodsPresenter == null) {
            synchronized (GoodsPresenter.class) {
                goodsPresenter = new GoodsPresenter();
            }
        }
        return goodsPresenter;
    }

    public void initDbHelp(Context context) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, "device-db", null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        DaoSession daoSession = daoMaster.newSession();
        mGoodsDao = daoSession.getGoodsDao();
    }

    public List<Goods> queryAllData(){
        List<Goods> list = mGoodsDao.loadAll();
        return list;
    }

    public List<Goods> queryByCode(String code){
        QueryBuilder<Goods> qb = mGoodsDao.queryBuilder();
        List<Goods> list = qb.where(GoodsDao.Properties.Barcode.eq(code)).list();
        return list;
    }












}
