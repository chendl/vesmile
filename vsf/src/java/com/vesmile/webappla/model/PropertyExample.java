package com.vesmile.webappla.model;

import java.util.ArrayList;
import java.util.List;

public class PropertyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PropertyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("lap_id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("lap_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("lap_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("lap_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("lap_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lap_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("lap_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("lap_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("lap_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("lap_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("lap_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lap_id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("lap_code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("lap_code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("lap_code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("lap_code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("lap_code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("lap_code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("lap_code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("lap_code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("lap_code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("lap_code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("lap_code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("lap_code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("lap_code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("lap_code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("lap_name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("lap_name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("lap_name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("lap_name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("lap_name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("lap_name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("lap_name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("lap_name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("lap_name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("lap_name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("lap_name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("lap_name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("lap_name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("lap_name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andXIsNull() {
            addCriterion("lap_x is null");
            return (Criteria) this;
        }

        public Criteria andXIsNotNull() {
            addCriterion("lap_x is not null");
            return (Criteria) this;
        }

        public Criteria andXEqualTo(String value) {
            addCriterion("lap_x =", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotEqualTo(String value) {
            addCriterion("lap_x <>", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThan(String value) {
            addCriterion("lap_x >", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThanOrEqualTo(String value) {
            addCriterion("lap_x >=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThan(String value) {
            addCriterion("lap_x <", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThanOrEqualTo(String value) {
            addCriterion("lap_x <=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLike(String value) {
            addCriterion("lap_x like", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotLike(String value) {
            addCriterion("lap_x not like", value, "x");
            return (Criteria) this;
        }

        public Criteria andXIn(List<String> values) {
            addCriterion("lap_x in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXNotIn(List<String> values) {
            addCriterion("lap_x not in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXBetween(String value1, String value2) {
            addCriterion("lap_x between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andXNotBetween(String value1, String value2) {
            addCriterion("lap_x not between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andYIsNull() {
            addCriterion("lap_y is null");
            return (Criteria) this;
        }

        public Criteria andYIsNotNull() {
            addCriterion("lap_y is not null");
            return (Criteria) this;
        }

        public Criteria andYEqualTo(String value) {
            addCriterion("lap_y =", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotEqualTo(String value) {
            addCriterion("lap_y <>", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThan(String value) {
            addCriterion("lap_y >", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThanOrEqualTo(String value) {
            addCriterion("lap_y >=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThan(String value) {
            addCriterion("lap_y <", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThanOrEqualTo(String value) {
            addCriterion("lap_y <=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLike(String value) {
            addCriterion("lap_y like", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotLike(String value) {
            addCriterion("lap_y not like", value, "y");
            return (Criteria) this;
        }

        public Criteria andYIn(List<String> values) {
            addCriterion("lap_y in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYNotIn(List<String> values) {
            addCriterion("lap_y not in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYBetween(String value1, String value2) {
            addCriterion("lap_y between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andYNotBetween(String value1, String value2) {
            addCriterion("lap_y not between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("lap_year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("lap_year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("lap_year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("lap_year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("lap_year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("lap_year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("lap_year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("lap_year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("lap_year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("lap_year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("lap_year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("lap_year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("lap_year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("lap_year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andHousetypeIsNull() {
            addCriterion("lap_housetype is null");
            return (Criteria) this;
        }

        public Criteria andHousetypeIsNotNull() {
            addCriterion("lap_housetype is not null");
            return (Criteria) this;
        }

        public Criteria andHousetypeEqualTo(String value) {
            addCriterion("lap_housetype =", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotEqualTo(String value) {
            addCriterion("lap_housetype <>", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeGreaterThan(String value) {
            addCriterion("lap_housetype >", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeGreaterThanOrEqualTo(String value) {
            addCriterion("lap_housetype >=", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeLessThan(String value) {
            addCriterion("lap_housetype <", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeLessThanOrEqualTo(String value) {
            addCriterion("lap_housetype <=", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeLike(String value) {
            addCriterion("lap_housetype like", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotLike(String value) {
            addCriterion("lap_housetype not like", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeIn(List<String> values) {
            addCriterion("lap_housetype in", values, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotIn(List<String> values) {
            addCriterion("lap_housetype not in", values, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeBetween(String value1, String value2) {
            addCriterion("lap_housetype between", value1, value2, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotBetween(String value1, String value2) {
            addCriterion("lap_housetype not between", value1, value2, "housetype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeIsNull() {
            addCriterion("lap_buildtype is null");
            return (Criteria) this;
        }

        public Criteria andBuildtypeIsNotNull() {
            addCriterion("lap_buildtype is not null");
            return (Criteria) this;
        }

        public Criteria andBuildtypeEqualTo(String value) {
            addCriterion("lap_buildtype =", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeNotEqualTo(String value) {
            addCriterion("lap_buildtype <>", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeGreaterThan(String value) {
            addCriterion("lap_buildtype >", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeGreaterThanOrEqualTo(String value) {
            addCriterion("lap_buildtype >=", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeLessThan(String value) {
            addCriterion("lap_buildtype <", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeLessThanOrEqualTo(String value) {
            addCriterion("lap_buildtype <=", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeLike(String value) {
            addCriterion("lap_buildtype like", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeNotLike(String value) {
            addCriterion("lap_buildtype not like", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeIn(List<String> values) {
            addCriterion("lap_buildtype in", values, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeNotIn(List<String> values) {
            addCriterion("lap_buildtype not in", values, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeBetween(String value1, String value2) {
            addCriterion("lap_buildtype between", value1, value2, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeNotBetween(String value1, String value2) {
            addCriterion("lap_buildtype not between", value1, value2, "buildtype");
            return (Criteria) this;
        }

        public Criteria andVolumeRateIsNull() {
            addCriterion("lap_volume_rate is null");
            return (Criteria) this;
        }

        public Criteria andVolumeRateIsNotNull() {
            addCriterion("lap_volume_rate is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeRateEqualTo(Long value) {
            addCriterion("lap_volume_rate =", value, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateNotEqualTo(Long value) {
            addCriterion("lap_volume_rate <>", value, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateGreaterThan(Long value) {
            addCriterion("lap_volume_rate >", value, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateGreaterThanOrEqualTo(Long value) {
            addCriterion("lap_volume_rate >=", value, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateLessThan(Long value) {
            addCriterion("lap_volume_rate <", value, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateLessThanOrEqualTo(Long value) {
            addCriterion("lap_volume_rate <=", value, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateIn(List<Long> values) {
            addCriterion("lap_volume_rate in", values, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateNotIn(List<Long> values) {
            addCriterion("lap_volume_rate not in", values, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateBetween(Long value1, Long value2) {
            addCriterion("lap_volume_rate between", value1, value2, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateNotBetween(Long value1, Long value2) {
            addCriterion("lap_volume_rate not between", value1, value2, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateIsNull() {
            addCriterion("lap_greening_rate is null");
            return (Criteria) this;
        }

        public Criteria andGreeningRateIsNotNull() {
            addCriterion("lap_greening_rate is not null");
            return (Criteria) this;
        }

        public Criteria andGreeningRateEqualTo(Long value) {
            addCriterion("lap_greening_rate =", value, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateNotEqualTo(Long value) {
            addCriterion("lap_greening_rate <>", value, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateGreaterThan(Long value) {
            addCriterion("lap_greening_rate >", value, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateGreaterThanOrEqualTo(Long value) {
            addCriterion("lap_greening_rate >=", value, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateLessThan(Long value) {
            addCriterion("lap_greening_rate <", value, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateLessThanOrEqualTo(Long value) {
            addCriterion("lap_greening_rate <=", value, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateIn(List<Long> values) {
            addCriterion("lap_greening_rate in", values, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateNotIn(List<Long> values) {
            addCriterion("lap_greening_rate not in", values, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateBetween(Long value1, Long value2) {
            addCriterion("lap_greening_rate between", value1, value2, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andGreeningRateNotBetween(Long value1, Long value2) {
            addCriterion("lap_greening_rate not between", value1, value2, "greeningRate");
            return (Criteria) this;
        }

        public Criteria andBuildingNumIsNull() {
            addCriterion("lap_building_num is null");
            return (Criteria) this;
        }

        public Criteria andBuildingNumIsNotNull() {
            addCriterion("lap_building_num is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingNumEqualTo(Integer value) {
            addCriterion("lap_building_num =", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumNotEqualTo(Integer value) {
            addCriterion("lap_building_num <>", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumGreaterThan(Integer value) {
            addCriterion("lap_building_num >", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("lap_building_num >=", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumLessThan(Integer value) {
            addCriterion("lap_building_num <", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumLessThanOrEqualTo(Integer value) {
            addCriterion("lap_building_num <=", value, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumIn(List<Integer> values) {
            addCriterion("lap_building_num in", values, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumNotIn(List<Integer> values) {
            addCriterion("lap_building_num not in", values, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumBetween(Integer value1, Integer value2) {
            addCriterion("lap_building_num between", value1, value2, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andBuildingNumNotBetween(Integer value1, Integer value2) {
            addCriterion("lap_building_num not between", value1, value2, "buildingNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumIsNull() {
            addCriterion("lap_home_num is null");
            return (Criteria) this;
        }

        public Criteria andHomeNumIsNotNull() {
            addCriterion("lap_home_num is not null");
            return (Criteria) this;
        }

        public Criteria andHomeNumEqualTo(Integer value) {
            addCriterion("lap_home_num =", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumNotEqualTo(Integer value) {
            addCriterion("lap_home_num <>", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumGreaterThan(Integer value) {
            addCriterion("lap_home_num >", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("lap_home_num >=", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumLessThan(Integer value) {
            addCriterion("lap_home_num <", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumLessThanOrEqualTo(Integer value) {
            addCriterion("lap_home_num <=", value, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumIn(List<Integer> values) {
            addCriterion("lap_home_num in", values, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumNotIn(List<Integer> values) {
            addCriterion("lap_home_num not in", values, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumBetween(Integer value1, Integer value2) {
            addCriterion("lap_home_num between", value1, value2, "homeNum");
            return (Criteria) this;
        }

        public Criteria andHomeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("lap_home_num not between", value1, value2, "homeNum");
            return (Criteria) this;
        }

        public Criteria andPropCompIsNull() {
            addCriterion("lap_prop_comp is null");
            return (Criteria) this;
        }

        public Criteria andPropCompIsNotNull() {
            addCriterion("lap_prop_comp is not null");
            return (Criteria) this;
        }

        public Criteria andPropCompEqualTo(String value) {
            addCriterion("lap_prop_comp =", value, "propComp");
            return (Criteria) this;
        }

        public Criteria andPropCompNotEqualTo(String value) {
            addCriterion("lap_prop_comp <>", value, "propComp");
            return (Criteria) this;
        }

        public Criteria andPropCompGreaterThan(String value) {
            addCriterion("lap_prop_comp >", value, "propComp");
            return (Criteria) this;
        }

        public Criteria andPropCompGreaterThanOrEqualTo(String value) {
            addCriterion("lap_prop_comp >=", value, "propComp");
            return (Criteria) this;
        }

        public Criteria andPropCompLessThan(String value) {
            addCriterion("lap_prop_comp <", value, "propComp");
            return (Criteria) this;
        }

        public Criteria andPropCompLessThanOrEqualTo(String value) {
            addCriterion("lap_prop_comp <=", value, "propComp");
            return (Criteria) this;
        }

        public Criteria andPropCompLike(String value) {
            addCriterion("lap_prop_comp like", value, "propComp");
            return (Criteria) this;
        }

        public Criteria andPropCompNotLike(String value) {
            addCriterion("lap_prop_comp not like", value, "propComp");
            return (Criteria) this;
        }

        public Criteria andPropCompIn(List<String> values) {
            addCriterion("lap_prop_comp in", values, "propComp");
            return (Criteria) this;
        }

        public Criteria andPropCompNotIn(List<String> values) {
            addCriterion("lap_prop_comp not in", values, "propComp");
            return (Criteria) this;
        }

        public Criteria andPropCompBetween(String value1, String value2) {
            addCriterion("lap_prop_comp between", value1, value2, "propComp");
            return (Criteria) this;
        }

        public Criteria andPropCompNotBetween(String value1, String value2) {
            addCriterion("lap_prop_comp not between", value1, value2, "propComp");
            return (Criteria) this;
        }

        public Criteria andBuildCompIsNull() {
            addCriterion("lap_build_comp is null");
            return (Criteria) this;
        }

        public Criteria andBuildCompIsNotNull() {
            addCriterion("lap_build_comp is not null");
            return (Criteria) this;
        }

        public Criteria andBuildCompEqualTo(String value) {
            addCriterion("lap_build_comp =", value, "buildComp");
            return (Criteria) this;
        }

        public Criteria andBuildCompNotEqualTo(String value) {
            addCriterion("lap_build_comp <>", value, "buildComp");
            return (Criteria) this;
        }

        public Criteria andBuildCompGreaterThan(String value) {
            addCriterion("lap_build_comp >", value, "buildComp");
            return (Criteria) this;
        }

        public Criteria andBuildCompGreaterThanOrEqualTo(String value) {
            addCriterion("lap_build_comp >=", value, "buildComp");
            return (Criteria) this;
        }

        public Criteria andBuildCompLessThan(String value) {
            addCriterion("lap_build_comp <", value, "buildComp");
            return (Criteria) this;
        }

        public Criteria andBuildCompLessThanOrEqualTo(String value) {
            addCriterion("lap_build_comp <=", value, "buildComp");
            return (Criteria) this;
        }

        public Criteria andBuildCompLike(String value) {
            addCriterion("lap_build_comp like", value, "buildComp");
            return (Criteria) this;
        }

        public Criteria andBuildCompNotLike(String value) {
            addCriterion("lap_build_comp not like", value, "buildComp");
            return (Criteria) this;
        }

        public Criteria andBuildCompIn(List<String> values) {
            addCriterion("lap_build_comp in", values, "buildComp");
            return (Criteria) this;
        }

        public Criteria andBuildCompNotIn(List<String> values) {
            addCriterion("lap_build_comp not in", values, "buildComp");
            return (Criteria) this;
        }

        public Criteria andBuildCompBetween(String value1, String value2) {
            addCriterion("lap_build_comp between", value1, value2, "buildComp");
            return (Criteria) this;
        }

        public Criteria andBuildCompNotBetween(String value1, String value2) {
            addCriterion("lap_build_comp not between", value1, value2, "buildComp");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("lap_area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("lap_area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("lap_area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("lap_area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("lap_area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("lap_area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("lap_area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("lap_area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("lap_area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("lap_area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("lap_area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("lap_area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andPropPriceIsNull() {
            addCriterion("lap_prop_price is null");
            return (Criteria) this;
        }

        public Criteria andPropPriceIsNotNull() {
            addCriterion("lap_prop_price is not null");
            return (Criteria) this;
        }

        public Criteria andPropPriceEqualTo(String value) {
            addCriterion("lap_prop_price =", value, "propPrice");
            return (Criteria) this;
        }

        public Criteria andPropPriceNotEqualTo(String value) {
            addCriterion("lap_prop_price <>", value, "propPrice");
            return (Criteria) this;
        }

        public Criteria andPropPriceGreaterThan(String value) {
            addCriterion("lap_prop_price >", value, "propPrice");
            return (Criteria) this;
        }

        public Criteria andPropPriceGreaterThanOrEqualTo(String value) {
            addCriterion("lap_prop_price >=", value, "propPrice");
            return (Criteria) this;
        }

        public Criteria andPropPriceLessThan(String value) {
            addCriterion("lap_prop_price <", value, "propPrice");
            return (Criteria) this;
        }

        public Criteria andPropPriceLessThanOrEqualTo(String value) {
            addCriterion("lap_prop_price <=", value, "propPrice");
            return (Criteria) this;
        }

        public Criteria andPropPriceLike(String value) {
            addCriterion("lap_prop_price like", value, "propPrice");
            return (Criteria) this;
        }

        public Criteria andPropPriceNotLike(String value) {
            addCriterion("lap_prop_price not like", value, "propPrice");
            return (Criteria) this;
        }

        public Criteria andPropPriceIn(List<String> values) {
            addCriterion("lap_prop_price in", values, "propPrice");
            return (Criteria) this;
        }

        public Criteria andPropPriceNotIn(List<String> values) {
            addCriterion("lap_prop_price not in", values, "propPrice");
            return (Criteria) this;
        }

        public Criteria andPropPriceBetween(String value1, String value2) {
            addCriterion("lap_prop_price between", value1, value2, "propPrice");
            return (Criteria) this;
        }

        public Criteria andPropPriceNotBetween(String value1, String value2) {
            addCriterion("lap_prop_price not between", value1, value2, "propPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIsNull() {
            addCriterion("lap_sales_price is null");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIsNotNull() {
            addCriterion("lap_sales_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPriceEqualTo(String value) {
            addCriterion("lap_sales_price =", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotEqualTo(String value) {
            addCriterion("lap_sales_price <>", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceGreaterThan(String value) {
            addCriterion("lap_sales_price >", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceGreaterThanOrEqualTo(String value) {
            addCriterion("lap_sales_price >=", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceLessThan(String value) {
            addCriterion("lap_sales_price <", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceLessThanOrEqualTo(String value) {
            addCriterion("lap_sales_price <=", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceLike(String value) {
            addCriterion("lap_sales_price like", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotLike(String value) {
            addCriterion("lap_sales_price not like", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIn(List<String> values) {
            addCriterion("lap_sales_price in", values, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotIn(List<String> values) {
            addCriterion("lap_sales_price not in", values, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceBetween(String value1, String value2) {
            addCriterion("lap_sales_price between", value1, value2, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotBetween(String value1, String value2) {
            addCriterion("lap_sales_price not between", value1, value2, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceIsNull() {
            addCriterion("lap_rent_price is null");
            return (Criteria) this;
        }

        public Criteria andRentPriceIsNotNull() {
            addCriterion("lap_rent_price is not null");
            return (Criteria) this;
        }

        public Criteria andRentPriceEqualTo(String value) {
            addCriterion("lap_rent_price =", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceNotEqualTo(String value) {
            addCriterion("lap_rent_price <>", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceGreaterThan(String value) {
            addCriterion("lap_rent_price >", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceGreaterThanOrEqualTo(String value) {
            addCriterion("lap_rent_price >=", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceLessThan(String value) {
            addCriterion("lap_rent_price <", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceLessThanOrEqualTo(String value) {
            addCriterion("lap_rent_price <=", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceLike(String value) {
            addCriterion("lap_rent_price like", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceNotLike(String value) {
            addCriterion("lap_rent_price not like", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceIn(List<String> values) {
            addCriterion("lap_rent_price in", values, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceNotIn(List<String> values) {
            addCriterion("lap_rent_price not in", values, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceBetween(String value1, String value2) {
            addCriterion("lap_rent_price between", value1, value2, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceNotBetween(String value1, String value2) {
            addCriterion("lap_rent_price not between", value1, value2, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andHareaIsNull() {
            addCriterion("lap_harea is null");
            return (Criteria) this;
        }

        public Criteria andHareaIsNotNull() {
            addCriterion("lap_harea is not null");
            return (Criteria) this;
        }

        public Criteria andHareaEqualTo(String value) {
            addCriterion("lap_harea =", value, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaNotEqualTo(String value) {
            addCriterion("lap_harea <>", value, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaGreaterThan(String value) {
            addCriterion("lap_harea >", value, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaGreaterThanOrEqualTo(String value) {
            addCriterion("lap_harea >=", value, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaLessThan(String value) {
            addCriterion("lap_harea <", value, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaLessThanOrEqualTo(String value) {
            addCriterion("lap_harea <=", value, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaLike(String value) {
            addCriterion("lap_harea like", value, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaNotLike(String value) {
            addCriterion("lap_harea not like", value, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaIn(List<String> values) {
            addCriterion("lap_harea in", values, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaNotIn(List<String> values) {
            addCriterion("lap_harea not in", values, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaBetween(String value1, String value2) {
            addCriterion("lap_harea between", value1, value2, "harea");
            return (Criteria) this;
        }

        public Criteria andHareaNotBetween(String value1, String value2) {
            addCriterion("lap_harea not between", value1, value2, "harea");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("lap_address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("lap_address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("lap_address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("lap_address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("lap_address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("lap_address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("lap_address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("lap_address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("lap_address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("lap_address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("lap_address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("lap_address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("lap_address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("lap_address not between", value1, value2, "address");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}