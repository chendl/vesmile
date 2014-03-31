package com.vesmile.webappla.model;

public class Property {
    private Integer id;

    private String code;

    private String name;

    private String x;

    private String y;

    private String year;

    private String housetype;

    private String buildtype;

    private Long volumeRate;

    private Long greeningRate;

    private Integer buildingNum;

    private Integer homeNum;

    private String propComp;

    private String buildComp;

    private Integer area;

    private String propPrice;

    private String salesPrice;

    private String rentPrice;

    private String harea;

    private String address;

    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x == null ? null : x.trim();
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y == null ? null : y.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getHousetype() {
        return housetype;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype == null ? null : housetype.trim();
    }

    public String getBuildtype() {
        return buildtype;
    }

    public void setBuildtype(String buildtype) {
        this.buildtype = buildtype == null ? null : buildtype.trim();
    }

    public Long getVolumeRate() {
        return volumeRate;
    }

    public void setVolumeRate(Long volumeRate) {
        this.volumeRate = volumeRate;
    }

    public Long getGreeningRate() {
        return greeningRate;
    }

    public void setGreeningRate(Long greeningRate) {
        this.greeningRate = greeningRate;
    }

    public Integer getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(Integer buildingNum) {
        this.buildingNum = buildingNum;
    }

    public Integer getHomeNum() {
        return homeNum;
    }

    public void setHomeNum(Integer homeNum) {
        this.homeNum = homeNum;
    }

    public String getPropComp() {
        return propComp;
    }

    public void setPropComp(String propComp) {
        this.propComp = propComp == null ? null : propComp.trim();
    }

    public String getBuildComp() {
        return buildComp;
    }

    public void setBuildComp(String buildComp) {
        this.buildComp = buildComp == null ? null : buildComp.trim();
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getPropPrice() {
        return propPrice;
    }

    public void setPropPrice(String propPrice) {
        this.propPrice = propPrice == null ? null : propPrice.trim();
    }

    public String getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(String salesPrice) {
        this.salesPrice = salesPrice == null ? null : salesPrice.trim();
    }

    public String getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(String rentPrice) {
        this.rentPrice = rentPrice == null ? null : rentPrice.trim();
    }

    public String getHarea() {
        return harea;
    }

    public void setHarea(String harea) {
        this.harea = harea == null ? null : harea.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}