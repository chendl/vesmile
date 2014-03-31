package com.vesmile.webappla.model;

import java.util.Date;

public class Home {
    private Integer id;

    private String title;

    private String type;

    private Integer lapId;

    private String lapName;

    private String x;

    private String y;

    private Integer area;

    private Long harea;

    private Long buildArea;

    private Integer isrent;

    private Integer issals;

    private Long rentPrice;

    private Long salePrice;

    private String contect;

    private Integer contectSex;

    private String contectTel1;

    private String contectTel2;

    private String contectAddress;

    private String roomType;

    private String buildingNo;

    private String unit;

    private String floor;

    private String no;

    private String year;

    private String buildingType;

    private String roomFace;

    private String propComp;

    private String memo;

    private String address;

    private Integer status;

    private Date rentdate;

    private Date pubtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getLapId() {
        return lapId;
    }

    public void setLapId(Integer lapId) {
        this.lapId = lapId;
    }

    public String getLapName() {
        return lapName;
    }

    public void setLapName(String lapName) {
        this.lapName = lapName == null ? null : lapName.trim();
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

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Long getHarea() {
        return harea;
    }

    public void setHarea(Long harea) {
        this.harea = harea;
    }

    public Long getBuildArea() {
        return buildArea;
    }

    public void setBuildArea(Long buildArea) {
        this.buildArea = buildArea;
    }

    public Integer getIsrent() {
        return isrent;
    }

    public void setIsrent(Integer isrent) {
        this.isrent = isrent;
    }

    public Integer getIssals() {
        return issals;
    }

    public void setIssals(Integer issals) {
        this.issals = issals;
    }

    public Long getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Long rentPrice) {
        this.rentPrice = rentPrice;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public String getContect() {
        return contect;
    }

    public void setContect(String contect) {
        this.contect = contect == null ? null : contect.trim();
    }

    public Integer getContectSex() {
        return contectSex;
    }

    public void setContectSex(Integer contectSex) {
        this.contectSex = contectSex;
    }

    public String getContectTel1() {
        return contectTel1;
    }

    public void setContectTel1(String contectTel1) {
        this.contectTel1 = contectTel1 == null ? null : contectTel1.trim();
    }

    public String getContectTel2() {
        return contectTel2;
    }

    public void setContectTel2(String contectTel2) {
        this.contectTel2 = contectTel2 == null ? null : contectTel2.trim();
    }

    public String getContectAddress() {
        return contectAddress;
    }

    public void setContectAddress(String contectAddress) {
        this.contectAddress = contectAddress == null ? null : contectAddress.trim();
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo == null ? null : buildingNo.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType == null ? null : buildingType.trim();
    }

    public String getRoomFace() {
        return roomFace;
    }

    public void setRoomFace(String roomFace) {
        this.roomFace = roomFace == null ? null : roomFace.trim();
    }

    public String getPropComp() {
        return propComp;
    }

    public void setPropComp(String propComp) {
        this.propComp = propComp == null ? null : propComp.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRentdate() {
        return rentdate;
    }

    public void setRentdate(Date rentdate) {
        this.rentdate = rentdate;
    }

    public Date getPubtime() {
        return pubtime;
    }

    public void setPubtime(Date pubtime) {
        this.pubtime = pubtime;
    }
}