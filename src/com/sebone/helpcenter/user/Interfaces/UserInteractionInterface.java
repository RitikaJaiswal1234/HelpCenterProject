package com.sebone.helpcenter.user.Interfaces;

import java.util.List;

import com.sebone.helpcenter.object.CategoryDetails;
import com.sebone.helpcenter.object.IssueSubCategory;
import com.sebone.helpcenter.object.Question;
import com.sebone.helpcenter.object.QuestionAnswerDetails;
import com.sebone.helpcenter.object.SubCategoryDetails;
import com.sebone.helpcenter.object.Tag;
import com.sebone.helpcenter.object.User;
import com.sebone.helpcenter.object.UserTracking;

public interface UserInteractionInterface {
	
	CategoryDetails getCategoryByUser(Boolean isGuest);
	
	SubCategoryDetails  getSubCategoryByCategoryId(CategoryDetails CategoryId,UserTracking trackingId);
	
	List<Question> getQuestionBySubCategoryId (IssueSubCategory SubCategoryId, UserTracking  trackingId);
	
	QuestionAnswerDetails getAnswerByQuestionId(Question QuestionId);
	
	Integer SetLikeOrDislikeOnAnswer (Question QuestionId ,Boolean isLike ,User userId);
	
	List<Question>  getQusetionByTag(Tag tagTittleName);

}
