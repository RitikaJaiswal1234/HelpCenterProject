package com.sebone.helpcenter.object;
  /**Class Name:- QuestionAnswerDetails
	* Objective:- this class gives the answer based on question id
	* @author :-Ritika jaiswal
	* Date:- 24/03/22
	*/
public class QuestionAnswerDetails {
	private int questionId;
	private String Answer;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
}
