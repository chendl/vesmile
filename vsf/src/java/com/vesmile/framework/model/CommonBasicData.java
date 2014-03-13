package com.vesmile.framework.model;

import java.io.Serializable;


/**
 * CommonBasicDataId entity. @author MyEclipse Persistence Tools
 */

public class CommonBasicData implements IPersistentObject {
	private Integer dataId;
	private Integer cmpyId;
	private String moduleCode;
	private Integer parentId;
	private String parentName;
	private String dataName;
	private String dataValue;
	private Integer dataPriority;
	private Integer dataFlag;
	private Integer dataType;
	// Constructors

	/** default constructor */
	public CommonBasicData() {
	}

	/** minimal constructor */
	public CommonBasicData(Integer dataId) {
		this.dataId = dataId;
	}

	/** full constructor */
	public CommonBasicData(Integer dataId, Integer cmpyId, String moduleCode,
			Integer parentId, String parentName, String dataName,
			String dataValue, Integer dataPriority, Integer dataFlag,
			Integer dataType) {
		this.dataId = dataId;
		this.cmpyId = cmpyId;
		this.moduleCode = moduleCode;
		this.parentId = parentId;
		this.parentName = parentName;
		this.dataName = dataName;
		this.dataValue = dataValue;
		this.dataPriority = dataPriority;
		this.dataFlag = dataFlag;
		this.dataType = dataType;
	}

	// Property accessors

	public Integer getDataId() {
		return this.dataId;
	}

	public void setDataId(Integer dataId) {
		this.dataId = dataId;
	}

	public Integer getCmpyId() {
		return this.cmpyId;
	}

	public void setCmpyId(Integer cmpyId) {
		this.cmpyId = cmpyId;
	}

	public String getModuleCode() {
		return this.moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getParentName() {
		return this.parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getDataName() {
		return this.dataName;
	}

	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	public String getDataValue() {
		return this.dataValue;
	}

	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}

	public Integer getDataPriority() {
		return this.dataPriority;
	}

	public void setDataPriority(Integer dataPriority) {
		this.dataPriority = dataPriority;
	}

	public Integer getDataFlag() {
		return this.dataFlag;
	}

	public void setDataFlag(Integer dataFlag) {
		this.dataFlag = dataFlag;
	}

	public Integer getDataType() {
		return this.dataType;
	}

	public void setDataType(Integer dataType) {
		this.dataType = dataType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CommonBasicData))
			return false;
		CommonBasicData castOther = (CommonBasicData) other;

		return ((this.getDataId() == castOther.getDataId()) || (this
				.getDataId() != null
				&& castOther.getDataId() != null && this.getDataId().equals(
				castOther.getDataId())))
				&& ((this.getCmpyId() == castOther.getCmpyId()) || (this
						.getCmpyId() != null
						&& castOther.getCmpyId() != null && this.getCmpyId()
						.equals(castOther.getCmpyId())))
				&& ((this.getModuleCode() == castOther.getModuleCode()) || (this
						.getModuleCode() != null
						&& castOther.getModuleCode() != null && this
						.getModuleCode().equals(castOther.getModuleCode())))
				&& ((this.getParentId() == castOther.getParentId()) || (this
						.getParentId() != null
						&& castOther.getParentId() != null && this
						.getParentId().equals(castOther.getParentId())))
				&& ((this.getParentName() == castOther.getParentName()) || (this
						.getParentName() != null
						&& castOther.getParentName() != null && this
						.getParentName().equals(castOther.getParentName())))
				&& ((this.getDataName() == castOther.getDataName()) || (this
						.getDataName() != null
						&& castOther.getDataName() != null && this
						.getDataName().equals(castOther.getDataName())))
				&& ((this.getDataValue() == castOther.getDataValue()) || (this
						.getDataValue() != null
						&& castOther.getDataValue() != null && this
						.getDataValue().equals(castOther.getDataValue())))
				&& ((this.getDataPriority() == castOther.getDataPriority()) || (this
						.getDataPriority() != null
						&& castOther.getDataPriority() != null && this
						.getDataPriority().equals(castOther.getDataPriority())))
				&& ((this.getDataFlag() == castOther.getDataFlag()) || (this
						.getDataFlag() != null
						&& castOther.getDataFlag() != null && this
						.getDataFlag().equals(castOther.getDataFlag())))
				&& ((this.getDataType() == castOther.getDataType()) || (this
						.getDataType() != null
						&& castOther.getDataType() != null && this
						.getDataType().equals(castOther.getDataType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDataId() == null ? 0 : this.getDataId().hashCode());
		result = 37 * result
				+ (getCmpyId() == null ? 0 : this.getCmpyId().hashCode());
		result = 37
				* result
				+ (getModuleCode() == null ? 0 : this.getModuleCode()
						.hashCode());
		result = 37 * result
				+ (getParentId() == null ? 0 : this.getParentId().hashCode());
		result = 37
				* result
				+ (getParentName() == null ? 0 : this.getParentName()
						.hashCode());
		result = 37 * result
				+ (getDataName() == null ? 0 : this.getDataName().hashCode());
		result = 37 * result
				+ (getDataValue() == null ? 0 : this.getDataValue().hashCode());
		result = 37
				* result
				+ (getDataPriority() == null ? 0 : this.getDataPriority()
						.hashCode());
		result = 37 * result
				+ (getDataFlag() == null ? 0 : this.getDataFlag().hashCode());
		result = 37 * result
				+ (getDataType() == null ? 0 : this.getDataType().hashCode());
		return result;
	}

	public Serializable getKey() {
		return getDataId();
	}

}