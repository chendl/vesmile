package com.vesmile.webappla.dao.mybatis.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.vesmile.framework.dao.mybatis.BaseExample;
import com.vesmile.framework.dao.mybatis.Criterion;

public class ViewHistoryExample extends
		BaseExample<ViewHistoryExample.Criteria> {

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

		public Criteria andHidBetween(Integer value1, Integer value2) {
			addCriterion("lavh_hid between", value1, value2, "hid");
			return (Criteria) this;
		}

		public Criteria andHidEqualTo(Integer value) {
			addCriterion("lavh_hid =", value, "hid");
			return (Criteria) this;
		}

		public Criteria andHidGreaterThan(Integer value) {
			addCriterion("lavh_hid >", value, "hid");
			return (Criteria) this;
		}

		public Criteria andHidGreaterThanOrEqualTo(Integer value) {
			addCriterion("lavh_hid >=", value, "hid");
			return (Criteria) this;
		}

		public Criteria andHidIn(List<Integer> values) {
			addCriterion("lavh_hid in", values, "hid");
			return (Criteria) this;
		}

		public Criteria andHidIsNotNull() {
			addCriterion("lavh_hid is not null");
			return (Criteria) this;
		}

		public Criteria andHidIsNull() {
			addCriterion("lavh_hid is null");
			return (Criteria) this;
		}

		public Criteria andHidLessThan(Integer value) {
			addCriterion("lavh_hid <", value, "hid");
			return (Criteria) this;
		}

		public Criteria andHidLessThanOrEqualTo(Integer value) {
			addCriterion("lavh_hid <=", value, "hid");
			return (Criteria) this;
		}

		public Criteria andHidNotBetween(Integer value1, Integer value2) {
			addCriterion("lavh_hid not between", value1, value2, "hid");
			return (Criteria) this;
		}

		public Criteria andHidNotEqualTo(Integer value) {
			addCriterion("lavh_hid <>", value, "hid");
			return (Criteria) this;
		}

		public Criteria andHidNotIn(List<Integer> values) {
			addCriterion("lavh_hid not in", values, "hid");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("lavh_id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("lavh_id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("lavh_id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("lavh_id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("lavh_id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("lavh_id is not null");
			return (Criteria) this;
		}

		public Criteria andIdIsNull() {
			addCriterion("lavh_id is null");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("lavh_id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("lavh_id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("lavh_id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("lavh_id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("lavh_id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andUidBetween(Integer value1, Integer value2) {
			addCriterion("lavh_uid between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andUidEqualTo(Integer value) {
			addCriterion("lavh_uid =", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThan(Integer value) {
			addCriterion("lavh_uid >", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThanOrEqualTo(Integer value) {
			addCriterion("lavh_uid >=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidIn(List<Integer> values) {
			addCriterion("lavh_uid in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidIsNotNull() {
			addCriterion("lavh_uid is not null");
			return (Criteria) this;
		}

		public Criteria andUidIsNull() {
			addCriterion("lavh_uid is null");
			return (Criteria) this;
		}

		public Criteria andUidLessThan(Integer value) {
			addCriterion("lavh_uid <", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThanOrEqualTo(Integer value) {
			addCriterion("lavh_uid <=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotBetween(Integer value1, Integer value2) {
			addCriterion("lavh_uid not between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotEqualTo(Integer value) {
			addCriterion("lavh_uid <>", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotIn(List<Integer> values) {
			addCriterion("lavh_uid not in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andViewtimeBetween(Date value1, Date value2) {
			addCriterion("lavh_viewtime between", value1, value2, "viewtime");
			return (Criteria) this;
		}

		public Criteria andViewtimeEqualTo(Date value) {
			addCriterion("lavh_viewtime =", value, "viewtime");
			return (Criteria) this;
		}

		public Criteria andViewtimeGreaterThan(Date value) {
			addCriterion("lavh_viewtime >", value, "viewtime");
			return (Criteria) this;
		}

		public Criteria andViewtimeGreaterThanOrEqualTo(Date value) {
			addCriterion("lavh_viewtime >=", value, "viewtime");
			return (Criteria) this;
		}

		public Criteria andViewtimeIn(List<Date> values) {
			addCriterion("lavh_viewtime in", values, "viewtime");
			return (Criteria) this;
		}

		public Criteria andViewtimeIsNotNull() {
			addCriterion("lavh_viewtime is not null");
			return (Criteria) this;
		}

		public Criteria andViewtimeIsNull() {
			addCriterion("lavh_viewtime is null");
			return (Criteria) this;
		}

		public Criteria andViewtimeLessThan(Date value) {
			addCriterion("lavh_viewtime <", value, "viewtime");
			return (Criteria) this;
		}

		public Criteria andViewtimeLessThanOrEqualTo(Date value) {
			addCriterion("lavh_viewtime <=", value, "viewtime");
			return (Criteria) this;
		}

		public Criteria andViewtimeNotBetween(Date value1, Date value2) {
			addCriterion("lavh_viewtime not between", value1, value2,
					"viewtime");
			return (Criteria) this;
		}

		public Criteria andViewtimeNotEqualTo(Date value) {
			addCriterion("lavh_viewtime <>", value, "viewtime");
			return (Criteria) this;
		}

		public Criteria andViewtimeNotIn(List<Date> values) {
			addCriterion("lavh_viewtime not in", values, "viewtime");
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