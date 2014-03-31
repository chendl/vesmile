package com.vesmile.webappla.model;

import java.util.Date;

public class Order {
    private Integer id;

    private Integer uid;

    private String type;

    private Date ordertime;

    private Integer status;

    private Date hstartdate;

    private Date henddate;

    private Integer count;

    private Integer homeType;

    private Date finishtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getHstartdate() {
        return hstartdate;
    }

    public void setHstartdate(Date hstartdate) {
        this.hstartdate = hstartdate;
    }

    public Date getHenddate() {
        return henddate;
    }

    public void setHenddate(Date henddate) {
        this.henddate = henddate;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getHomeType() {
        return homeType;
    }

    public void setHomeType(Integer homeType) {
        this.homeType = homeType;
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }
}