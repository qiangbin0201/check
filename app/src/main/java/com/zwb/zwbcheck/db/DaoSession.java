package com.zwb.zwbcheck.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.zwb.zwbcheck.bean.CheckDetail;
import com.zwb.zwbcheck.bean.CheckMain;
import com.zwb.zwbcheck.bean.Goods;

import com.zwb.zwbcheck.db.CheckDetailDao;
import com.zwb.zwbcheck.db.CheckMainDao;
import com.zwb.zwbcheck.db.GoodsDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig checkDetailDaoConfig;
    private final DaoConfig checkMainDaoConfig;
    private final DaoConfig goodsDaoConfig;

    private final CheckDetailDao checkDetailDao;
    private final CheckMainDao checkMainDao;
    private final GoodsDao goodsDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        checkDetailDaoConfig = daoConfigMap.get(CheckDetailDao.class).clone();
        checkDetailDaoConfig.initIdentityScope(type);

        checkMainDaoConfig = daoConfigMap.get(CheckMainDao.class).clone();
        checkMainDaoConfig.initIdentityScope(type);

        goodsDaoConfig = daoConfigMap.get(GoodsDao.class).clone();
        goodsDaoConfig.initIdentityScope(type);

        checkDetailDao = new CheckDetailDao(checkDetailDaoConfig, this);
        checkMainDao = new CheckMainDao(checkMainDaoConfig, this);
        goodsDao = new GoodsDao(goodsDaoConfig, this);

        registerDao(CheckDetail.class, checkDetailDao);
        registerDao(CheckMain.class, checkMainDao);
        registerDao(Goods.class, goodsDao);
    }
    
    public void clear() {
        checkDetailDaoConfig.clearIdentityScope();
        checkMainDaoConfig.clearIdentityScope();
        goodsDaoConfig.clearIdentityScope();
    }

    public CheckDetailDao getCheckDetailDao() {
        return checkDetailDao;
    }

    public CheckMainDao getCheckMainDao() {
        return checkMainDao;
    }

    public GoodsDao getGoodsDao() {
        return goodsDao;
    }

}
