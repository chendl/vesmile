package com.vesmile.framework.dao.mybatis;

import java.util.ArrayList;
import java.util.List;

public class JoinTableClause {
	private JoinClause joinClause;
	private String joinTable;
	private String joinType;
	public static final String JOIN_OUTER = "outer join";
	public static final String JOIN_INNER = "inner join";
	private List<Criterion> joinCriterions = new ArrayList<Criterion>();

	public JoinClause getJoinClause() {
		return joinClause;
	}

	public void setJoinClause(JoinClause joinClause) {
		this.joinClause = joinClause;
	}

	public List<Criterion> getJoinCriterions() {
		return joinCriterions;
	}

	public boolean isValid() {
		return this.joinTable != null && this.joinType != null
				&& joinCriterions.size() > 0;
	}

	public String getJoinTable() {
		return joinTable;
	}

	public void setJoinTable(String joinTable) {
		this.joinTable = joinTable;
	}

	public String getJoinType() {
		return joinType;
	}

	public void setJoinType(String joinType) {
		this.joinType = joinType;
	}

	private JoinTableClause addJoinCritera(Criterion joinCriterion) {
		this.joinCriterions.add(joinCriterion);
		return this;
	}

	public JoinTableClause addJoinCritera(String condition) {
		return addJoinCritera(new Criterion(condition));
	}

	public JoinTableClause addJoinCritera(String condition, Object value,
			String typeHandler) {
		return addJoinCritera(new Criterion(condition, value, typeHandler));
	}

	public JoinTableClause addJoinCritera(String condition, Object value) {
		return addJoinCritera(condition, value, null);
	}

	public JoinTableClause addJoinCritera(String condition, Object value,
			Object secondValue, String typeHandler) {
		return addJoinCritera(new Criterion(condition, value, secondValue,
				typeHandler));
	}

	public JoinTableClause Criterion(String condition, Object value,
			Object secondValue) {
		return addJoinCritera(condition, value, secondValue, null);
	}

}
