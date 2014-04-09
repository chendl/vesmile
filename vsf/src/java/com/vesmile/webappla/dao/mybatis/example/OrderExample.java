package com.vesmile.webappla.dao.mybatis.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.vesmile.framework.dao.mybatis.BaseExample;
import com.vesmile.framework.dao.mybatis.Criterion;

public class OrderExample extends BaseExample<OrderExample.Criteria> {

	public static class Criteria extends GeneratedCriteria {

		public Criteria() {
			super();
		}
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public Criteria andCountBetween(Integer value1, Integer value2) {
			addCriterion("lao_count between", value1, value2, "count");
			return (Criteria) this;
		}

		public Criteria andCountEqualTo(Integer value) {
			addCriterion("lao_count =", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountGreaterThan(Integer value) {
			addCriterion("lao_count >", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountGreaterThanOrEqualTo(Integer value) {
			addCriterion("lao_count >=", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountIn(List<Integer> values) {
			addCriterion("lao_count in", values, "count");
			return (Criteria) this;
		}

		public Criteria andCountIsNotNull() {
			addCriterion("lao_count is not null");
			return (Criteria) this;
		}

		public Criteria andCountIsNull() {
			addCriterion("lao_count is null");
			return (Criteria) this;
		}

		public Criteria andCountLessThan(Integer value) {
			addCriterion("lao_count <", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountLessThanOrEqualTo(Integer value) {
			addCriterion("lao_count <=", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountNotBetween(Integer value1, Integer value2) {
			addCriterion("lao_count not between", value1, value2, "count");
			return (Criteria) this;
		}

		public Criteria andCountNotEqualTo(Integer value) {
			addCriterion("lao_count <>", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountNotIn(List<Integer> values) {
			addCriterion("lao_count not in", values, "count");
			return (Criteria) this;
		}

		public Criteria andFinishtimeBetween(Date value1, Date value2) {
			addCriterion("lao_finishtime between", value1, value2, "finishtime");
			return (Criteria) this;
		}

		public Criteria andFinishtimeEqualTo(Date value) {
			addCriterion("lao_finishtime =", value, "finishtime");
			return (Criteria) this;
		}

		public Criteria andFinishtimeGreaterThan(Date value) {
			addCriterion("lao_finishtime >", value, "finishtime");
			return (Criteria) this;
		}

		public Criteria andFinishtimeGreaterThanOrEqualTo(Date value) {
			addCriterion("lao_finishtime >=", value, "finishtime");
			return (Criteria) this;
		}

		public Criteria andFinishtimeIn(List<Date> values) {
			addCriterion("lao_finishtime in", values, "finishtime");
			return (Criteria) this;
		}

		public Criteria andFinishtimeIsNotNull() {
			addCriterion("lao_finishtime is not null");
			return (Criteria) this;
		}

		public Criteria andFinishtimeIsNull() {
			addCriterion("lao_finishtime is null");
			return (Criteria) this;
		}

		public Criteria andFinishtimeLessThan(Date value) {
			addCriterion("lao_finishtime <", value, "finishtime");
			return (Criteria) this;
		}

		public Criteria andFinishtimeLessThanOrEqualTo(Date value) {
			addCriterion("lao_finishtime <=", value, "finishtime");
			return (Criteria) this;
		}

		public Criteria andFinishtimeNotBetween(Date value1, Date value2) {
			addCriterion("lao_finishtime not between", value1, value2,
					"finishtime");
			return (Criteria) this;
		}

		public Criteria andFinishtimeNotEqualTo(Date value) {
			addCriterion("lao_finishtime <>", value, "finishtime");
			return (Criteria) this;
		}

		public Criteria andFinishtimeNotIn(List<Date> values) {
			addCriterion("lao_finishtime not in", values, "finishtime");
			return (Criteria) this;
		}

		public Criteria andHenddateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("lao_henddate between", value1, value2,
					"henddate");
			return (Criteria) this;
		}

		public Criteria andHenddateEqualTo(Date value) {
			addCriterionForJDBCDate("lao_henddate =", value, "henddate");
			return (Criteria) this;
		}

		public Criteria andHenddateGreaterThan(Date value) {
			addCriterionForJDBCDate("lao_henddate >", value, "henddate");
			return (Criteria) this;
		}

		public Criteria andHenddateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("lao_henddate >=", value, "henddate");
			return (Criteria) this;
		}

		public Criteria andHenddateIn(List<Date> values) {
			addCriterionForJDBCDate("lao_henddate in", values, "henddate");
			return (Criteria) this;
		}

		public Criteria andHenddateIsNotNull() {
			addCriterion("lao_henddate is not null");
			return (Criteria) this;
		}

		public Criteria andHenddateIsNull() {
			addCriterion("lao_henddate is null");
			return (Criteria) this;
		}

		public Criteria andHenddateLessThan(Date value) {
			addCriterionForJDBCDate("lao_henddate <", value, "henddate");
			return (Criteria) this;
		}

		public Criteria andHenddateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("lao_henddate <=", value, "henddate");
			return (Criteria) this;
		}

		public Criteria andHenddateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("lao_henddate not between", value1, value2,
					"henddate");
			return (Criteria) this;
		}

		public Criteria andHenddateNotEqualTo(Date value) {
			addCriterionForJDBCDate("lao_henddate <>", value, "henddate");
			return (Criteria) this;
		}

		public Criteria andHenddateNotIn(List<Date> values) {
			addCriterionForJDBCDate("lao_henddate not in", values, "henddate");
			return (Criteria) this;
		}

		public Criteria andHomeTypeBetween(Integer value1, Integer value2) {
			addCriterion("lao_home_type between", value1, value2, "homeType");
			return (Criteria) this;
		}

		public Criteria andHomeTypeEqualTo(Integer value) {
			addCriterion("lao_home_type =", value, "homeType");
			return (Criteria) this;
		}

		public Criteria andHomeTypeGreaterThan(Integer value) {
			addCriterion("lao_home_type >", value, "homeType");
			return (Criteria) this;
		}

		public Criteria andHomeTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("lao_home_type >=", value, "homeType");
			return (Criteria) this;
		}

		public Criteria andHomeTypeIn(List<Integer> values) {
			addCriterion("lao_home_type in", values, "homeType");
			return (Criteria) this;
		}

		public Criteria andHomeTypeIsNotNull() {
			addCriterion("lao_home_type is not null");
			return (Criteria) this;
		}

		public Criteria andHomeTypeIsNull() {
			addCriterion("lao_home_type is null");
			return (Criteria) this;
		}

		public Criteria andHomeTypeLessThan(Integer value) {
			addCriterion("lao_home_type <", value, "homeType");
			return (Criteria) this;
		}

		public Criteria andHomeTypeLessThanOrEqualTo(Integer value) {
			addCriterion("lao_home_type <=", value, "homeType");
			return (Criteria) this;
		}

		public Criteria andHomeTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("lao_home_type not between", value1, value2,
					"homeType");
			return (Criteria) this;
		}

		public Criteria andHomeTypeNotEqualTo(Integer value) {
			addCriterion("lao_home_type <>", value, "homeType");
			return (Criteria) this;
		}

		public Criteria andHomeTypeNotIn(List<Integer> values) {
			addCriterion("lao_home_type not in", values, "homeType");
			return (Criteria) this;
		}

		public Criteria andHstartdateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("lao_hstartdate between", value1, value2,
					"hstartdate");
			return (Criteria) this;
		}

		public Criteria andHstartdateEqualTo(Date value) {
			addCriterionForJDBCDate("lao_hstartdate =", value, "hstartdate");
			return (Criteria) this;
		}

		public Criteria andHstartdateGreaterThan(Date value) {
			addCriterionForJDBCDate("lao_hstartdate >", value, "hstartdate");
			return (Criteria) this;
		}

		public Criteria andHstartdateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("lao_hstartdate >=", value, "hstartdate");
			return (Criteria) this;
		}

		public Criteria andHstartdateIn(List<Date> values) {
			addCriterionForJDBCDate("lao_hstartdate in", values, "hstartdate");
			return (Criteria) this;
		}

		public Criteria andHstartdateIsNotNull() {
			addCriterion("lao_hstartdate is not null");
			return (Criteria) this;
		}

		public Criteria andHstartdateIsNull() {
			addCriterion("lao_hstartdate is null");
			return (Criteria) this;
		}

		public Criteria andHstartdateLessThan(Date value) {
			addCriterionForJDBCDate("lao_hstartdate <", value, "hstartdate");
			return (Criteria) this;
		}

		public Criteria andHstartdateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("lao_hstartdate <=", value, "hstartdate");
			return (Criteria) this;
		}

		public Criteria andHstartdateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("lao_hstartdate not between", value1,
					value2, "hstartdate");
			return (Criteria) this;
		}

		public Criteria andHstartdateNotEqualTo(Date value) {
			addCriterionForJDBCDate("lao_hstartdate <>", value, "hstartdate");
			return (Criteria) this;
		}

		public Criteria andHstartdateNotIn(List<Date> values) {
			addCriterionForJDBCDate("lao_hstartdate not in", values,
					"hstartdate");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("lao_id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("lao_id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("lao_id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("lao_id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("lao_id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("lao_id is not null");
			return (Criteria) this;
		}

		public Criteria andIdIsNull() {
			addCriterion("lao_id is null");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("lao_id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("lao_id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("lao_id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("lao_id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("lao_id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andOrdertimeBetween(Date value1, Date value2) {
			addCriterion("lao_ordertime between", value1, value2, "ordertime");
			return (Criteria) this;
		}

		public Criteria andOrdertimeEqualTo(Date value) {
			addCriterion("lao_ordertime =", value, "ordertime");
			return (Criteria) this;
		}

		public Criteria andOrdertimeGreaterThan(Date value) {
			addCriterion("lao_ordertime >", value, "ordertime");
			return (Criteria) this;
		}

		public Criteria andOrdertimeGreaterThanOrEqualTo(Date value) {
			addCriterion("lao_ordertime >=", value, "ordertime");
			return (Criteria) this;
		}

		public Criteria andOrdertimeIn(List<Date> values) {
			addCriterion("lao_ordertime in", values, "ordertime");
			return (Criteria) this;
		}

		public Criteria andOrdertimeIsNotNull() {
			addCriterion("lao_ordertime is not null");
			return (Criteria) this;
		}

		public Criteria andOrdertimeIsNull() {
			addCriterion("lao_ordertime is null");
			return (Criteria) this;
		}

		public Criteria andOrdertimeLessThan(Date value) {
			addCriterion("lao_ordertime <", value, "ordertime");
			return (Criteria) this;
		}

		public Criteria andOrdertimeLessThanOrEqualTo(Date value) {
			addCriterion("lao_ordertime <=", value, "ordertime");
			return (Criteria) this;
		}

		public Criteria andOrdertimeNotBetween(Date value1, Date value2) {
			addCriterion("lao_ordertime not between", value1, value2,
					"ordertime");
			return (Criteria) this;
		}

		public Criteria andOrdertimeNotEqualTo(Date value) {
			addCriterion("lao_ordertime <>", value, "ordertime");
			return (Criteria) this;
		}

		public Criteria andOrdertimeNotIn(List<Date> values) {
			addCriterion("lao_ordertime not in", values, "ordertime");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Integer value1, Integer value2) {
			addCriterion("lao_status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(Integer value) {
			addCriterion("lao_status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Integer value) {
			addCriterion("lao_status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("lao_status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Integer> values) {
			addCriterion("lao_status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("lao_status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("lao_status is null");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Integer value) {
			addCriterion("lao_status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Integer value) {
			addCriterion("lao_status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("lao_status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Integer value) {
			addCriterion("lao_status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Integer> values) {
			addCriterion("lao_status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(String value1, String value2) {
			addCriterion("lao_type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(String value) {
			addCriterion("lao_type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(String value) {
			addCriterion("lao_type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(String value) {
			addCriterion("lao_type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<String> values) {
			addCriterion("lao_type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("lao_type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("lao_type is null");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(String value) {
			addCriterion("lao_type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(String value) {
			addCriterion("lao_type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLike(String value) {
			addCriterion("lao_type like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(String value1, String value2) {
			addCriterion("lao_type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(String value) {
			addCriterion("lao_type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<String> values) {
			addCriterion("lao_type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotLike(String value) {
			addCriterion("lao_type not like", value, "type");
			return (Criteria) this;
		}

		public Criteria andUidBetween(Integer value1, Integer value2) {
			addCriterion("lao_uid between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andUidEqualTo(Integer value) {
			addCriterion("lao_uid =", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThan(Integer value) {
			addCriterion("lao_uid >", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThanOrEqualTo(Integer value) {
			addCriterion("lao_uid >=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidIn(List<Integer> values) {
			addCriterion("lao_uid in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidIsNotNull() {
			addCriterion("lao_uid is not null");
			return (Criteria) this;
		}

		public Criteria andUidIsNull() {
			addCriterion("lao_uid is null");
			return (Criteria) this;
		}

		public Criteria andUidLessThan(Integer value) {
			addCriterion("lao_uid <", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThanOrEqualTo(Integer value) {
			addCriterion("lao_uid <=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotBetween(Integer value1, Integer value2) {
			addCriterion("lao_uid not between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotEqualTo(Integer value) {
			addCriterion("lao_uid <>", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotIn(List<Integer> values) {
			addCriterion("lao_uid not in", values, "uid");
			return (Criteria) this;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterionForJDBCDate(String condition, Date value1,
				Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()),
					new java.sql.Date(value2.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()),
					property);
		}

		protected void addCriterionForJDBCDate(String condition,
				List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}
	}
}