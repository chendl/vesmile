package com.vesmile.webappla.dao.mybatis.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.vesmile.framework.dao.mybatis.BaseExample;
import com.vesmile.framework.dao.mybatis.Criterion;

public class LogExample extends BaseExample<LogExample.Criteria> {

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

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("lal_id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("lal_id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("lal_id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("lal_id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("lal_id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("lal_id is not null");
			return (Criteria) this;
		}

		public Criteria andIdIsNull() {
			addCriterion("lal_id is null");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("lal_id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("lal_id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("lal_id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("lal_id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("lal_id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andMemoBetween(String value1, String value2) {
			addCriterion("lal_memo between", value1, value2, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoEqualTo(String value) {
			addCriterion("lal_memo =", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoGreaterThan(String value) {
			addCriterion("lal_memo >", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoGreaterThanOrEqualTo(String value) {
			addCriterion("lal_memo >=", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoIn(List<String> values) {
			addCriterion("lal_memo in", values, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoIsNotNull() {
			addCriterion("lal_memo is not null");
			return (Criteria) this;
		}

		public Criteria andMemoIsNull() {
			addCriterion("lal_memo is null");
			return (Criteria) this;
		}

		public Criteria andMemoLessThan(String value) {
			addCriterion("lal_memo <", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoLessThanOrEqualTo(String value) {
			addCriterion("lal_memo <=", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoLike(String value) {
			addCriterion("lal_memo like", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoNotBetween(String value1, String value2) {
			addCriterion("lal_memo not between", value1, value2, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoNotEqualTo(String value) {
			addCriterion("lal_memo <>", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoNotIn(List<String> values) {
			addCriterion("lal_memo not in", values, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoNotLike(String value) {
			addCriterion("lal_memo not like", value, "memo");
			return (Criteria) this;
		}

		public Criteria andOpreBetween(String value1, String value2) {
			addCriterion("lal_opre between", value1, value2, "opre");
			return (Criteria) this;
		}

		public Criteria andOpreEqualTo(String value) {
			addCriterion("lal_opre =", value, "opre");
			return (Criteria) this;
		}

		public Criteria andOpreGreaterThan(String value) {
			addCriterion("lal_opre >", value, "opre");
			return (Criteria) this;
		}

		public Criteria andOpreGreaterThanOrEqualTo(String value) {
			addCriterion("lal_opre >=", value, "opre");
			return (Criteria) this;
		}

		public Criteria andOpreIn(List<String> values) {
			addCriterion("lal_opre in", values, "opre");
			return (Criteria) this;
		}

		public Criteria andOpreIsNotNull() {
			addCriterion("lal_opre is not null");
			return (Criteria) this;
		}

		public Criteria andOpreIsNull() {
			addCriterion("lal_opre is null");
			return (Criteria) this;
		}

		public Criteria andOpreLessThan(String value) {
			addCriterion("lal_opre <", value, "opre");
			return (Criteria) this;
		}

		public Criteria andOpreLessThanOrEqualTo(String value) {
			addCriterion("lal_opre <=", value, "opre");
			return (Criteria) this;
		}

		public Criteria andOpreLike(String value) {
			addCriterion("lal_opre like", value, "opre");
			return (Criteria) this;
		}

		public Criteria andOpreNotBetween(String value1, String value2) {
			addCriterion("lal_opre not between", value1, value2, "opre");
			return (Criteria) this;
		}

		public Criteria andOpreNotEqualTo(String value) {
			addCriterion("lal_opre <>", value, "opre");
			return (Criteria) this;
		}

		public Criteria andOpreNotIn(List<String> values) {
			addCriterion("lal_opre not in", values, "opre");
			return (Criteria) this;
		}

		public Criteria andOpreNotLike(String value) {
			addCriterion("lal_opre not like", value, "opre");
			return (Criteria) this;
		}

		public Criteria andOpreTimeBetween(Date value1, Date value2) {
			addCriterion("lal_opre_time between", value1, value2, "opreTime");
			return (Criteria) this;
		}

		public Criteria andOpreTimeEqualTo(Date value) {
			addCriterion("lal_opre_time =", value, "opreTime");
			return (Criteria) this;
		}

		public Criteria andOpreTimeGreaterThan(Date value) {
			addCriterion("lal_opre_time >", value, "opreTime");
			return (Criteria) this;
		}

		public Criteria andOpreTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("lal_opre_time >=", value, "opreTime");
			return (Criteria) this;
		}

		public Criteria andOpreTimeIn(List<Date> values) {
			addCriterion("lal_opre_time in", values, "opreTime");
			return (Criteria) this;
		}

		public Criteria andOpreTimeIsNotNull() {
			addCriterion("lal_opre_time is not null");
			return (Criteria) this;
		}

		public Criteria andOpreTimeIsNull() {
			addCriterion("lal_opre_time is null");
			return (Criteria) this;
		}

		public Criteria andOpreTimeLessThan(Date value) {
			addCriterion("lal_opre_time <", value, "opreTime");
			return (Criteria) this;
		}

		public Criteria andOpreTimeLessThanOrEqualTo(Date value) {
			addCriterion("lal_opre_time <=", value, "opreTime");
			return (Criteria) this;
		}

		public Criteria andOpreTimeNotBetween(Date value1, Date value2) {
			addCriterion("lal_opre_time not between", value1, value2,
					"opreTime");
			return (Criteria) this;
		}

		public Criteria andOpreTimeNotEqualTo(Date value) {
			addCriterion("lal_opre_time <>", value, "opreTime");
			return (Criteria) this;
		}

		public Criteria andOpreTimeNotIn(List<Date> values) {
			addCriterion("lal_opre_time not in", values, "opreTime");
			return (Criteria) this;
		}

		public Criteria andUidBetween(Integer value1, Integer value2) {
			addCriterion("lal_uid between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andUidEqualTo(Integer value) {
			addCriterion("lal_uid =", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThan(Integer value) {
			addCriterion("lal_uid >", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThanOrEqualTo(Integer value) {
			addCriterion("lal_uid >=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidIn(List<Integer> values) {
			addCriterion("lal_uid in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidIsNotNull() {
			addCriterion("lal_uid is not null");
			return (Criteria) this;
		}

		public Criteria andUidIsNull() {
			addCriterion("lal_uid is null");
			return (Criteria) this;
		}

		public Criteria andUidLessThan(Integer value) {
			addCriterion("lal_uid <", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThanOrEqualTo(Integer value) {
			addCriterion("lal_uid <=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotBetween(Integer value1, Integer value2) {
			addCriterion("lal_uid not between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotEqualTo(Integer value) {
			addCriterion("lal_uid <>", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotIn(List<Integer> values) {
			addCriterion("lal_uid not in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUnameBetween(String value1, String value2) {
			addCriterion("lal_uname between", value1, value2, "uname");
			return (Criteria) this;
		}

		public Criteria andUnameEqualTo(String value) {
			addCriterion("lal_uname =", value, "uname");
			return (Criteria) this;
		}

		public Criteria andUnameGreaterThan(String value) {
			addCriterion("lal_uname >", value, "uname");
			return (Criteria) this;
		}

		public Criteria andUnameGreaterThanOrEqualTo(String value) {
			addCriterion("lal_uname >=", value, "uname");
			return (Criteria) this;
		}

		public Criteria andUnameIn(List<String> values) {
			addCriterion("lal_uname in", values, "uname");
			return (Criteria) this;
		}

		public Criteria andUnameIsNotNull() {
			addCriterion("lal_uname is not null");
			return (Criteria) this;
		}

		public Criteria andUnameIsNull() {
			addCriterion("lal_uname is null");
			return (Criteria) this;
		}

		public Criteria andUnameLessThan(String value) {
			addCriterion("lal_uname <", value, "uname");
			return (Criteria) this;
		}

		public Criteria andUnameLessThanOrEqualTo(String value) {
			addCriterion("lal_uname <=", value, "uname");
			return (Criteria) this;
		}

		public Criteria andUnameLike(String value) {
			addCriterion("lal_uname like", value, "uname");
			return (Criteria) this;
		}

		public Criteria andUnameNotBetween(String value1, String value2) {
			addCriterion("lal_uname not between", value1, value2, "uname");
			return (Criteria) this;
		}

		public Criteria andUnameNotEqualTo(String value) {
			addCriterion("lal_uname <>", value, "uname");
			return (Criteria) this;
		}

		public Criteria andUnameNotIn(List<String> values) {
			addCriterion("lal_uname not in", values, "uname");
			return (Criteria) this;
		}

		public Criteria andUnameNotLike(String value) {
			addCriterion("lal_uname not like", value, "uname");
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
	}
}