package com.test1;

public class FactorySupportLauncher {
	private Integer setId;
	private Integer factorySupportId;
	private String factorySupportBudgetIndicator;
	private String factorySuppportSheet;
	private String factorySupportControlFlag;
	private String factorySupportDesc;
	private String factorySupportShortDesc;
	private String factorySuppportType;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public FactorySupportLauncher() {

	}

	public FactorySupportLauncher(Integer setId, Integer factorySupportId, String factorySupportBudgetIndicator,
			String factorySuppportSheet, String factorySupportControlFlag, String factorySupportDesc,
			String factorySupportShortDesc, String factorySuppportType, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.setId = setId;
		this.factorySupportId = factorySupportId;
		this.factorySupportBudgetIndicator = factorySupportBudgetIndicator;
		this.factorySuppportSheet = factorySuppportSheet;
		this.factorySupportControlFlag = factorySupportControlFlag;
		this.factorySupportDesc = factorySupportDesc;
		this.factorySupportShortDesc = factorySupportShortDesc;
		this.factorySuppportType = factorySuppportType;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getSetId() {
		return setId;
	}

	public void setSetId(Integer setId) {
		this.setId = setId;
	}

	public Integer getFactorySupportId() {
		return factorySupportId;
	}

	public void setFactorySupportId(Integer factorySupportId) {
		this.factorySupportId = factorySupportId;
	}

	public String getFactorySupportBudgetIndicator() {
		return factorySupportBudgetIndicator;
	}

	public void setFactorySupportBudgetIndicator(String factorySupportBudgetIndicator) {
		this.factorySupportBudgetIndicator = factorySupportBudgetIndicator;
	}

	public String getFactorySuppportSheet() {
		return factorySuppportSheet;
	}

	public void setFactorySuppportSheet(String factorySuppportSheet) {
		this.factorySuppportSheet = factorySuppportSheet;
	}

	public String getFactorySupportControlFlag() {
		return factorySupportControlFlag;
	}

	public void setFactorySupportControlFlag(String factorySupportControlFlag) {
		this.factorySupportControlFlag = factorySupportControlFlag;
	}

	public String getFactorySupportDesc() {
		return factorySupportDesc;
	}

	public void setFactorySupportDesc(String factorySupportDesc) {
		this.factorySupportDesc = factorySupportDesc;
	}

	public String getFactorySupportShortDesc() {
		return factorySupportShortDesc;
	}

	public void setFactorySupportShortDesc(String factorySupportShortDesc) {
		this.factorySupportShortDesc = factorySupportShortDesc;
	}

	public String getFactorySuppportType() {
		return factorySuppportType;
	}

	public void setFactorySuppportType(String factorySuppportType) {
		this.factorySuppportType = factorySuppportType;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
