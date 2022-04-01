package com.sebone.java.temp;

import java.util.Date;

public class IsuueCategory {
	private long categoryId;
	private String categoryName;
	private String categoryDescription;
	private String categoryStatus;
	private Boolean isGuset;
	private Date lastModifiedAt;
	private Date createdAt;
	
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
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
	public Boolean getIsGuset() {
		return isGuset;
	}
	public void setIsGuset(Boolean isGuset) {
		this.isGuset = isGuset;
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
	public String toString(){
		return "categoryId=" + categoryId +"categoryName=" + categoryName;
	}
	
}



