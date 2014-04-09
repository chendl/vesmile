package com.vesmile.webappla.dao.mybatis.example;

import java.util.ArrayList;
import java.util.List;

import com.vesmile.framework.dao.mybatis.BaseExample;
import com.vesmile.framework.dao.mybatis.Criterion;

public class MenuExample extends BaseExample<MenuExample.Criteria> {

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
			addCriterion("lam_code between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeEqualTo(String value) {
			addCriterion("lam_code =", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThan(String value) {
			addCriterion("lam_code >", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThanOrEqualTo(String value) {
			addCriterion("lam_code >=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIn(List<String> values) {
			addCriterion("lam_code in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIsNotNull() {
			addCriterion("lam_code is not null");
			return (Criteria) this;
		}

		public Criteria andCodeIsNull() {
			addCriterion("lam_code is null");
			return (Criteria) this;
		}

		public Criteria andCodeLessThan(String value) {
			addCriterion("lam_code <", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThanOrEqualTo(String value) {
			addCriterion("lam_code <=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLike(String value) {
			addCriterion("lam_code like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotBetween(String value1, String value2) {
			addCriterion("lam_code not between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotEqualTo(String value) {
			addCriterion("lam_code <>", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotIn(List<String> values) {
			addCriterion("lam_code not in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotLike(String value) {
			addCriterion("lam_code not like", value, "code");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("lam_id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("lam_id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("lam_id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("lam_id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("lam_id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("lam_id is not null");
			return (Criteria) this;
		}

		public Criteria andIdIsNull() {
			addCriterion("lam_id is null");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("lam_id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("lam_id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("lam_id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("lam_id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("lam_id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andLvlBetween(Integer value1, Integer value2) {
			addCriterion("lam_lvl between", value1, value2, "lvl");
			return (Criteria) this;
		}

		public Criteria andLvlEqualTo(Integer value) {
			addCriterion("lam_lvl =", value, "lvl");
			return (Criteria) this;
		}

		public Criteria andLvlGreaterThan(Integer value) {
			addCriterion("lam_lvl >", value, "lvl");
			return (Criteria) this;
		}

		public Criteria andLvlGreaterThanOrEqualTo(Integer value) {
			addCriterion("lam_lvl >=", value, "lvl");
			return (Criteria) this;
		}

		public Criteria andLvlIn(List<Integer> values) {
			addCriterion("lam_lvl in", values, "lvl");
			return (Criteria) this;
		}

		public Criteria andLvlIsNotNull() {
			addCriterion("lam_lvl is not null");
			return (Criteria) this;
		}

		public Criteria andLvlIsNull() {
			addCriterion("lam_lvl is null");
			return (Criteria) this;
		}

		public Criteria andLvlLessThan(Integer value) {
			addCriterion("lam_lvl <", value, "lvl");
			return (Criteria) this;
		}

		public Criteria andLvlLessThanOrEqualTo(Integer value) {
			addCriterion("lam_lvl <=", value, "lvl");
			return (Criteria) this;
		}

		public Criteria andLvlNotBetween(Integer value1, Integer value2) {
			addCriterion("lam_lvl not between", value1, value2, "lvl");
			return (Criteria) this;
		}

		public Criteria andLvlNotEqualTo(Integer value) {
			addCriterion("lam_lvl <>", value, "lvl");
			return (Criteria) this;
		}

		public Criteria andLvlNotIn(List<Integer> values) {
			addCriterion("lam_lvl not in", values, "lvl");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("lam_name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("lam_name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("lam_name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("lam_name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("lam_name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("lam_name is not null");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("lam_name is null");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("lam_name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("lam_name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("lam_name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("lam_name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("lam_name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("lam_name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("lam_name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andOrderBetween(Integer value1, Integer value2) {
			addCriterion("lam_order between", value1, value2, "order");
			return (Criteria) this;
		}

		public Criteria andOrderEqualTo(Integer value) {
			addCriterion("lam_order =", value, "order");
			return (Criteria) this;
		}

		public Criteria andOrderGreaterThan(Integer value) {
			addCriterion("lam_order >", value, "order");
			return (Criteria) this;
		}

		public Criteria andOrderGreaterThanOrEqualTo(Integer value) {
			addCriterion("lam_order >=", value, "order");
			return (Criteria) this;
		}

		public Criteria andOrderIn(List<Integer> values) {
			addCriterion("lam_order in", values, "order");
			return (Criteria) this;
		}

		public Criteria andOrderIsNotNull() {
			addCriterion("lam_order is not null");
			return (Criteria) this;
		}

		public Criteria andOrderIsNull() {
			addCriterion("lam_order is null");
			return (Criteria) this;
		}

		public Criteria andOrderLessThan(Integer value) {
			addCriterion("lam_order <", value, "order");
			return (Criteria) this;
		}

		public Criteria andOrderLessThanOrEqualTo(Integer value) {
			addCriterion("lam_order <=", value, "order");
			return (Criteria) this;
		}

		public Criteria andOrderNotBetween(Integer value1, Integer value2) {
			addCriterion("lam_order not between", value1, value2, "order");
			return (Criteria) this;
		}

		public Criteria andOrderNotEqualTo(Integer value) {
			addCriterion("lam_order <>", value, "order");
			return (Criteria) this;
		}

		public Criteria andOrderNotIn(List<Integer> values) {
			addCriterion("lam_order not in", values, "order");
			return (Criteria) this;
		}

		public Criteria andParentBetween(Integer value1, Integer value2) {
			addCriterion("lam_parent between", value1, value2, "parent");
			return (Criteria) this;
		}

		public Criteria andParentEqualTo(Integer value) {
			addCriterion("lam_parent =", value, "parent");
			return (Criteria) this;
		}

		public Criteria andParentGreaterThan(Integer value) {
			addCriterion("lam_parent >", value, "parent");
			return (Criteria) this;
		}

		public Criteria andParentGreaterThanOrEqualTo(Integer value) {
			addCriterion("lam_parent >=", value, "parent");
			return (Criteria) this;
		}

		public Criteria andParentIn(List<Integer> values) {
			addCriterion("lam_parent in", values, "parent");
			return (Criteria) this;
		}

		public Criteria andParentIsNotNull() {
			addCriterion("lam_parent is not null");
			return (Criteria) this;
		}

		public Criteria andParentIsNull() {
			addCriterion("lam_parent is null");
			return (Criteria) this;
		}

		public Criteria andParentLessThan(Integer value) {
			addCriterion("lam_parent <", value, "parent");
			return (Criteria) this;
		}

		public Criteria andParentLessThanOrEqualTo(Integer value) {
			addCriterion("lam_parent <=", value, "parent");
			return (Criteria) this;
		}

		public Criteria andParentNotBetween(Integer value1, Integer value2) {
			addCriterion("lam_parent not between", value1, value2, "parent");
			return (Criteria) this;
		}

		public Criteria andParentNotEqualTo(Integer value) {
			addCriterion("lam_parent <>", value, "parent");
			return (Criteria) this;
		}

		public Criteria andParentNotIn(List<Integer> values) {
			addCriterion("lam_parent not in", values, "parent");
			return (Criteria) this;
		}

		public Criteria andTipsBetween(String value1, String value2) {
			addCriterion("lam_tips between", value1, value2, "tips");
			return (Criteria) this;
		}

		public Criteria andTipsEqualTo(String value) {
			addCriterion("lam_tips =", value, "tips");
			return (Criteria) this;
		}

		public Criteria andTipsGreaterThan(String value) {
			addCriterion("lam_tips >", value, "tips");
			return (Criteria) this;
		}

		public Criteria andTipsGreaterThanOrEqualTo(String value) {
			addCriterion("lam_tips >=", value, "tips");
			return (Criteria) this;
		}

		public Criteria andTipsIn(List<String> values) {
			addCriterion("lam_tips in", values, "tips");
			return (Criteria) this;
		}

		public Criteria andTipsIsNotNull() {
			addCriterion("lam_tips is not null");
			return (Criteria) this;
		}

		public Criteria andTipsIsNull() {
			addCriterion("lam_tips is null");
			return (Criteria) this;
		}

		public Criteria andTipsLessThan(String value) {
			addCriterion("lam_tips <", value, "tips");
			return (Criteria) this;
		}

		public Criteria andTipsLessThanOrEqualTo(String value) {
			addCriterion("lam_tips <=", value, "tips");
			return (Criteria) this;
		}

		public Criteria andTipsLike(String value) {
			addCriterion("lam_tips like", value, "tips");
			return (Criteria) this;
		}

		public Criteria andTipsNotBetween(String value1, String value2) {
			addCriterion("lam_tips not between", value1, value2, "tips");
			return (Criteria) this;
		}

		public Criteria andTipsNotEqualTo(String value) {
			addCriterion("lam_tips <>", value, "tips");
			return (Criteria) this;
		}

		public Criteria andTipsNotIn(List<String> values) {
			addCriterion("lam_tips not in", values, "tips");
			return (Criteria) this;
		}

		public Criteria andTipsNotLike(String value) {
			addCriterion("lam_tips not like", value, "tips");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(Integer value1, Integer value2) {
			addCriterion("lam_type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(Integer value) {
			addCriterion("lam_type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(Integer value) {
			addCriterion("lam_type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("lam_type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<Integer> values) {
			addCriterion("lam_type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("lam_type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("lam_type is null");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(Integer value) {
			addCriterion("lam_type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(Integer value) {
			addCriterion("lam_type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("lam_type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(Integer value) {
			addCriterion("lam_type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<Integer> values) {
			addCriterion("lam_type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andUrlBetween(String value1, String value2) {
			addCriterion("lam_url between", value1, value2, "url");
			return (Criteria) this;
		}

		public Criteria andUrlEqualTo(String value) {
			addCriterion("lam_url =", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlGreaterThan(String value) {
			addCriterion("lam_url >", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlGreaterThanOrEqualTo(String value) {
			addCriterion("lam_url >=", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlIn(List<String> values) {
			addCriterion("lam_url in", values, "url");
			return (Criteria) this;
		}

		public Criteria andUrlIsNotNull() {
			addCriterion("lam_url is not null");
			return (Criteria) this;
		}

		public Criteria andUrlIsNull() {
			addCriterion("lam_url is null");
			return (Criteria) this;
		}

		public Criteria andUrlLessThan(String value) {
			addCriterion("lam_url <", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLessThanOrEqualTo(String value) {
			addCriterion("lam_url <=", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLike(String value) {
			addCriterion("lam_url like", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotBetween(String value1, String value2) {
			addCriterion("lam_url not between", value1, value2, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotEqualTo(String value) {
			addCriterion("lam_url <>", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotIn(List<String> values) {
			addCriterion("lam_url not in", values, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotLike(String value) {
			addCriterion("lam_url not like", value, "url");
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