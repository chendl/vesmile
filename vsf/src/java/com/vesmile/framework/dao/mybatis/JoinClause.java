package com.vesmile.framework.dao.mybatis;

import java.util.ArrayList;
import java.util.List;

public class JoinClause {
	public List<JoinTableClause> JoinTableClauses = new ArrayList<JoinTableClause>();
	public List<Criterion> whereCriterion = new ArrayList<Criterion>();
	
	public List<JoinTableClause> getJoinTableClauses() {
		return JoinTableClauses;
	}

	public List<Criterion> getWhereCriterion() {
		return whereCriterion;
	}

	public JoinTableClause addJoinTable(String tableName,String type){
		JoinTableClause joinTableClause = new JoinTableClause();
		joinTableClause.setJoinTable(tableName);
		joinTableClause.setJoinType(type);
		joinTableClause.setJoinClause(this);
		this.JoinTableClauses.add(joinTableClause);
		return joinTableClause;
	}
	
	private JoinClause addWhereCritera(Criterion joinCriterion) {
		this.whereCriterion.add(joinCriterion);
		return this;
	}

	public JoinClause addWhereCritera(String condition) {
		return addWhereCritera(new Criterion(condition));
	}
	
	public JoinClause addWhereCritera(String condition, Object value,
			String typeHandler) {
		return addWhereCritera(new Criterion(condition, value, typeHandler));
	}

	public JoinClause addWhereCritera(String condition, Object value) {
		return addWhereCritera(condition, value, null);
	}

	public JoinClause addWhereCritera(String condition, Object value,
			Object secondValue, String typeHandler) {
		return addWhereCritera(new Criterion(condition, value, secondValue,
				typeHandler));
	}

	public JoinClause Criterion(String condition, Object value,
			Object secondValue) {
		return addWhereCritera(condition, value, secondValue, null);
	}
	
}
