package com.sebone.helpcenter.entity;
  /**
    * Class Name:- AnswerRatings 
	* Objective:- this class sets the like or dislike which is given by the user
	* @author :-Ritika jaiswal
	* Date:- 24/03/22
	*/
public class AnswerRatings {
	private String answer;
	private long likeCount;
	private long disLikeCount;
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public long getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(long likeCount) {
		this.likeCount = likeCount;
	}
	public long getDisLikeCount() {
		return disLikeCount;
	}
	public void setDisLikeCount(long disLikeCount) {
		this.disLikeCount = disLikeCount;
	}
}
