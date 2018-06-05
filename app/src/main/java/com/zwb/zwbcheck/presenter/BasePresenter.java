package com.zwb.zwbcheck.presenter;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.zwb.zwbcheck.bean.Goods;
import com.zwb.zwbcheck.db.DaoMaster;
import com.zwb.zwbcheck.db.DaoSession;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

/**
 * Created by Administrator on 2018/6/5
 */
public class BasePresenter <T>{

    protected AbstractDao abstractDao;
    protected String dbName;


    protected void initDbHelper(Context context){
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, dbName, null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        DaoSession daoSession = daoMaster.newSession();
    }

}
