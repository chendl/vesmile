package com.vesmile.framework.dao.mybatis;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class BaseExample<T> {
	protected boolean distinct;

    protected String orderByClause;

    protected List<T> oredCriteria;
    
    protected JoinClause joinClause;
	
	private JoinTableClause addJoinTable(String table,String type){
		if(joinClause==null)
			joinClause = new JoinClause();
		return joinClause.addJoinTable(table, type);
    }
	
	public JoinTableClause addInnerJoinTable(String table){
		return addJoinTable(table, JoinTableClause.JOIN_INNER);
    }

	public JoinTableClause addOuterJoinTable(String table){
		return addJoinTable(table, JoinTableClause.JOIN_OUTER);
    }
	
	public JoinClause getJoinClause() {
		return joinClause;
	}

	public void setJoinClause(JoinClause joinClause) {
		this.joinClause = joinClause;
	}

    public BaseExample() {
        oredCriteria = new ArrayList<T>();
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public T createCriteria() {
        T criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public List<T> getOredCriteria() {
        return oredCriteria;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public T or() {
        T criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public void or(T criteria) {
        oredCriteria.add(criteria);
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    protected  T createCriteriaInternal(){
    	Type genType = getClass().getGenericSuperclass();  
        @SuppressWarnings("unchecked")
		Class<T> entityClass = (Class<T>) ((ParameterizedType) genType).getActualTypeArguments()[0];  
        try {  
            return entityClass.newInstance();  
        } catch (InstantiationException e) {  
            e.printStackTrace();  
        } catch (IllegalAccessException e) {  
            e.printStackTrace();  
        }  
        return null;
    }

}