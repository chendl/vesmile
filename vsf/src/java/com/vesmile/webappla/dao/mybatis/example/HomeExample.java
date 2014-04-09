package com.vesmile.webappla.dao.mybatis.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.vesmile.framework.dao.mybatis.BaseExample;
import com.vesmile.framework.dao.mybatis.Criterion;

public class HomeExample extends BaseExample<HomeExample.Criteria> {

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

		public Criteria andAddressBetween(String value1, String value2) {
			addCriterion("lah_address between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andAddressEqualTo(String value) {
			addCriterion("lah_address =", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThan(String value) {
			addCriterion("lah_address >", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThanOrEqualTo(String value) {
			addCriterion("lah_address >=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressIn(List<String> values) {
			addCriterion("lah_address in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressIsNotNull() {
			addCriterion("lah_address is not null");
			return (Criteria) this;
		}

		public Criteria andAddressIsNull() {
			addCriterion("lah_address is null");
			return (Criteria) this;
		}

		public Criteria andAddressLessThan(String value) {
			addCriterion("lah_address <", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThanOrEqualTo(String value) {
			addCriterion("lah_address <=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLike(String value) {
			addCriterion("lah_address like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotBetween(String value1, String value2) {
			addCriterion("lah_address not between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotEqualTo(String value) {
			addCriterion("lah_address <>", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotIn(List<String> values) {
			addCriterion("lah_address not in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotLike(String value) {
			addCriterion("lah_address not like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAreaBetween(Integer value1, Integer value2) {
			addCriterion("lah_area between", value1, value2, "area");
			return (Criteria) this;
		}

		public Criteria andAreaEqualTo(Integer value) {
			addCriterion("lah_area =", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaGreaterThan(Integer value) {
			addCriterion("lah_area >", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
			addCriterion("lah_area >=", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaIn(List<Integer> values) {
			addCriterion("lah_area in", values, "area");
			return (Criteria) this;
		}

		public Criteria andAreaIsNotNull() {
			addCriterion("lah_area is not null");
			return (Criteria) this;
		}

		public Criteria andAreaIsNull() {
			addCriterion("lah_area is null");
			return (Criteria) this;
		}

		public Criteria andAreaLessThan(Integer value) {
			addCriterion("lah_area <", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaLessThanOrEqualTo(Integer value) {
			addCriterion("lah_area <=", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotBetween(Integer value1, Integer value2) {
			addCriterion("lah_area not between", value1, value2, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotEqualTo(Integer value) {
			addCriterion("lah_area <>", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotIn(List<Integer> values) {
			addCriterion("lah_area not in", values, "area");
			return (Criteria) this;
		}

		public Criteria andBuildAreaBetween(Long value1, Long value2) {
			addCriterion("lah_build_area between", value1, value2, "buildArea");
			return (Criteria) this;
		}

		public Criteria andBuildAreaEqualTo(Long value) {
			addCriterion("lah_build_area =", value, "buildArea");
			return (Criteria) this;
		}

		public Criteria andBuildAreaGreaterThan(Long value) {
			addCriterion("lah_build_area >", value, "buildArea");
			return (Criteria) this;
		}

		public Criteria andBuildAreaGreaterThanOrEqualTo(Long value) {
			addCriterion("lah_build_area >=", value, "buildArea");
			return (Criteria) this;
		}

		public Criteria andBuildAreaIn(List<Long> values) {
			addCriterion("lah_build_area in", values, "buildArea");
			return (Criteria) this;
		}

		public Criteria andBuildAreaIsNotNull() {
			addCriterion("lah_build_area is not null");
			return (Criteria) this;
		}

		public Criteria andBuildAreaIsNull() {
			addCriterion("lah_build_area is null");
			return (Criteria) this;
		}

		public Criteria andBuildAreaLessThan(Long value) {
			addCriterion("lah_build_area <", value, "buildArea");
			return (Criteria) this;
		}

		public Criteria andBuildAreaLessThanOrEqualTo(Long value) {
			addCriterion("lah_build_area <=", value, "buildArea");
			return (Criteria) this;
		}

		public Criteria andBuildAreaNotBetween(Long value1, Long value2) {
			addCriterion("lah_build_area not between", value1, value2,
					"buildArea");
			return (Criteria) this;
		}

		public Criteria andBuildAreaNotEqualTo(Long value) {
			addCriterion("lah_build_area <>", value, "buildArea");
			return (Criteria) this;
		}

		public Criteria andBuildAreaNotIn(List<Long> values) {
			addCriterion("lah_build_area not in", values, "buildArea");
			return (Criteria) this;
		}

		public Criteria andBuildingNoBetween(String value1, String value2) {
			addCriterion("lah_building_no between", value1, value2,
					"buildingNo");
			return (Criteria) this;
		}

		public Criteria andBuildingNoEqualTo(String value) {
			addCriterion("lah_building_no =", value, "buildingNo");
			return (Criteria) this;
		}

		public Criteria andBuildingNoGreaterThan(String value) {
			addCriterion("lah_building_no >", value, "buildingNo");
			return (Criteria) this;
		}

		public Criteria andBuildingNoGreaterThanOrEqualTo(String value) {
			addCriterion("lah_building_no >=", value, "buildingNo");
			return (Criteria) this;
		}

		public Criteria andBuildingNoIn(List<String> values) {
			addCriterion("lah_building_no in", values, "buildingNo");
			return (Criteria) this;
		}

		public Criteria andBuildingNoIsNotNull() {
			addCriterion("lah_building_no is not null");
			return (Criteria) this;
		}

		public Criteria andBuildingNoIsNull() {
			addCriterion("lah_building_no is null");
			return (Criteria) this;
		}

		public Criteria andBuildingNoLessThan(String value) {
			addCriterion("lah_building_no <", value, "buildingNo");
			return (Criteria) this;
		}

		public Criteria andBuildingNoLessThanOrEqualTo(String value) {
			addCriterion("lah_building_no <=", value, "buildingNo");
			return (Criteria) this;
		}

		public Criteria andBuildingNoLike(String value) {
			addCriterion("lah_building_no like", value, "buildingNo");
			return (Criteria) this;
		}

		public Criteria andBuildingNoNotBetween(String value1, String value2) {
			addCriterion("lah_building_no not between", value1, value2,
					"buildingNo");
			return (Criteria) this;
		}

		public Criteria andBuildingNoNotEqualTo(String value) {
			addCriterion("lah_building_no <>", value, "buildingNo");
			return (Criteria) this;
		}

		public Criteria andBuildingNoNotIn(List<String> values) {
			addCriterion("lah_building_no not in", values, "buildingNo");
			return (Criteria) this;
		}

		public Criteria andBuildingNoNotLike(String value) {
			addCriterion("lah_building_no not like", value, "buildingNo");
			return (Criteria) this;
		}

		public Criteria andBuildingTypeBetween(String value1, String value2) {
			addCriterion("lah_building_type between", value1, value2,
					"buildingType");
			return (Criteria) this;
		}

		public Criteria andBuildingTypeEqualTo(String value) {
			addCriterion("lah_building_type =", value, "buildingType");
			return (Criteria) this;
		}

		public Criteria andBuildingTypeGreaterThan(String value) {
			addCriterion("lah_building_type >", value, "buildingType");
			return (Criteria) this;
		}

		public Criteria andBuildingTypeGreaterThanOrEqualTo(String value) {
			addCriterion("lah_building_type >=", value, "buildingType");
			return (Criteria) this;
		}

		public Criteria andBuildingTypeIn(List<String> values) {
			addCriterion("lah_building_type in", values, "buildingType");
			return (Criteria) this;
		}

		public Criteria andBuildingTypeIsNotNull() {
			addCriterion("lah_building_type is not null");
			return (Criteria) this;
		}

		public Criteria andBuildingTypeIsNull() {
			addCriterion("lah_building_type is null");
			return (Criteria) this;
		}

		public Criteria andBuildingTypeLessThan(String value) {
			addCriterion("lah_building_type <", value, "buildingType");
			return (Criteria) this;
		}

		public Criteria andBuildingTypeLessThanOrEqualTo(String value) {
			addCriterion("lah_building_type <=", value, "buildingType");
			return (Criteria) this;
		}

		public Criteria andBuildingTypeLike(String value) {
			addCriterion("lah_building_type like", value, "buildingType");
			return (Criteria) this;
		}

		public Criteria andBuildingTypeNotBetween(String value1, String value2) {
			addCriterion("lah_building_type not between", value1, value2,
					"buildingType");
			return (Criteria) this;
		}

		public Criteria andBuildingTypeNotEqualTo(String value) {
			addCriterion("lah_building_type <>", value, "buildingType");
			return (Criteria) this;
		}

		public Criteria andBuildingTypeNotIn(List<String> values) {
			addCriterion("lah_building_type not in", values, "buildingType");
			return (Criteria) this;
		}

		public Criteria andBuildingTypeNotLike(String value) {
			addCriterion("lah_building_type not like", value, "buildingType");
			return (Criteria) this;
		}

		public Criteria andContectAddressBetween(String value1, String value2) {
			addCriterion("lah_contect_address between", value1, value2,
					"contectAddress");
			return (Criteria) this;
		}

		public Criteria andContectAddressEqualTo(String value) {
			addCriterion("lah_contect_address =", value, "contectAddress");
			return (Criteria) this;
		}

		public Criteria andContectAddressGreaterThan(String value) {
			addCriterion("lah_contect_address >", value, "contectAddress");
			return (Criteria) this;
		}

		public Criteria andContectAddressGreaterThanOrEqualTo(String value) {
			addCriterion("lah_contect_address >=", value, "contectAddress");
			return (Criteria) this;
		}

		public Criteria andContectAddressIn(List<String> values) {
			addCriterion("lah_contect_address in", values, "contectAddress");
			return (Criteria) this;
		}

		public Criteria andContectAddressIsNotNull() {
			addCriterion("lah_contect_address is not null");
			return (Criteria) this;
		}

		public Criteria andContectAddressIsNull() {
			addCriterion("lah_contect_address is null");
			return (Criteria) this;
		}

		public Criteria andContectAddressLessThan(String value) {
			addCriterion("lah_contect_address <", value, "contectAddress");
			return (Criteria) this;
		}

		public Criteria andContectAddressLessThanOrEqualTo(String value) {
			addCriterion("lah_contect_address <=", value, "contectAddress");
			return (Criteria) this;
		}

		public Criteria andContectAddressLike(String value) {
			addCriterion("lah_contect_address like", value, "contectAddress");
			return (Criteria) this;
		}

		public Criteria andContectAddressNotBetween(String value1, String value2) {
			addCriterion("lah_contect_address not between", value1, value2,
					"contectAddress");
			return (Criteria) this;
		}

		public Criteria andContectAddressNotEqualTo(String value) {
			addCriterion("lah_contect_address <>", value, "contectAddress");
			return (Criteria) this;
		}

		public Criteria andContectAddressNotIn(List<String> values) {
			addCriterion("lah_contect_address not in", values, "contectAddress");
			return (Criteria) this;
		}

		public Criteria andContectAddressNotLike(String value) {
			addCriterion("lah_contect_address not like", value,
					"contectAddress");
			return (Criteria) this;
		}

		public Criteria andContectBetween(String value1, String value2) {
			addCriterion("lah_contect between", value1, value2, "contect");
			return (Criteria) this;
		}

		public Criteria andContectEqualTo(String value) {
			addCriterion("lah_contect =", value, "contect");
			return (Criteria) this;
		}

		public Criteria andContectGreaterThan(String value) {
			addCriterion("lah_contect >", value, "contect");
			return (Criteria) this;
		}

		public Criteria andContectGreaterThanOrEqualTo(String value) {
			addCriterion("lah_contect >=", value, "contect");
			return (Criteria) this;
		}

		public Criteria andContectIn(List<String> values) {
			addCriterion("lah_contect in", values, "contect");
			return (Criteria) this;
		}

		public Criteria andContectIsNotNull() {
			addCriterion("lah_contect is not null");
			return (Criteria) this;
		}

		public Criteria andContectIsNull() {
			addCriterion("lah_contect is null");
			return (Criteria) this;
		}

		public Criteria andContectLessThan(String value) {
			addCriterion("lah_contect <", value, "contect");
			return (Criteria) this;
		}

		public Criteria andContectLessThanOrEqualTo(String value) {
			addCriterion("lah_contect <=", value, "contect");
			return (Criteria) this;
		}

		public Criteria andContectLike(String value) {
			addCriterion("lah_contect like", value, "contect");
			return (Criteria) this;
		}

		public Criteria andContectNotBetween(String value1, String value2) {
			addCriterion("lah_contect not between", value1, value2, "contect");
			return (Criteria) this;
		}

		public Criteria andContectNotEqualTo(String value) {
			addCriterion("lah_contect <>", value, "contect");
			return (Criteria) this;
		}

		public Criteria andContectNotIn(List<String> values) {
			addCriterion("lah_contect not in", values, "contect");
			return (Criteria) this;
		}

		public Criteria andContectNotLike(String value) {
			addCriterion("lah_contect not like", value, "contect");
			return (Criteria) this;
		}

		public Criteria andContectSexBetween(Integer value1, Integer value2) {
			addCriterion("lah_contect_sex between", value1, value2,
					"contectSex");
			return (Criteria) this;
		}

		public Criteria andContectSexEqualTo(Integer value) {
			addCriterion("lah_contect_sex =", value, "contectSex");
			return (Criteria) this;
		}

		public Criteria andContectSexGreaterThan(Integer value) {
			addCriterion("lah_contect_sex >", value, "contectSex");
			return (Criteria) this;
		}

		public Criteria andContectSexGreaterThanOrEqualTo(Integer value) {
			addCriterion("lah_contect_sex >=", value, "contectSex");
			return (Criteria) this;
		}

		public Criteria andContectSexIn(List<Integer> values) {
			addCriterion("lah_contect_sex in", values, "contectSex");
			return (Criteria) this;
		}

		public Criteria andContectSexIsNotNull() {
			addCriterion("lah_contect_sex is not null");
			return (Criteria) this;
		}

		public Criteria andContectSexIsNull() {
			addCriterion("lah_contect_sex is null");
			return (Criteria) this;
		}

		public Criteria andContectSexLessThan(Integer value) {
			addCriterion("lah_contect_sex <", value, "contectSex");
			return (Criteria) this;
		}

		public Criteria andContectSexLessThanOrEqualTo(Integer value) {
			addCriterion("lah_contect_sex <=", value, "contectSex");
			return (Criteria) this;
		}

		public Criteria andContectSexNotBetween(Integer value1, Integer value2) {
			addCriterion("lah_contect_sex not between", value1, value2,
					"contectSex");
			return (Criteria) this;
		}

		public Criteria andContectSexNotEqualTo(Integer value) {
			addCriterion("lah_contect_sex <>", value, "contectSex");
			return (Criteria) this;
		}

		public Criteria andContectSexNotIn(List<Integer> values) {
			addCriterion("lah_contect_sex not in", values, "contectSex");
			return (Criteria) this;
		}

		public Criteria andContectTel1Between(String value1, String value2) {
			addCriterion("lah_contect_tel1 between", value1, value2,
					"contectTel1");
			return (Criteria) this;
		}

		public Criteria andContectTel1EqualTo(String value) {
			addCriterion("lah_contect_tel1 =", value, "contectTel1");
			return (Criteria) this;
		}

		public Criteria andContectTel1GreaterThan(String value) {
			addCriterion("lah_contect_tel1 >", value, "contectTel1");
			return (Criteria) this;
		}

		public Criteria andContectTel1GreaterThanOrEqualTo(String value) {
			addCriterion("lah_contect_tel1 >=", value, "contectTel1");
			return (Criteria) this;
		}

		public Criteria andContectTel1In(List<String> values) {
			addCriterion("lah_contect_tel1 in", values, "contectTel1");
			return (Criteria) this;
		}

		public Criteria andContectTel1IsNotNull() {
			addCriterion("lah_contect_tel1 is not null");
			return (Criteria) this;
		}

		public Criteria andContectTel1IsNull() {
			addCriterion("lah_contect_tel1 is null");
			return (Criteria) this;
		}

		public Criteria andContectTel1LessThan(String value) {
			addCriterion("lah_contect_tel1 <", value, "contectTel1");
			return (Criteria) this;
		}

		public Criteria andContectTel1LessThanOrEqualTo(String value) {
			addCriterion("lah_contect_tel1 <=", value, "contectTel1");
			return (Criteria) this;
		}

		public Criteria andContectTel1Like(String value) {
			addCriterion("lah_contect_tel1 like", value, "contectTel1");
			return (Criteria) this;
		}

		public Criteria andContectTel1NotBetween(String value1, String value2) {
			addCriterion("lah_contect_tel1 not between", value1, value2,
					"contectTel1");
			return (Criteria) this;
		}

		public Criteria andContectTel1NotEqualTo(String value) {
			addCriterion("lah_contect_tel1 <>", value, "contectTel1");
			return (Criteria) this;
		}

		public Criteria andContectTel1NotIn(List<String> values) {
			addCriterion("lah_contect_tel1 not in", values, "contectTel1");
			return (Criteria) this;
		}

		public Criteria andContectTel1NotLike(String value) {
			addCriterion("lah_contect_tel1 not like", value, "contectTel1");
			return (Criteria) this;
		}

		public Criteria andContectTel2Between(String value1, String value2) {
			addCriterion("lah_contect_tel2 between", value1, value2,
					"contectTel2");
			return (Criteria) this;
		}

		public Criteria andContectTel2EqualTo(String value) {
			addCriterion("lah_contect_tel2 =", value, "contectTel2");
			return (Criteria) this;
		}

		public Criteria andContectTel2GreaterThan(String value) {
			addCriterion("lah_contect_tel2 >", value, "contectTel2");
			return (Criteria) this;
		}

		public Criteria andContectTel2GreaterThanOrEqualTo(String value) {
			addCriterion("lah_contect_tel2 >=", value, "contectTel2");
			return (Criteria) this;
		}

		public Criteria andContectTel2In(List<String> values) {
			addCriterion("lah_contect_tel2 in", values, "contectTel2");
			return (Criteria) this;
		}

		public Criteria andContectTel2IsNotNull() {
			addCriterion("lah_contect_tel2 is not null");
			return (Criteria) this;
		}

		public Criteria andContectTel2IsNull() {
			addCriterion("lah_contect_tel2 is null");
			return (Criteria) this;
		}

		public Criteria andContectTel2LessThan(String value) {
			addCriterion("lah_contect_tel2 <", value, "contectTel2");
			return (Criteria) this;
		}

		public Criteria andContectTel2LessThanOrEqualTo(String value) {
			addCriterion("lah_contect_tel2 <=", value, "contectTel2");
			return (Criteria) this;
		}

		public Criteria andContectTel2Like(String value) {
			addCriterion("lah_contect_tel2 like", value, "contectTel2");
			return (Criteria) this;
		}

		public Criteria andContectTel2NotBetween(String value1, String value2) {
			addCriterion("lah_contect_tel2 not between", value1, value2,
					"contectTel2");
			return (Criteria) this;
		}

		public Criteria andContectTel2NotEqualTo(String value) {
			addCriterion("lah_contect_tel2 <>", value, "contectTel2");
			return (Criteria) this;
		}

		public Criteria andContectTel2NotIn(List<String> values) {
			addCriterion("lah_contect_tel2 not in", values, "contectTel2");
			return (Criteria) this;
		}

		public Criteria andContectTel2NotLike(String value) {
			addCriterion("lah_contect_tel2 not like", value, "contectTel2");
			return (Criteria) this;
		}

		public Criteria andFloorBetween(String value1, String value2) {
			addCriterion("lah_floor between", value1, value2, "floor");
			return (Criteria) this;
		}

		public Criteria andFloorEqualTo(String value) {
			addCriterion("lah_floor =", value, "floor");
			return (Criteria) this;
		}

		public Criteria andFloorGreaterThan(String value) {
			addCriterion("lah_floor >", value, "floor");
			return (Criteria) this;
		}

		public Criteria andFloorGreaterThanOrEqualTo(String value) {
			addCriterion("lah_floor >=", value, "floor");
			return (Criteria) this;
		}

		public Criteria andFloorIn(List<String> values) {
			addCriterion("lah_floor in", values, "floor");
			return (Criteria) this;
		}

		public Criteria andFloorIsNotNull() {
			addCriterion("lah_floor is not null");
			return (Criteria) this;
		}

		public Criteria andFloorIsNull() {
			addCriterion("lah_floor is null");
			return (Criteria) this;
		}

		public Criteria andFloorLessThan(String value) {
			addCriterion("lah_floor <", value, "floor");
			return (Criteria) this;
		}

		public Criteria andFloorLessThanOrEqualTo(String value) {
			addCriterion("lah_floor <=", value, "floor");
			return (Criteria) this;
		}

		public Criteria andFloorLike(String value) {
			addCriterion("lah_floor like", value, "floor");
			return (Criteria) this;
		}

		public Criteria andFloorNotBetween(String value1, String value2) {
			addCriterion("lah_floor not between", value1, value2, "floor");
			return (Criteria) this;
		}

		public Criteria andFloorNotEqualTo(String value) {
			addCriterion("lah_floor <>", value, "floor");
			return (Criteria) this;
		}

		public Criteria andFloorNotIn(List<String> values) {
			addCriterion("lah_floor not in", values, "floor");
			return (Criteria) this;
		}

		public Criteria andFloorNotLike(String value) {
			addCriterion("lah_floor not like", value, "floor");
			return (Criteria) this;
		}

		public Criteria andHareaBetween(Long value1, Long value2) {
			addCriterion("lah_harea between", value1, value2, "harea");
			return (Criteria) this;
		}

		public Criteria andHareaEqualTo(Long value) {
			addCriterion("lah_harea =", value, "harea");
			return (Criteria) this;
		}

		public Criteria andHareaGreaterThan(Long value) {
			addCriterion("lah_harea >", value, "harea");
			return (Criteria) this;
		}

		public Criteria andHareaGreaterThanOrEqualTo(Long value) {
			addCriterion("lah_harea >=", value, "harea");
			return (Criteria) this;
		}

		public Criteria andHareaIn(List<Long> values) {
			addCriterion("lah_harea in", values, "harea");
			return (Criteria) this;
		}

		public Criteria andHareaIsNotNull() {
			addCriterion("lah_harea is not null");
			return (Criteria) this;
		}

		public Criteria andHareaIsNull() {
			addCriterion("lah_harea is null");
			return (Criteria) this;
		}

		public Criteria andHareaLessThan(Long value) {
			addCriterion("lah_harea <", value, "harea");
			return (Criteria) this;
		}

		public Criteria andHareaLessThanOrEqualTo(Long value) {
			addCriterion("lah_harea <=", value, "harea");
			return (Criteria) this;
		}

		public Criteria andHareaNotBetween(Long value1, Long value2) {
			addCriterion("lah_harea not between", value1, value2, "harea");
			return (Criteria) this;
		}

		public Criteria andHareaNotEqualTo(Long value) {
			addCriterion("lah_harea <>", value, "harea");
			return (Criteria) this;
		}

		public Criteria andHareaNotIn(List<Long> values) {
			addCriterion("lah_harea not in", values, "harea");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("lah_id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("lah_id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("lah_id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("lah_id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("lah_id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("lah_id is not null");
			return (Criteria) this;
		}

		public Criteria andIdIsNull() {
			addCriterion("lah_id is null");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("lah_id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("lah_id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("lah_id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("lah_id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("lah_id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIsrentBetween(Integer value1, Integer value2) {
			addCriterion("lah_isRent between", value1, value2, "isrent");
			return (Criteria) this;
		}

		public Criteria andIsrentEqualTo(Integer value) {
			addCriterion("lah_isRent =", value, "isrent");
			return (Criteria) this;
		}

		public Criteria andIsrentGreaterThan(Integer value) {
			addCriterion("lah_isRent >", value, "isrent");
			return (Criteria) this;
		}

		public Criteria andIsrentGreaterThanOrEqualTo(Integer value) {
			addCriterion("lah_isRent >=", value, "isrent");
			return (Criteria) this;
		}

		public Criteria andIsrentIn(List<Integer> values) {
			addCriterion("lah_isRent in", values, "isrent");
			return (Criteria) this;
		}

		public Criteria andIsrentIsNotNull() {
			addCriterion("lah_isRent is not null");
			return (Criteria) this;
		}

		public Criteria andIsrentIsNull() {
			addCriterion("lah_isRent is null");
			return (Criteria) this;
		}

		public Criteria andIsrentLessThan(Integer value) {
			addCriterion("lah_isRent <", value, "isrent");
			return (Criteria) this;
		}

		public Criteria andIsrentLessThanOrEqualTo(Integer value) {
			addCriterion("lah_isRent <=", value, "isrent");
			return (Criteria) this;
		}

		public Criteria andIsrentNotBetween(Integer value1, Integer value2) {
			addCriterion("lah_isRent not between", value1, value2, "isrent");
			return (Criteria) this;
		}

		public Criteria andIsrentNotEqualTo(Integer value) {
			addCriterion("lah_isRent <>", value, "isrent");
			return (Criteria) this;
		}

		public Criteria andIsrentNotIn(List<Integer> values) {
			addCriterion("lah_isRent not in", values, "isrent");
			return (Criteria) this;
		}

		public Criteria andIssalsBetween(Integer value1, Integer value2) {
			addCriterion("lah_isSals between", value1, value2, "issals");
			return (Criteria) this;
		}

		public Criteria andIssalsEqualTo(Integer value) {
			addCriterion("lah_isSals =", value, "issals");
			return (Criteria) this;
		}

		public Criteria andIssalsGreaterThan(Integer value) {
			addCriterion("lah_isSals >", value, "issals");
			return (Criteria) this;
		}

		public Criteria andIssalsGreaterThanOrEqualTo(Integer value) {
			addCriterion("lah_isSals >=", value, "issals");
			return (Criteria) this;
		}

		public Criteria andIssalsIn(List<Integer> values) {
			addCriterion("lah_isSals in", values, "issals");
			return (Criteria) this;
		}

		public Criteria andIssalsIsNotNull() {
			addCriterion("lah_isSals is not null");
			return (Criteria) this;
		}

		public Criteria andIssalsIsNull() {
			addCriterion("lah_isSals is null");
			return (Criteria) this;
		}

		public Criteria andIssalsLessThan(Integer value) {
			addCriterion("lah_isSals <", value, "issals");
			return (Criteria) this;
		}

		public Criteria andIssalsLessThanOrEqualTo(Integer value) {
			addCriterion("lah_isSals <=", value, "issals");
			return (Criteria) this;
		}

		public Criteria andIssalsNotBetween(Integer value1, Integer value2) {
			addCriterion("lah_isSals not between", value1, value2, "issals");
			return (Criteria) this;
		}

		public Criteria andIssalsNotEqualTo(Integer value) {
			addCriterion("lah_isSals <>", value, "issals");
			return (Criteria) this;
		}

		public Criteria andIssalsNotIn(List<Integer> values) {
			addCriterion("lah_isSals not in", values, "issals");
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

		public Criteria andLapNameBetween(String value1, String value2) {
			addCriterion("lap_name between", value1, value2, "lapName");
			return (Criteria) this;
		}

		public Criteria andLapNameEqualTo(String value) {
			addCriterion("lap_name =", value, "lapName");
			return (Criteria) this;
		}

		public Criteria andLapNameGreaterThan(String value) {
			addCriterion("lap_name >", value, "lapName");
			return (Criteria) this;
		}

		public Criteria andLapNameGreaterThanOrEqualTo(String value) {
			addCriterion("lap_name >=", value, "lapName");
			return (Criteria) this;
		}

		public Criteria andLapNameIn(List<String> values) {
			addCriterion("lap_name in", values, "lapName");
			return (Criteria) this;
		}

		public Criteria andLapNameIsNotNull() {
			addCriterion("lap_name is not null");
			return (Criteria) this;
		}

		public Criteria andLapNameIsNull() {
			addCriterion("lap_name is null");
			return (Criteria) this;
		}

		public Criteria andLapNameLessThan(String value) {
			addCriterion("lap_name <", value, "lapName");
			return (Criteria) this;
		}

		public Criteria andLapNameLessThanOrEqualTo(String value) {
			addCriterion("lap_name <=", value, "lapName");
			return (Criteria) this;
		}

		public Criteria andLapNameLike(String value) {
			addCriterion("lap_name like", value, "lapName");
			return (Criteria) this;
		}

		public Criteria andLapNameNotBetween(String value1, String value2) {
			addCriterion("lap_name not between", value1, value2, "lapName");
			return (Criteria) this;
		}

		public Criteria andLapNameNotEqualTo(String value) {
			addCriterion("lap_name <>", value, "lapName");
			return (Criteria) this;
		}

		public Criteria andLapNameNotIn(List<String> values) {
			addCriterion("lap_name not in", values, "lapName");
			return (Criteria) this;
		}

		public Criteria andLapNameNotLike(String value) {
			addCriterion("lap_name not like", value, "lapName");
			return (Criteria) this;
		}

		public Criteria andMemoBetween(String value1, String value2) {
			addCriterion("lah_memo between", value1, value2, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoEqualTo(String value) {
			addCriterion("lah_memo =", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoGreaterThan(String value) {
			addCriterion("lah_memo >", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoGreaterThanOrEqualTo(String value) {
			addCriterion("lah_memo >=", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoIn(List<String> values) {
			addCriterion("lah_memo in", values, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoIsNotNull() {
			addCriterion("lah_memo is not null");
			return (Criteria) this;
		}

		public Criteria andMemoIsNull() {
			addCriterion("lah_memo is null");
			return (Criteria) this;
		}

		public Criteria andMemoLessThan(String value) {
			addCriterion("lah_memo <", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoLessThanOrEqualTo(String value) {
			addCriterion("lah_memo <=", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoLike(String value) {
			addCriterion("lah_memo like", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoNotBetween(String value1, String value2) {
			addCriterion("lah_memo not between", value1, value2, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoNotEqualTo(String value) {
			addCriterion("lah_memo <>", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoNotIn(List<String> values) {
			addCriterion("lah_memo not in", values, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoNotLike(String value) {
			addCriterion("lah_memo not like", value, "memo");
			return (Criteria) this;
		}

		public Criteria andNoBetween(String value1, String value2) {
			addCriterion("lah_no between", value1, value2, "no");
			return (Criteria) this;
		}

		public Criteria andNoEqualTo(String value) {
			addCriterion("lah_no =", value, "no");
			return (Criteria) this;
		}

		public Criteria andNoGreaterThan(String value) {
			addCriterion("lah_no >", value, "no");
			return (Criteria) this;
		}

		public Criteria andNoGreaterThanOrEqualTo(String value) {
			addCriterion("lah_no >=", value, "no");
			return (Criteria) this;
		}

		public Criteria andNoIn(List<String> values) {
			addCriterion("lah_no in", values, "no");
			return (Criteria) this;
		}

		public Criteria andNoIsNotNull() {
			addCriterion("lah_no is not null");
			return (Criteria) this;
		}

		public Criteria andNoIsNull() {
			addCriterion("lah_no is null");
			return (Criteria) this;
		}

		public Criteria andNoLessThan(String value) {
			addCriterion("lah_no <", value, "no");
			return (Criteria) this;
		}

		public Criteria andNoLessThanOrEqualTo(String value) {
			addCriterion("lah_no <=", value, "no");
			return (Criteria) this;
		}

		public Criteria andNoLike(String value) {
			addCriterion("lah_no like", value, "no");
			return (Criteria) this;
		}

		public Criteria andNoNotBetween(String value1, String value2) {
			addCriterion("lah_no not between", value1, value2, "no");
			return (Criteria) this;
		}

		public Criteria andNoNotEqualTo(String value) {
			addCriterion("lah_no <>", value, "no");
			return (Criteria) this;
		}

		public Criteria andNoNotIn(List<String> values) {
			addCriterion("lah_no not in", values, "no");
			return (Criteria) this;
		}

		public Criteria andNoNotLike(String value) {
			addCriterion("lah_no not like", value, "no");
			return (Criteria) this;
		}

		public Criteria andPropCompBetween(String value1, String value2) {
			addCriterion("lah_prop_comp between", value1, value2, "propComp");
			return (Criteria) this;
		}

		public Criteria andPropCompEqualTo(String value) {
			addCriterion("lah_prop_comp =", value, "propComp");
			return (Criteria) this;
		}

		public Criteria andPropCompGreaterThan(String value) {
			addCriterion("lah_prop_comp >", value, "propComp");
			return (Criteria) this;
		}

		public Criteria andPropCompGreaterThanOrEqualTo(String value) {
			addCriterion("lah_prop_comp >=", value, "propComp");
			return (Criteria) this;
		}

		public Criteria andPropCompIn(List<String> values) {
			addCriterion("lah_prop_comp in", values, "propComp");
			return (Criteria) this;
		}

		public Criteria andPropCompIsNotNull() {
			addCriterion("lah_prop_comp is not null");
			return (Criteria) this;
		}

		public Criteria andPropCompIsNull() {
			addCriterion("lah_prop_comp is null");
			return (Criteria) this;
		}

		public Criteria andPropCompLessThan(String value) {
			addCriterion("lah_prop_comp <", value, "propComp");
			return (Criteria) this;
		}

		public Criteria andPropCompLessThanOrEqualTo(String value) {
			addCriterion("lah_prop_comp <=", value, "propComp");
			return (Criteria) this;
		}

		public Criteria andPropCompLike(String value) {
			addCriterion("lah_prop_comp like", value, "propComp");
			return (Criteria) this;
		}

		public Criteria andPropCompNotBetween(String value1, String value2) {
			addCriterion("lah_prop_comp not between", value1, value2,
					"propComp");
			return (Criteria) this;
		}

		public Criteria andPropCompNotEqualTo(String value) {
			addCriterion("lah_prop_comp <>", value, "propComp");
			return (Criteria) this;
		}

		public Criteria andPropCompNotIn(List<String> values) {
			addCriterion("lah_prop_comp not in", values, "propComp");
			return (Criteria) this;
		}

		public Criteria andPropCompNotLike(String value) {
			addCriterion("lah_prop_comp not like", value, "propComp");
			return (Criteria) this;
		}

		public Criteria andPubtimeBetween(Date value1, Date value2) {
			addCriterion("lah_pubtime between", value1, value2, "pubtime");
			return (Criteria) this;
		}

		public Criteria andPubtimeEqualTo(Date value) {
			addCriterion("lah_pubtime =", value, "pubtime");
			return (Criteria) this;
		}

		public Criteria andPubtimeGreaterThan(Date value) {
			addCriterion("lah_pubtime >", value, "pubtime");
			return (Criteria) this;
		}

		public Criteria andPubtimeGreaterThanOrEqualTo(Date value) {
			addCriterion("lah_pubtime >=", value, "pubtime");
			return (Criteria) this;
		}

		public Criteria andPubtimeIn(List<Date> values) {
			addCriterion("lah_pubtime in", values, "pubtime");
			return (Criteria) this;
		}

		public Criteria andPubtimeIsNotNull() {
			addCriterion("lah_pubtime is not null");
			return (Criteria) this;
		}

		public Criteria andPubtimeIsNull() {
			addCriterion("lah_pubtime is null");
			return (Criteria) this;
		}

		public Criteria andPubtimeLessThan(Date value) {
			addCriterion("lah_pubtime <", value, "pubtime");
			return (Criteria) this;
		}

		public Criteria andPubtimeLessThanOrEqualTo(Date value) {
			addCriterion("lah_pubtime <=", value, "pubtime");
			return (Criteria) this;
		}

		public Criteria andPubtimeNotBetween(Date value1, Date value2) {
			addCriterion("lah_pubtime not between", value1, value2, "pubtime");
			return (Criteria) this;
		}

		public Criteria andPubtimeNotEqualTo(Date value) {
			addCriterion("lah_pubtime <>", value, "pubtime");
			return (Criteria) this;
		}

		public Criteria andPubtimeNotIn(List<Date> values) {
			addCriterion("lah_pubtime not in", values, "pubtime");
			return (Criteria) this;
		}

		public Criteria andRentdateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("lah_rentdate between", value1, value2,
					"rentdate");
			return (Criteria) this;
		}

		public Criteria andRentdateEqualTo(Date value) {
			addCriterionForJDBCDate("lah_rentdate =", value, "rentdate");
			return (Criteria) this;
		}

		public Criteria andRentdateGreaterThan(Date value) {
			addCriterionForJDBCDate("lah_rentdate >", value, "rentdate");
			return (Criteria) this;
		}

		public Criteria andRentdateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("lah_rentdate >=", value, "rentdate");
			return (Criteria) this;
		}

		public Criteria andRentdateIn(List<Date> values) {
			addCriterionForJDBCDate("lah_rentdate in", values, "rentdate");
			return (Criteria) this;
		}

		public Criteria andRentdateIsNotNull() {
			addCriterion("lah_rentdate is not null");
			return (Criteria) this;
		}

		public Criteria andRentdateIsNull() {
			addCriterion("lah_rentdate is null");
			return (Criteria) this;
		}

		public Criteria andRentdateLessThan(Date value) {
			addCriterionForJDBCDate("lah_rentdate <", value, "rentdate");
			return (Criteria) this;
		}

		public Criteria andRentdateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("lah_rentdate <=", value, "rentdate");
			return (Criteria) this;
		}

		public Criteria andRentdateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("lah_rentdate not between", value1, value2,
					"rentdate");
			return (Criteria) this;
		}

		public Criteria andRentdateNotEqualTo(Date value) {
			addCriterionForJDBCDate("lah_rentdate <>", value, "rentdate");
			return (Criteria) this;
		}

		public Criteria andRentdateNotIn(List<Date> values) {
			addCriterionForJDBCDate("lah_rentdate not in", values, "rentdate");
			return (Criteria) this;
		}

		public Criteria andRentPriceBetween(Long value1, Long value2) {
			addCriterion("lah_rent_price between", value1, value2, "rentPrice");
			return (Criteria) this;
		}

		public Criteria andRentPriceEqualTo(Long value) {
			addCriterion("lah_rent_price =", value, "rentPrice");
			return (Criteria) this;
		}

		public Criteria andRentPriceGreaterThan(Long value) {
			addCriterion("lah_rent_price >", value, "rentPrice");
			return (Criteria) this;
		}

		public Criteria andRentPriceGreaterThanOrEqualTo(Long value) {
			addCriterion("lah_rent_price >=", value, "rentPrice");
			return (Criteria) this;
		}

		public Criteria andRentPriceIn(List<Long> values) {
			addCriterion("lah_rent_price in", values, "rentPrice");
			return (Criteria) this;
		}

		public Criteria andRentPriceIsNotNull() {
			addCriterion("lah_rent_price is not null");
			return (Criteria) this;
		}

		public Criteria andRentPriceIsNull() {
			addCriterion("lah_rent_price is null");
			return (Criteria) this;
		}

		public Criteria andRentPriceLessThan(Long value) {
			addCriterion("lah_rent_price <", value, "rentPrice");
			return (Criteria) this;
		}

		public Criteria andRentPriceLessThanOrEqualTo(Long value) {
			addCriterion("lah_rent_price <=", value, "rentPrice");
			return (Criteria) this;
		}

		public Criteria andRentPriceNotBetween(Long value1, Long value2) {
			addCriterion("lah_rent_price not between", value1, value2,
					"rentPrice");
			return (Criteria) this;
		}

		public Criteria andRentPriceNotEqualTo(Long value) {
			addCriterion("lah_rent_price <>", value, "rentPrice");
			return (Criteria) this;
		}

		public Criteria andRentPriceNotIn(List<Long> values) {
			addCriterion("lah_rent_price not in", values, "rentPrice");
			return (Criteria) this;
		}

		public Criteria andRoomFaceBetween(String value1, String value2) {
			addCriterion("lah_room_face between", value1, value2, "roomFace");
			return (Criteria) this;
		}

		public Criteria andRoomFaceEqualTo(String value) {
			addCriterion("lah_room_face =", value, "roomFace");
			return (Criteria) this;
		}

		public Criteria andRoomFaceGreaterThan(String value) {
			addCriterion("lah_room_face >", value, "roomFace");
			return (Criteria) this;
		}

		public Criteria andRoomFaceGreaterThanOrEqualTo(String value) {
			addCriterion("lah_room_face >=", value, "roomFace");
			return (Criteria) this;
		}

		public Criteria andRoomFaceIn(List<String> values) {
			addCriterion("lah_room_face in", values, "roomFace");
			return (Criteria) this;
		}

		public Criteria andRoomFaceIsNotNull() {
			addCriterion("lah_room_face is not null");
			return (Criteria) this;
		}

		public Criteria andRoomFaceIsNull() {
			addCriterion("lah_room_face is null");
			return (Criteria) this;
		}

		public Criteria andRoomFaceLessThan(String value) {
			addCriterion("lah_room_face <", value, "roomFace");
			return (Criteria) this;
		}

		public Criteria andRoomFaceLessThanOrEqualTo(String value) {
			addCriterion("lah_room_face <=", value, "roomFace");
			return (Criteria) this;
		}

		public Criteria andRoomFaceLike(String value) {
			addCriterion("lah_room_face like", value, "roomFace");
			return (Criteria) this;
		}

		public Criteria andRoomFaceNotBetween(String value1, String value2) {
			addCriterion("lah_room_face not between", value1, value2,
					"roomFace");
			return (Criteria) this;
		}

		public Criteria andRoomFaceNotEqualTo(String value) {
			addCriterion("lah_room_face <>", value, "roomFace");
			return (Criteria) this;
		}

		public Criteria andRoomFaceNotIn(List<String> values) {
			addCriterion("lah_room_face not in", values, "roomFace");
			return (Criteria) this;
		}

		public Criteria andRoomFaceNotLike(String value) {
			addCriterion("lah_room_face not like", value, "roomFace");
			return (Criteria) this;
		}

		public Criteria andRoomTypeBetween(String value1, String value2) {
			addCriterion("lah_Room_type between", value1, value2, "roomType");
			return (Criteria) this;
		}

		public Criteria andRoomTypeEqualTo(String value) {
			addCriterion("lah_Room_type =", value, "roomType");
			return (Criteria) this;
		}

		public Criteria andRoomTypeGreaterThan(String value) {
			addCriterion("lah_Room_type >", value, "roomType");
			return (Criteria) this;
		}

		public Criteria andRoomTypeGreaterThanOrEqualTo(String value) {
			addCriterion("lah_Room_type >=", value, "roomType");
			return (Criteria) this;
		}

		public Criteria andRoomTypeIn(List<String> values) {
			addCriterion("lah_Room_type in", values, "roomType");
			return (Criteria) this;
		}

		public Criteria andRoomTypeIsNotNull() {
			addCriterion("lah_Room_type is not null");
			return (Criteria) this;
		}

		public Criteria andRoomTypeIsNull() {
			addCriterion("lah_Room_type is null");
			return (Criteria) this;
		}

		public Criteria andRoomTypeLessThan(String value) {
			addCriterion("lah_Room_type <", value, "roomType");
			return (Criteria) this;
		}

		public Criteria andRoomTypeLessThanOrEqualTo(String value) {
			addCriterion("lah_Room_type <=", value, "roomType");
			return (Criteria) this;
		}

		public Criteria andRoomTypeLike(String value) {
			addCriterion("lah_Room_type like", value, "roomType");
			return (Criteria) this;
		}

		public Criteria andRoomTypeNotBetween(String value1, String value2) {
			addCriterion("lah_Room_type not between", value1, value2,
					"roomType");
			return (Criteria) this;
		}

		public Criteria andRoomTypeNotEqualTo(String value) {
			addCriterion("lah_Room_type <>", value, "roomType");
			return (Criteria) this;
		}

		public Criteria andRoomTypeNotIn(List<String> values) {
			addCriterion("lah_Room_type not in", values, "roomType");
			return (Criteria) this;
		}

		public Criteria andRoomTypeNotLike(String value) {
			addCriterion("lah_Room_type not like", value, "roomType");
			return (Criteria) this;
		}

		public Criteria andSalePriceBetween(Long value1, Long value2) {
			addCriterion("lah_sale_price between", value1, value2, "salePrice");
			return (Criteria) this;
		}

		public Criteria andSalePriceEqualTo(Long value) {
			addCriterion("lah_sale_price =", value, "salePrice");
			return (Criteria) this;
		}

		public Criteria andSalePriceGreaterThan(Long value) {
			addCriterion("lah_sale_price >", value, "salePrice");
			return (Criteria) this;
		}

		public Criteria andSalePriceGreaterThanOrEqualTo(Long value) {
			addCriterion("lah_sale_price >=", value, "salePrice");
			return (Criteria) this;
		}

		public Criteria andSalePriceIn(List<Long> values) {
			addCriterion("lah_sale_price in", values, "salePrice");
			return (Criteria) this;
		}

		public Criteria andSalePriceIsNotNull() {
			addCriterion("lah_sale_price is not null");
			return (Criteria) this;
		}

		public Criteria andSalePriceIsNull() {
			addCriterion("lah_sale_price is null");
			return (Criteria) this;
		}

		public Criteria andSalePriceLessThan(Long value) {
			addCriterion("lah_sale_price <", value, "salePrice");
			return (Criteria) this;
		}

		public Criteria andSalePriceLessThanOrEqualTo(Long value) {
			addCriterion("lah_sale_price <=", value, "salePrice");
			return (Criteria) this;
		}

		public Criteria andSalePriceNotBetween(Long value1, Long value2) {
			addCriterion("lah_sale_price not between", value1, value2,
					"salePrice");
			return (Criteria) this;
		}

		public Criteria andSalePriceNotEqualTo(Long value) {
			addCriterion("lah_sale_price <>", value, "salePrice");
			return (Criteria) this;
		}

		public Criteria andSalePriceNotIn(List<Long> values) {
			addCriterion("lah_sale_price not in", values, "salePrice");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Integer value1, Integer value2) {
			addCriterion("lah_status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(Integer value) {
			addCriterion("lah_status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Integer value) {
			addCriterion("lah_status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("lah_status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Integer> values) {
			addCriterion("lah_status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("lah_status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("lah_status is null");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Integer value) {
			addCriterion("lah_status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Integer value) {
			addCriterion("lah_status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("lah_status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Integer value) {
			addCriterion("lah_status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Integer> values) {
			addCriterion("lah_status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("lah_title between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("lah_title =", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("lah_title >", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("lah_title >=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleIn(List<String> values) {
			addCriterion("lah_title in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("lah_title is not null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("lah_title is null");
			return (Criteria) this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("lah_title <", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("lah_title <=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("lah_title like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("lah_title not between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("lah_title <>", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("lah_title not in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("lah_title not like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(String value1, String value2) {
			addCriterion("lah_type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(String value) {
			addCriterion("lah_type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(String value) {
			addCriterion("lah_type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(String value) {
			addCriterion("lah_type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<String> values) {
			addCriterion("lah_type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("lah_type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("lah_type is null");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(String value) {
			addCriterion("lah_type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(String value) {
			addCriterion("lah_type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLike(String value) {
			addCriterion("lah_type like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(String value1, String value2) {
			addCriterion("lah_type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(String value) {
			addCriterion("lah_type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<String> values) {
			addCriterion("lah_type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotLike(String value) {
			addCriterion("lah_type not like", value, "type");
			return (Criteria) this;
		}

		public Criteria andUnitBetween(String value1, String value2) {
			addCriterion("lah_unit between", value1, value2, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitEqualTo(String value) {
			addCriterion("lah_unit =", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitGreaterThan(String value) {
			addCriterion("lah_unit >", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitGreaterThanOrEqualTo(String value) {
			addCriterion("lah_unit >=", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitIn(List<String> values) {
			addCriterion("lah_unit in", values, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitIsNotNull() {
			addCriterion("lah_unit is not null");
			return (Criteria) this;
		}

		public Criteria andUnitIsNull() {
			addCriterion("lah_unit is null");
			return (Criteria) this;
		}

		public Criteria andUnitLessThan(String value) {
			addCriterion("lah_unit <", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitLessThanOrEqualTo(String value) {
			addCriterion("lah_unit <=", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitLike(String value) {
			addCriterion("lah_unit like", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotBetween(String value1, String value2) {
			addCriterion("lah_unit not between", value1, value2, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotEqualTo(String value) {
			addCriterion("lah_unit <>", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotIn(List<String> values) {
			addCriterion("lah_unit not in", values, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotLike(String value) {
			addCriterion("lah_unit not like", value, "unit");
			return (Criteria) this;
		}

		public Criteria andXBetween(String value1, String value2) {
			addCriterion("lah_x between", value1, value2, "x");
			return (Criteria) this;
		}

		public Criteria andXEqualTo(String value) {
			addCriterion("lah_x =", value, "x");
			return (Criteria) this;
		}

		public Criteria andXGreaterThan(String value) {
			addCriterion("lah_x >", value, "x");
			return (Criteria) this;
		}

		public Criteria andXGreaterThanOrEqualTo(String value) {
			addCriterion("lah_x >=", value, "x");
			return (Criteria) this;
		}

		public Criteria andXIn(List<String> values) {
			addCriterion("lah_x in", values, "x");
			return (Criteria) this;
		}

		public Criteria andXIsNotNull() {
			addCriterion("lah_x is not null");
			return (Criteria) this;
		}

		public Criteria andXIsNull() {
			addCriterion("lah_x is null");
			return (Criteria) this;
		}

		public Criteria andXLessThan(String value) {
			addCriterion("lah_x <", value, "x");
			return (Criteria) this;
		}

		public Criteria andXLessThanOrEqualTo(String value) {
			addCriterion("lah_x <=", value, "x");
			return (Criteria) this;
		}

		public Criteria andXLike(String value) {
			addCriterion("lah_x like", value, "x");
			return (Criteria) this;
		}

		public Criteria andXNotBetween(String value1, String value2) {
			addCriterion("lah_x not between", value1, value2, "x");
			return (Criteria) this;
		}

		public Criteria andXNotEqualTo(String value) {
			addCriterion("lah_x <>", value, "x");
			return (Criteria) this;
		}

		public Criteria andXNotIn(List<String> values) {
			addCriterion("lah_x not in", values, "x");
			return (Criteria) this;
		}

		public Criteria andXNotLike(String value) {
			addCriterion("lah_x not like", value, "x");
			return (Criteria) this;
		}

		public Criteria andYBetween(String value1, String value2) {
			addCriterion("lah_y between", value1, value2, "y");
			return (Criteria) this;
		}

		public Criteria andYearBetween(String value1, String value2) {
			addCriterion("lah_year between", value1, value2, "year");
			return (Criteria) this;
		}

		public Criteria andYearEqualTo(String value) {
			addCriterion("lah_year =", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearGreaterThan(String value) {
			addCriterion("lah_year >", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearGreaterThanOrEqualTo(String value) {
			addCriterion("lah_year >=", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearIn(List<String> values) {
			addCriterion("lah_year in", values, "year");
			return (Criteria) this;
		}

		public Criteria andYearIsNotNull() {
			addCriterion("lah_year is not null");
			return (Criteria) this;
		}

		public Criteria andYearIsNull() {
			addCriterion("lah_year is null");
			return (Criteria) this;
		}

		public Criteria andYearLessThan(String value) {
			addCriterion("lah_year <", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearLessThanOrEqualTo(String value) {
			addCriterion("lah_year <=", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearLike(String value) {
			addCriterion("lah_year like", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearNotBetween(String value1, String value2) {
			addCriterion("lah_year not between", value1, value2, "year");
			return (Criteria) this;
		}

		public Criteria andYearNotEqualTo(String value) {
			addCriterion("lah_year <>", value, "year");
			return (Criteria) this;
		}

		public Criteria andYearNotIn(List<String> values) {
			addCriterion("lah_year not in", values, "year");
			return (Criteria) this;
		}

		public Criteria andYearNotLike(String value) {
			addCriterion("lah_year not like", value, "year");
			return (Criteria) this;
		}

		public Criteria andYEqualTo(String value) {
			addCriterion("lah_y =", value, "y");
			return (Criteria) this;
		}

		public Criteria andYGreaterThan(String value) {
			addCriterion("lah_y >", value, "y");
			return (Criteria) this;
		}

		public Criteria andYGreaterThanOrEqualTo(String value) {
			addCriterion("lah_y >=", value, "y");
			return (Criteria) this;
		}

		public Criteria andYIn(List<String> values) {
			addCriterion("lah_y in", values, "y");
			return (Criteria) this;
		}

		public Criteria andYIsNotNull() {
			addCriterion("lah_y is not null");
			return (Criteria) this;
		}

		public Criteria andYIsNull() {
			addCriterion("lah_y is null");
			return (Criteria) this;
		}

		public Criteria andYLessThan(String value) {
			addCriterion("lah_y <", value, "y");
			return (Criteria) this;
		}

		public Criteria andYLessThanOrEqualTo(String value) {
			addCriterion("lah_y <=", value, "y");
			return (Criteria) this;
		}

		public Criteria andYLike(String value) {
			addCriterion("lah_y like", value, "y");
			return (Criteria) this;
		}

		public Criteria andYNotBetween(String value1, String value2) {
			addCriterion("lah_y not between", value1, value2, "y");
			return (Criteria) this;
		}

		public Criteria andYNotEqualTo(String value) {
			addCriterion("lah_y <>", value, "y");
			return (Criteria) this;
		}

		public Criteria andYNotIn(List<String> values) {
			addCriterion("lah_y not in", values, "y");
			return (Criteria) this;
		}

		public Criteria andYNotLike(String value) {
			addCriterion("lah_y not like", value, "y");
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