package com.vesmile.webappla.dao.mybatis.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.vesmile.framework.dao.mybatis.BaseExample;
import com.vesmile.framework.dao.mybatis.Criterion;

public class UserPrivExample extends BaseExample<UserPrivExample.Criteria> {
	
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
			addCriterion("laup_count between", value1, value2, "count");
			return (Criteria) this;
		}

		public Criteria andCountEqualTo(Integer value) {
			addCriterion("laup_count =", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountGreaterThan(Integer value) {
			addCriterion("laup_count >", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountGreaterThanOrEqualTo(Integer value) {
			addCriterion("laup_count >=", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountIn(List<Integer> values) {
			addCriterion("laup_count in", values, "count");
			return (Criteria) this;
		}

		public Criteria andCountIsNotNull() {
			addCriterion("laup_count is not null");
			return (Criteria) this;
		}

		public Criteria andCountIsNull() {
			addCriterion("laup_count is null");
			return (Criteria) this;
		}

		public Criteria andCountLessThan(Integer value) {
			addCriterion("laup_count <", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountLessThanOrEqualTo(Integer value) {
			addCriterion("laup_count <=", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountNotBetween(Integer value1, Integer value2) {
			addCriterion("laup_count not between", value1, value2, "count");
			return (Criteria) this;
		}

		public Criteria andCountNotEqualTo(Integer value) {
			addCriterion("laup_count <>", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountNotIn(List<Integer> values) {
			addCriterion("laup_count not in", values, "count");
			return (Criteria) this;
		}

		public Criteria andEnddateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("laup_enddate between", value1, value2,
					"enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateEqualTo(Date value) {
			addCriterionForJDBCDate("laup_enddate =", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateGreaterThan(Date value) {
			addCriterionForJDBCDate("laup_enddate >", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("laup_enddate >=", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateIn(List<Date> values) {
			addCriterionForJDBCDate("laup_enddate in", values, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateIsNotNull() {
			addCriterion("laup_enddate is not null");
			return (Criteria) this;
		}

		public Criteria andEnddateIsNull() {
			addCriterion("laup_enddate is null");
			return (Criteria) this;
		}

		public Criteria andEnddateLessThan(Date value) {
			addCriterionForJDBCDate("laup_enddate <", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("laup_enddate <=", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("laup_enddate not between", value1, value2,
					"enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateNotEqualTo(Date value) {
			addCriterionForJDBCDate("laup_enddate <>", value, "enddate");
			return (Criteria) this;
		}

		public Criteria andEnddateNotIn(List<Date> values) {
			addCriterionForJDBCDate("laup_enddate not in", values, "enddate");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("laup_id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("laup_id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("laup_id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("laup_id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("laup_id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("laup_id is not null");
			return (Criteria) this;
		}

		public Criteria andIdIsNull() {
			addCriterion("laup_id is null");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("laup_id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("laup_id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("laup_id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("laup_id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("laup_id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andPtypeBetween(Integer value1, Integer value2) {
			addCriterion("laup_ptype between", value1, value2, "ptype");
			return (Criteria) this;
		}

		public Criteria andPtypeEqualTo(Integer value) {
			addCriterion("laup_ptype =", value, "ptype");
			return (Criteria) this;
		}

		public Criteria andPtypeGreaterThan(Integer value) {
			addCriterion("laup_ptype >", value, "ptype");
			return (Criteria) this;
		}

		public Criteria andPtypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("laup_ptype >=", value, "ptype");
			return (Criteria) this;
		}

		public Criteria andPtypeIn(List<Integer> values) {
			addCriterion("laup_ptype in", values, "ptype");
			return (Criteria) this;
		}

		public Criteria andPtypeIsNotNull() {
			addCriterion("laup_ptype is not null");
			return (Criteria) this;
		}

		public Criteria andPtypeIsNull() {
			addCriterion("laup_ptype is null");
			return (Criteria) this;
		}

		public Criteria andPtypeLessThan(Integer value) {
			addCriterion("laup_ptype <", value, "ptype");
			return (Criteria) this;
		}

		public Criteria andPtypeLessThanOrEqualTo(Integer value) {
			addCriterion("laup_ptype <=", value, "ptype");
			return (Criteria) this;
		}

		public Criteria andPtypeNotBetween(Integer value1, Integer value2) {
			addCriterion("laup_ptype not between", value1, value2, "ptype");
			return (Criteria) this;
		}

		public Criteria andPtypeNotEqualTo(Integer value) {
			addCriterion("laup_ptype <>", value, "ptype");
			return (Criteria) this;
		}

		public Criteria andPtypeNotIn(List<Integer> values) {
			addCriterion("laup_ptype not in", values, "ptype");
			return (Criteria) this;
		}

		public Criteria andRemainCountBetween(Integer value1, Integer value2) {
			addCriterion("laup_remain_count between", value1, value2,
					"remainCount");
			return (Criteria) this;
		}

		public Criteria andRemainCountEqualTo(Integer value) {
			addCriterion("laup_remain_count =", value, "remainCount");
			return (Criteria) this;
		}

		public Criteria andRemainCountGreaterThan(Integer value) {
			addCriterion("laup_remain_count >", value, "remainCount");
			return (Criteria) this;
		}

		public Criteria andRemainCountGreaterThanOrEqualTo(Integer value) {
			addCriterion("laup_remain_count >=", value, "remainCount");
			return (Criteria) this;
		}

		public Criteria andRemainCountIn(List<Integer> values) {
			addCriterion("laup_remain_count in", values, "remainCount");
			return (Criteria) this;
		}

		public Criteria andRemainCountIsNotNull() {
			addCriterion("laup_remain_count is not null");
			return (Criteria) this;
		}

		public Criteria andRemainCountIsNull() {
			addCriterion("laup_remain_count is null");
			return (Criteria) this;
		}

		public Criteria andRemainCountLessThan(Integer value) {
			addCriterion("laup_remain_count <", value, "remainCount");
			return (Criteria) this;
		}

		public Criteria andRemainCountLessThanOrEqualTo(Integer value) {
			addCriterion("laup_remain_count <=", value, "remainCount");
			return (Criteria) this;
		}

		public Criteria andRemainCountNotBetween(Integer value1, Integer value2) {
			addCriterion("laup_remain_count not between", value1, value2,
					"remainCount");
			return (Criteria) this;
		}

		public Criteria andRemainCountNotEqualTo(Integer value) {
			addCriterion("laup_remain_count <>", value, "remainCount");
			return (Criteria) this;
		}

		public Criteria andRemainCountNotIn(List<Integer> values) {
			addCriterion("laup_remain_count not in", values, "remainCount");
			return (Criteria) this;
		}

		public Criteria andStartdateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("laup_startdate between", value1, value2,
					"startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateEqualTo(Date value) {
			addCriterionForJDBCDate("laup_startdate =", value, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateGreaterThan(Date value) {
			addCriterionForJDBCDate("laup_startdate >", value, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("laup_startdate >=", value, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateIn(List<Date> values) {
			addCriterionForJDBCDate("laup_startdate in", values, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateIsNotNull() {
			addCriterion("laup_startdate is not null");
			return (Criteria) this;
		}

		public Criteria andStartdateIsNull() {
			addCriterion("laup_startdate is null");
			return (Criteria) this;
		}

		public Criteria andStartdateLessThan(Date value) {
			addCriterionForJDBCDate("laup_startdate <", value, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("laup_startdate <=", value, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("laup_startdate not between", value1,
					value2, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateNotEqualTo(Date value) {
			addCriterionForJDBCDate("laup_startdate <>", value, "startdate");
			return (Criteria) this;
		}

		public Criteria andStartdateNotIn(List<Date> values) {
			addCriterionForJDBCDate("laup_startdate not in", values,
					"startdate");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(String value1, String value2) {
			addCriterion("laup_type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(String value) {
			addCriterion("laup_type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(String value) {
			addCriterion("laup_type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(String value) {
			addCriterion("laup_type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<String> values) {
			addCriterion("laup_type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("laup_type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("laup_type is null");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(String value) {
			addCriterion("laup_type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(String value) {
			addCriterion("laup_type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLike(String value) {
			addCriterion("laup_type like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(String value1, String value2) {
			addCriterion("laup_type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(String value) {
			addCriterion("laup_type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<String> values) {
			addCriterion("laup_type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotLike(String value) {
			addCriterion("laup_type not like", value, "type");
			return (Criteria) this;
		}

		public Criteria andUidBetween(Integer value1, Integer value2) {
			addCriterion("laup_uid between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andUidEqualTo(Integer value) {
			addCriterion("laup_uid =", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThan(Integer value) {
			addCriterion("laup_uid >", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThanOrEqualTo(Integer value) {
			addCriterion("laup_uid >=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidIn(List<Integer> values) {
			addCriterion("laup_uid in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidIsNotNull() {
			addCriterion("laup_uid is not null");
			return (Criteria) this;
		}

		public Criteria andUidIsNull() {
			addCriterion("laup_uid is null");
			return (Criteria) this;
		}

		public Criteria andUidLessThan(Integer value) {
			addCriterion("laup_uid <", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThanOrEqualTo(Integer value) {
			addCriterion("laup_uid <=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotBetween(Integer value1, Integer value2) {
			addCriterion("laup_uid not between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotEqualTo(Integer value) {
			addCriterion("laup_uid <>", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotIn(List<Integer> values) {
			addCriterion("laup_uid not in", values, "uid");
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