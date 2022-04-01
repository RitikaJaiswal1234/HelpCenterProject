package com.sebone.helpcenter.object;

import java.util.Date;
	
  /**
    * Class Name:- IssueCategory 
	* Objective:- this class cantains the details of category
	* @author :-Ritika jaiswal
	* Date:- 24/03/22
	*/
public class IssueCategory {
	private int categoryId;
	private String categoryName;
	private String categoryDescription;
	private String categoryStatus;
	private int isGuest;
	private Date lastModifiedAt;
	private Date createdAt;
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public String getCategoryStatus() {
		return categoryStatus;
	}
	public void setCategoryStatus(String categoryStatus) {
		this.categoryStatus = categoryStatus;
	}
	public int getIsGuest() {
		return isGuest;
	}
	public void setIsGuest(int isGuest) {
		this.isGuest = isGuest;
	}
	public Date getLastModifiedAt() {
		return lastModifiedAt;
	}
	public void setLastModifiedAt(Date lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
}
