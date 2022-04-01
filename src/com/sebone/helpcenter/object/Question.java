package com.sebone.helpcenter.object;

import java.util.Date;
  /**Class Name:- Question
	* Objective:- this class gives the answer based on questionId and the questionId based on subCategory
	* @author :-Ritika jaiswal
	* Date:- 24/03/22
	*/
public class Question {
	private int questionId;
	private int subCategoryId;
	private String fullQuestion;
	private Boolean isGuest;
	private String questionStatus;
	private String fullAnswer;
	private Date questionCreatedAt;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public String getFullQuestion() {
		return fullQuestion;
	}
	public void setFullQuestion(String fullQuestion) {
		this.fullQuestion = fullQuestion;
	}
	public Boolean getIsGuest() {
		return isGuest;
	}
	public void setIsGuest(Boolean isGuest) {
		this.isGuest = isGuest;
	}
	public String getQuestionStatus() {
		return questionStatus;
	}
	public void setQuestionStatus(String questionStatus) {
		this.questionStatus = questionStatus;
	}
	public String getFullAnswer() {
		return fullAnswer;
	}
	public void setFullAnswer(String fullAnswer) {
		this.fullAnswer = fullAnswer;
	}
	public Date getQuestionCreatedAt() {
		return questionCreatedAt;
	}
	public void setQuestionCreatedAt(Date questionCreatedAt) {
		this.questionCreatedAt = questionCreatedAt;
	}
}
