package com.sebone.helpcenter.object;

import java.util.Date;

  /**
    * Class Name:- IssueSubCategory
	* Objective:- this class contains the details of subCategory
	* @author :-Ritika jaiswal
	* Date:- 24/03/22
	*/
public class IssueSubCategory {
	private int subCategoryId;
	private int categoryId;
	private String subCategorydescription;
	private String subCategoryName;
	private String subCategoryStatus;
	private Date subCategoryCreated;
	
	public int getsubCategoryId() {
		return subCategoryId;
	}
	public void setsubCategoryId(int categoryId) {
		this.subCategoryId = categoryId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getSubcategorydescription() {
		return subCategorydescription;
	}
	public void setSubcategorydescription(String subcategorydescription) {
		this.subCategorydescription = subcategorydescription;
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
