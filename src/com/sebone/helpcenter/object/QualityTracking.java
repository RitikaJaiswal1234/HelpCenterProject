package com.sebone.helpcenter.object;
  /**Class Name:- QualityTracking
	* Objective:- this class track the quality of question
	* @author :-Ritika jaiswal
	* Date:- 24/03/22
	*/
public class QualityTracking {
	private int questionId;
	private Boolean isLike;
	private int userId;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public Boolean getIsLike() {
		return isLike;
	}
	public void setIsLike(Boolean isLike) {
		this.isLike = isLike;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
