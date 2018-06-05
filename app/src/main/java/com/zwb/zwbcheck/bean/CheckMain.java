package com.zwb.zwbcheck.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;
import org.greenrobot.greendao.DaoException;
import com.zwb.zwbcheck.db.DaoSession;
import com.zwb.zwbcheck.db.CheckDetailDao;
import com.zwb.zwbcheck.db.CheckMainDao;

/**
 * Created by Administrator on 2018/6/5
 */
@Entity
public class CheckMain {

    @Id(autoincrement = true)
    private Long id;

    //商品编号
    private String billno;

    //商品货位
    private String shelf;

    //数量
    private long qty;

    private double account;

    private String remark;

    private String billdate;

    private String operateperson;

    private String uploadstatus;

    @ToMany(referencedJoinProperty = "uniqueNum")
    private List<CheckDetail> checkDetails;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 1401387650)
    private transient CheckMainDao myDao;

    @Generated(hash = 126203601)
    public CheckMain(Long id, String billno, String shelf, long qty, double account,
            String remark, String billdate, String operateperson,
            String uploadstatus) {
        this.id = id;
        this.billno = billno;
        this.shelf = shelf;
        this.qty = qty;
        this.account = account;
        this.remark = remark;
        this.billdate = billdate;
        this.operateperson = operateperson;
        this.uploadstatus = uploadstatus;
    }

    @Generated(hash = 1246087160)
    public CheckMain() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBillno() {
        return this.billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public String getShelf() {
        return this.shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public long getQty() {
        return this.qty;
    }

    public void setQty(long qty) {
        this.qty = qty;
    }

    public double getAccount() {
        return this.account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBilldate() {
        return this.billdate;
    }

    public void setBilldate(String billdate) {
        this.billdate = billdate;
    }

    public String getOperateperson() {
        return this.operateperson;
    }

    public void setOperateperson(String operateperson) {
        this.operateperson = operateperson;
    }

    public String getUploadstatus() {
        return this.uploadstatus;
    }

    public void setUploadstatus(String uploadstatus) {
        this.uploadstatus = uploadstatus;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 1524213712)
    public List<CheckDetail> getCheckDetails() {
        if (checkDetails == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            CheckDetailDao targetDao = daoSession.getCheckDetailDao();
            List<CheckDetail> checkDetailsNew = targetDao
                    ._queryCheckMain_CheckDetails(id);
            synchronized (this) {
                if (checkDetails == null) {
                    checkDetails = checkDetailsNew;
                }
            }
        }
        return checkDetails;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 1171406003)
    public synchronized void resetCheckDetails() {
        checkDetails = null;
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 2004220593)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getCheckMainDao() : null;
    }



}
