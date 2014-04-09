package com.vesmile.webappla.dao.mybatis.example;

import java.util.ArrayList;
import java.util.List;

import com.vesmile.framework.dao.mybatis.BaseExample;
import com.vesmile.framework.dao.mybatis.Criterion;

public class UserRightExample extends BaseExample<UserRightExample.Criteria> {
	
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
			addCriterion("laur_id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("laur_id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("laur_id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("laur_id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("laur_id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("laur_id is not null");
			return (Criteria) this;
		}

		public Criteria andIdIsNull() {
			addCriterion("laur_id is null");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("laur_id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("laur_id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("laur_id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("laur_id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("laur_id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andMidBetween(Integer value1, Integer value2) {
			addCriterion("laur_mid between", value1, value2, "mid");
			return (Criteria) this;
		}

		public Criteria andMidEqualTo(Integer value) {
			addCriterion("laur_mid =", value, "mid");
			return (Criteria) this;
		}

		public Criteria andMidGreaterThan(Integer value) {
			addCriterion("laur_mid >", value, "mid");
			return (Criteria) this;
		}

		public Criteria andMidGreaterThanOrEqualTo(Integer value) {
			addCriterion("laur_mid >=", value, "mid");
			return (Criteria) this;
		}

		public Criteria andMidIn(List<Integer> values) {
			addCriterion("laur_mid in", values, "mid");
			return (Criteria) this;
		}

		public Criteria andMidIsNotNull() {
			addCriterion("laur_mid is not null");
			return (Criteria) this;
		}

		public Criteria andMidIsNull() {
			addCriterion("laur_mid is null");
			return (Criteria) this;
		}

		public Criteria andMidLessThan(Integer value) {
			addCriterion("laur_mid <", value, "mid");
			return (Criteria) this;
		}

		public Criteria andMidLessThanOrEqualTo(Integer value) {
			addCriterion("laur_mid <=", value, "mid");
			return (Criteria) this;
		}

		public Criteria andMidNotBetween(Integer value1, Integer value2) {
			addCriterion("laur_mid not between", value1, value2, "mid");
			return (Criteria) this;
		}

		public Criteria andMidNotEqualTo(Integer value) {
			addCriterion("laur_mid <>", value, "mid");
			return (Criteria) this;
		}

		public Criteria andMidNotIn(List<Integer> values) {
			addCriterion("laur_mid not in", values, "mid");
			return (Criteria) this;
		}

		public Criteria andMtypeBetween(Integer value1, Integer value2) {
			addCriterion("laur_mtype between", value1, value2, "mtype");
			return (Criteria) this;
		}

		public Criteria andMtypeEqualTo(Integer value) {
			addCriterion("laur_mtype =", value, "mtype");
			return (Criteria) this;
		}

		public Criteria andMtypeGreaterThan(Integer value) {
			addCriterion("laur_mtype >", value, "mtype");
			return (Criteria) this;
		}

		public Criteria andMtypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("laur_mtype >=", value, "mtype");
			return (Criteria) this;
		}

		public Criteria andMtypeIn(List<Integer> values) {
			addCriterion("laur_mtype in", values, "mtype");
			return (Criteria) this;
		}

		public Criteria andMtypeIsNotNull() {
			addCriterion("laur_mtype is not null");
			return (Criteria) this;
		}

		public Criteria andMtypeIsNull() {
			addCriterion("laur_mtype is null");
			return (Criteria) this;
		}

		public Criteria andMtypeLessThan(Integer value) {
			addCriterion("laur_mtype <", value, "mtype");
			return (Criteria) this;
		}

		public Criteria andMtypeLessThanOrEqualTo(Integer value) {
			addCriterion("laur_mtype <=", value, "mtype");
			return (Criteria) this;
		}

		public Criteria andMtypeNotBetween(Integer value1, Integer value2) {
			addCriterion("laur_mtype not between", value1, value2, "mtype");
			return (Criteria) this;
		}

		public Criteria andMtypeNotEqualTo(Integer value) {
			addCriterion("laur_mtype <>", value, "mtype");
			return (Criteria) this;
		}

		public Criteria andMtypeNotIn(List<Integer> values) {
			addCriterion("laur_mtype not in", values, "mtype");
			return (Criteria) this;
		}

		public Criteria andUidBetween(Integer value1, Integer value2) {
			addCriterion("laur_uid between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andUidEqualTo(Integer value) {
			addCriterion("laur_uid =", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThan(Integer value) {
			addCriterion("laur_uid >", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThanOrEqualTo(Integer value) {
			addCriterion("laur_uid >=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidIn(List<Integer> values) {
			addCriterion("laur_uid in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidIsNotNull() {
			addCriterion("laur_uid is not null");
			return (Criteria) this;
		}

		public Criteria andUidIsNull() {
			addCriterion("laur_uid is null");
			return (Criteria) this;
		}

		public Criteria andUidLessThan(Integer value) {
			addCriterion("laur_uid <", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThanOrEqualTo(Integer value) {
			addCriterion("laur_uid <=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotBetween(Integer value1, Integer value2) {
			addCriterion("laur_uid not between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotEqualTo(Integer value) {
			addCriterion("laur_uid <>", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotIn(List<Integer> values) {
			addCriterion("laur_uid not in", values, "uid");
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