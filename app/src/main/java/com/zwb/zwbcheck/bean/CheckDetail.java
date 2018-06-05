package com.zwb.zwbcheck.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2018/6/5
 */
@Entity
public class CheckDetail {

    @Id(autoincrement = true)
    private Long id;

    private Long uniqueNum;

    private String billno;

    private String shelf;

    private String location;

    private String goodscode;

    private String goodsname;

    private String barcode;

    private String simbarcode;

    private String colorid;

    private String colorcode;

    private String colorname;

    private String sizeid;

    private String sizecode;

    private String sizename;

    private int qty;

    private int stockqty;

    private String scantime;

    private double price;

    private double account;

    @Generated(hash = 2072140113)
    public CheckDetail(Long id, Long uniqueNum, String billno, String shelf,
            String location, String goodscode, String goodsname, String barcode,
            String simbarcode, String colorid, String colorcode, String colorname,
            String sizeid, String sizecode, String sizename, int qty, int stockqty,
            String scantime, double price, double account) {
        this.id = id;
        this.uniqueNum = uniqueNum;
        this.billno = billno;
        this.shelf = shelf;
        this.location = location;
        this.goodscode = goodscode;
        this.goodsname = goodsname;
        this.barcode = barcode;
        this.simbarcode = simbarcode;
        this.colorid = colorid;
        this.colorcode = colorcode;
        this.colorname = colorname;
        this.sizeid = sizeid;
        this.sizecode = sizecode;
        this.sizename = sizename;
        this.qty = qty;
        this.stockqty = stockqty;
        this.scantime = scantime;
        this.price = price;
        this.account = account;
    }

    @Generated(hash = 1212583581)
    public CheckDetail() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUniqueNum() {
        return this.uniqueNum;
    }

    public void setUniqueNum(Long uniqueNum) {
        this.uniqueNum = uniqueNum;
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

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGoodscode() {
        return this.goodscode;
    }

    public void setGoodscode(String goodscode) {
        this.goodscode = goodscode;
    }

    public String getGoodsname() {
        return this.goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getBarcode() {
        return this.barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getSimbarcode() {
        return this.simbarcode;
    }

    public void setSimbarcode(String simbarcode) {
        this.simbarcode = simbarcode;
    }

    public String getColorid() {
        return this.colorid;
    }

    public void setColorid(String colorid) {
        this.colorid = colorid;
    }

    public String getColorcode() {
        return this.colorcode;
    }

    public void setColorcode(String colorcode) {
        this.colorcode = colorcode;
    }

    public String getColorname() {
        return this.colorname;
    }

    public void setColorname(String colorname) {
        this.colorname = colorname;
    }

    public String getSizeid() {
        return this.sizeid;
    }

    public void setSizeid(String sizeid) {
        this.sizeid = sizeid;
    }

    public String getSizecode() {
        return this.sizecode;
    }

    public void setSizecode(String sizecode) {
        this.sizecode = sizecode;
    }

    public String getSizename() {
        return this.sizename;
    }

    public void setSizename(String sizename) {
        this.sizename = sizename;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getStockqty() {
        return this.stockqty;
    }

    public void setStockqty(int stockqty) {
        this.stockqty = stockqty;
    }

    public String getScantime() {
        return this.scantime;
    }

    public void setScantime(String scantime) {
        this.scantime = scantime;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAccount() {
        return this.account;
    }

    public void setAccount(double account) {
        this.account = account;
    }


}
