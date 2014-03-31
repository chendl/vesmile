package com.vesmile.webappla.model;

import java.util.Date;

public class Log {
    private Integer id;

    private Integer uid;

    private String uname;

    private String opre;

    private String memo;

    private Date opreTime;

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

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getOpre() {
        return opre;
    }

    public void setOpre(String opre) {
        this.opre = opre == null ? null : opre.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Date getOpreTime() {
        return opreTime;
    }

    public void setOpreTime(Date opreTime) {
        this.opreTime = opreTime;
    }
}