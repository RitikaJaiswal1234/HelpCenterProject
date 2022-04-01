package com.sebone.helpcenter.system.implimentation;

import java.sql.Date;
import java.util.List;

import com.sebone.helpcenter.object.AnswerRatings;
import com.sebone.helpcenter.object.ResolvedByDate;
import com.sebone.helpcenter.object.ResolvedQuestionRatings;
import com.sebone.helpcenter.object.TagRatings;
	/**Class Name :- SystemserviceImplementation 
	* Objective:- this class contains the four method which is implement on system interface
	* @author :-Ritika jaiswal
	* Date:- 24/03/22
    */
public class SystemserviceImplementation {
	/**
     * Method Name : getAnswerRatingsListByMostLikes
     * Objective :The objective of this method is to get the list of AnswerRating based on the number of likes on the answer.
     * @param : Enough information is available so no input is required.
     * return : list of answer ratings
     * Date : 17/03/2022
     */  
	    List<AnswerRatings> getAnswerRatingsListByMostLikes(){
		    return null;
     	}
	 /**
	  * Method Name : getQuestionMostResolved
	   * Objective : The objective of this method is to get the list of most resolved Questions based on the number of questions resolved.
	   * @param : Enough information is available so no input is required.
	   * return : returns integer as count
	   * Date : 17/03/2022
	   */  
		List<ResolvedQuestionRatings> getQuestionMostResolved(){
			return null;
		}
	/**
	 * Method Name : getMostAccessedTags
	 * Objective : This method is for getting the list of tags which is most accessed by users. The list will be in the descending order
	 * @param : Enough information is available so no input is required.
	 * return : returns the list of Tag Ratings
	 * Date : 17/03/2022
	 */  
		List<TagRatings> getMostAccessedTags(){
			return null;
		}
		
		/**
		 * Method Name : countOfResolvedQuestion
		 * Objective : This method is for getting a number of questions which are resolved in a day. 
		 * @param : startDate
		 * @param : endDate
		 * return : list of resolved by date
		 * Date : 17/03/2022
		 */  
		List<ResolvedByDate> countOfResolvedQuestion(Date startDate, Date endDate){
			return null;
		}
}
