package com.sebone.helpcenter.user.Implementation;

import java.util.List;

import com.sebone.helpcenter.object.CategoryDetails;
import com.sebone.helpcenter.object.IssueSubCategory;
import com.sebone.helpcenter.object.Question;
import com.sebone.helpcenter.object.QuestionAnswerDetails;
import com.sebone.helpcenter.object.SubCategoryDetails;
import com.sebone.helpcenter.object.Tag;
import com.sebone.helpcenter.object.User;
import com.sebone.helpcenter.object.UserTracking;
/**Class Name:- UserServiceImplementation
* Objective:- this class contains six method which is implement on the user interface
* @author :-Ritika jaiswal
* Date:- 24/03/22
*/
public class UserServiceImplementation {
	/**
	 * Method Name : getCategoryByCategory
     * objestive : this Mathod gives the category details 
     * @param : Boolean isGuest
     * @return : CategoryDetails
     */
     CategoryDetails getCategoryByUser(Boolean isGuest) {
	      return null;
    }
     
     /**
      * Method Name : getSubCategoryByCategoryId
      * objestive : The objective of this method is to get the subcategory details  based on Category id. 
      * @param : CategoryId
      * @param : trackingId
      * @return : SubCategoryDetails
      */
	SubCategoryDetails  getSubCategoryByCategoryId(CategoryDetails CategoryId,UserTracking trackingId) {
		 return null;
	}
	
	/**
	 * Method Name : getQuestionBySubCategoryId 
	 * Objective : This method  provide the List of questions which are based on Subcategory id.
	 * @param : SubCategoryId
	 * @param : trackingId
	 * @return : List of question
	 */
	List<Question> getQuestionBySubCategoryId (IssueSubCategory SubCategoryId, UserTracking  trackingId){
		return null;
	}
	
	/**
	 * Method Name : getAnswerByQuestionId
	 * Objective : The objective of this method is to get the answers which are related to questionId. 
	 * @param : QuestionId
	 * @return : questionAnswerDetails
	 */
	
	QuestionAnswerDetails getAnswerByQuestionId(Question QuestionId) {
		return null;
	}
	
	/**
	 * Method Name : SetLikeOrDislikeOnAnswer
	 * Objective : This method sets like or dislikes the answer by question id.
	 * @param : QuestionId
	 * @param : isLike
	 * @param : userId
	 * @return : either number of like or number of dislike
	 */
	Integer SetLikeOrDislikeOnAnswer (Question QuestionId ,Boolean isLike ,User userId) {
		return null;
	}
	
	/**
	 * Method Name : getQusetionByTag
	 * Objective : This method provide the list of questions according to the tag title  For Example, payment tag, if user type payment keyword  in his question then 
            	List of questions of that particular tag is provided to the user.
	 * @param : tagTittleName
	 * @return : list of question
	 */
	List<Question> getQusetionByTag(Tag tagTittleName){
		return null;
	}
}
