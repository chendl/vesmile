package com.vesmile.webappla.dao.mybatis.example;

import java.util.ArrayList;
import java.util.List;

import com.vesmile.framework.dao.mybatis.BaseExample;
import com.vesmile.framework.dao.mybatis.Criterion;

public class PropertyParamExample extends
		BaseExample<PropertyParamExample.Criteria> {

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

		public Criteria andCodeBetween(String value1, String value2) {
			addCriterion("lapp_code between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeEqualTo(String value) {
			addCriterion("lapp_code =", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThan(String value) {
			addCriterion("lapp_code >", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThanOrEqualTo(String value) {
			addCriterion("lapp_code >=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIn(List<String> values) {
			addCriterion("lapp_code in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIsNotNull() {
			addCriterion("lapp_code is not null");
			return (Criteria) this;
		}

		public Criteria andCodeIsNull() {
			addCriterion("lapp_code is null");
			return (Criteria) this;
		}

		public Criteria andCodeLessThan(String value) {
			addCriterion("lapp_code <", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThanOrEqualTo(String value) {
			addCriterion("lapp_code <=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLike(String value) {
			addCriterion("lapp_code like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotBetween(String value1, String value2) {
			addCriterion("lapp_code not between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotEqualTo(String value) {
			addCriterion("lapp_code <>", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotIn(List<String> values) {
			addCriterion("lapp_code not in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotLike(String value) {
			addCriterion("lapp_code not like", value, "code");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("lapp_id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("lapp_id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("lapp_id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("lapp_id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("lapp_id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("lapp_id is not null");
			return (Criteria) this;
		}

		public Criteria andIdIsNull() {
			addCriterion("lapp_id is null");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("lapp_id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("lapp_id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("lapp_id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("lapp_id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("lapp_id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andLapIdBetween(Integer value1, Integer value2) {
			addCriterion("lap_id between", value1, value2, "lapId");
			return (Criteria) this;
		}

		public Criteria andLapIdEqualTo(Integer value) {
			addCriterion("lap_id =", value, "lapId");
			return (Criteria) this;
		}

		public Criteria andLapIdGreaterThan(Integer value) {
			addCriterion("lap_id >", value, "lapId");
			return (Criteria) this;
		}

		public Criteria andLapIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("lap_id >=", value, "lapId");
			return (Criteria) this;
		}

		public Criteria andLapIdIn(List<Integer> values) {
			addCriterion("lap_id in", values, "lapId");
			return (Criteria) this;
		}

		public Criteria andLapIdIsNotNull() {
			addCriterion("lap_id is not null");
			return (Criteria) this;
		}

		public Criteria andLapIdIsNull() {
			addCriterion("lap_id is null");
			return (Criteria) this;
		}

		public Criteria andLapIdLessThan(Integer value) {
			addCriterion("lap_id <", value, "lapId");
			return (Criteria) this;
		}

		public Criteria andLapIdLessThanOrEqualTo(Integer value) {
			addCriterion("lap_id <=", value, "lapId");
			return (Criteria) this;
		}

		public Criteria andLapIdNotBetween(Integer value1, Integer value2) {
			addCriterion("lap_id not between", value1, value2, "lapId");
			return (Criteria) this;
		}

		public Criteria andLapIdNotEqualTo(Integer value) {
			addCriterion("lap_id <>", value, "lapId");
			return (Criteria) this;
		}

		public Criteria andLapIdNotIn(List<Integer> values) {
			addCriterion("lap_id not in", values, "lapId");
			return (Criteria) this;
		}

		public Criteria andOrderBetween(Integer value1, Integer value2) {
			addCriterion("lapp_order between", value1, value2, "order");
			return (Criteria) this;
		}

		public Criteria andOrderEqualTo(Integer value) {
			addCriterion("lapp_order =", value, "order");
			return (Criteria) this;
		}

		public Criteria andOrderGreaterThan(Integer value) {
			addCriterion("lapp_order >", value, "order");
			return (Criteria) this;
		}

		public Criteria andOrderGreaterThanOrEqualTo(Integer value) {
			addCriterion("lapp_order >=", value, "order");
			return (Criteria) this;
		}

		public Criteria andOrderIn(List<Integer> values) {
			addCriterion("lapp_order in", values, "order");
			return (Criteria) this;
		}

		public Criteria andOrderIsNotNull() {
			addCriterion("lapp_order is not null");
			return (Criteria) this;
		}

		public Criteria andOrderIsNull() {
			addCriterion("lapp_order is null");
			return (Criteria) this;
		}

		public Criteria andOrderLessThan(Integer value) {
			addCriterion("lapp_order <", value, "order");
			return (Criteria) this;
		}

		public Criteria andOrderLessThanOrEqualTo(Integer value) {
			addCriterion("lapp_order <=", value, "order");
			return (Criteria) this;
		}

		public Criteria andOrderNotBetween(Integer value1, Integer value2) {
			addCriterion("lapp_order not between", value1, value2, "order");
			return (Criteria) this;
		}

		public Criteria andOrderNotEqualTo(Integer value) {
			addCriterion("lapp_order <>", value, "order");
			return (Criteria) this;
		}

		public Criteria andOrderNotIn(List<Integer> values) {
			addCriterion("lapp_order not in", values, "order");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(String value1, String value2) {
			addCriterion("lapp_type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(String value) {
			addCriterion("lapp_type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(String value) {
			addCriterion("lapp_type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(String value) {
			addCriterion("lapp_type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<String> values) {
			addCriterion("lapp_type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("lapp_type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("lapp_type is null");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(String value) {
			addCriterion("lapp_type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(String value) {
			addCriterion("lapp_type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLike(String value) {
			addCriterion("lapp_type like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(String value1, String value2) {
			addCriterion("lapp_type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(String value) {
			addCriterion("lapp_type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<String> values) {
			addCriterion("lapp_type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotLike(String value) {
			addCriterion("lapp_type not like", value, "type");
			return (Criteria) this;
		}

		public Criteria andValueBetween(String value1, String value2) {
			addCriterion("lapp_value between", value1, value2, "value");
			return (Criteria) this;
		}

		public Criteria andValueEqualTo(String value) {
			addCriterion("lapp_value =", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueGreaterThan(String value) {
			addCriterion("lapp_value >", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueGreaterThanOrEqualTo(String value) {
			addCriterion("lapp_value >=", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueIn(List<String> values) {
			addCriterion("lapp_value in", values, "value");
			return (Criteria) this;
		}

		public Criteria andValueIsNotNull() {
			addCriterion("lapp_value is not null");
			return (Criteria) this;
		}

		public Criteria andValueIsNull() {
			addCriterion("lapp_value is null");
			return (Criteria) this;
		}

		public Criteria andValueLessThan(String value) {
			addCriterion("lapp_value <", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueLessThanOrEqualTo(String value) {
			addCriterion("lapp_value <=", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueLike(String value) {
			addCriterion("lapp_value like", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueNotBetween(String value1, String value2) {
			addCriterion("lapp_value not between", value1, value2, "value");
			return (Criteria) this;
		}

		public Criteria andValueNotEqualTo(String value) {
			addCriterion("lapp_value <>", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueNotIn(List<String> values) {
			addCriterion("lapp_value not in", values, "value");
			return (Criteria) this;
		}

		public Criteria andValueNotLike(String value) {
			addCriterion("lapp_value not like", value, "value");
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