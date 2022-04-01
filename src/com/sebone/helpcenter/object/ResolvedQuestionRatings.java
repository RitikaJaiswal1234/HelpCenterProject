package com.sebone.helpcenter.object;
  /**Class Name:- ResolvedQuestionRatings
	* Objective:- this class resolved the question based on ratings
	* @author :-Ritika jaiswal
	* Date:- 24/03/22
	*/
public class ResolvedQuestionRatings {
	private int questionId;
	private String question;
	private long questiontResolved;
	private long questionPanding;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public long getQuestiontResolved() {
		return questiontResolved;
	}
	public void setQuestiontResolved(long questiontResolved) {
		this.questiontResolved = questiontResolved;
	}
	public long getQuestionPanding() {
		return questionPanding;
	}
	public void setQuestionPanding(long questionPanding) {
		this.questionPanding = questionPanding;
	}
}
