package com.sebone.helpcenter.entity;

import java.util.Date;

  /**
    * Class Name:- IssueSubCategory
	* Objective:- this class contains the details of subCategory
	* @author :-Ritika jaiswal
	* Date:- 24/03/22
	*/
public class IssueSubCategory {
	private int categoryId;
	private String subcategorydescription;
	private String subCategoryName;
	private String subCategoryStatus;
	private Date subCategoryCreated;
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getSubcategorydescription() {
		return subcategorydescription;
	}
	public void setSubcategorydescription(String subcategorydescription) {
		this.subcategorydescription = subcategorydescription;
	}
	public String getSubCategoryName() {
		return subCategoryName;
	}
	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}
	public String getSubCategoryStatus() {
		return subCategoryStatus;
	}
	public void setSubCategoryStatus(String subCategoryStatus) {
		this.subCategoryStatus = subCategoryStatus;
	}
	public Date getSubCategoryCreated() {
		return subCategoryCreated;
	}
	public void setSubCategoryCreated(Date subCategoryCreated) {
		this.subCategoryCreated = subCategoryCreated;
	}
}
