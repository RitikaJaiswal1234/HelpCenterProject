package com.sebone.helpcenter.object;

import java.util.Date;
  /**Class Name:- UserTracking 
	* Objective:- this class tracks the behaviour of user
	* @author :-Ritika jaiswal
	* Date:- 24/03/22
	*/
public class UserTracking {
	private int trackingId;
	private int userId;
	private int categoryId;
	private int subCategoryId;
	private int questionId;
	private int roomId;
	private Boolean isResolved;
	private Date startTime;
	private Date lastUpdatedAt;
	
	public int getTrackingId() {
		return trackingId;
	}
	public void setTrackingId(int trackingId) {
		this.trackingId = trackingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public Boolean getIsResolved() {
		return isResolved;
	}
	public void setIsResolved(Boolean isResolved) {
		this.isResolved = isResolved;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getLastUpdatedAt() {
		return lastUpdatedAt;
	}
	public void setLastUpdatedAt(Date lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}
}
