package com.zwb.zwbcheck.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2018/6/5
 */
@Entity
public class Goods {

    @Id(autoincrement = true)
    private Long id;

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

    private int stockqty;

    private double price;

    private String downtime;

    @Generated(hash = 639663005)
    public Goods(Long id, String goodscode, String goodsname, String barcode,
            String simbarcode, String colorid, String colorcode, String colorname,
            String sizeid, String sizecode, String sizename, int stockqty,
            double price, String downtime) {
        this.id = id;
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
        this.stockqty = stockqty;
        this.price = price;
        this.downtime = downtime;
    }

    @Generated(hash = 1770709345)
    public Goods() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getStockqty() {
        return this.stockqty;
    }

    public void setStockqty(int stockqty) {
        this.stockqty = stockqty;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDowntime() {
        return this.downtime;
    }

    public void setDowntime(String downtime) {
        this.downtime = downtime;
    }

}
