package com.vesmile.framework.model;

import java.io.Serializable;
import java.util.List;
/**
 * <p>
 * Title:QueryResult.java
 * </p>
 * <p>
 * Description:查询结果集
 * </p>
 * <p>
 * Copyright: Copyright (c) 2010
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author: jincool.cao@gmail.com
 * @version: 0.1
 * @time:2009-11-16 10:21:31
 */
public class QueryResult<T> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4387938452615520510L;
	public List<T> resultList;
	public long totalRecord;
	
	public List<T> getResultList() {
		return resultList;
	}
	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}
	public long getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(long totalRecord) {
		this.totalRecord = totalRecord;
	}
	
}
