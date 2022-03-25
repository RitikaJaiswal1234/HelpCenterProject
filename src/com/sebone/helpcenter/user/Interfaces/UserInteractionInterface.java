package com.sebone.helpcenter.user.Interfaces;

import java.util.List;

import com.sebone.helpcenter.entity.CategoryDetails;
import com.sebone.helpcenter.entity.IssueSubCategory;
import com.sebone.helpcenter.entity.Question;
import com.sebone.helpcenter.entity.QuestionAnswerDetails;
import com.sebone.helpcenter.entity.SubCategoryDetails;
import com.sebone.helpcenter.entity.Tag;
import com.sebone.helpcenter.entity.User;
import com.sebone.helpcenter.entity.UserTracking;

public interface UserInteractionInterface {
	
	CategoryDetails getCategoryByUser(Boolean isGuest);
	
	SubCategoryDetails  getSubCategoryByCategoryId(CategoryDetails CategoryId,UserTracking trackingId);
	
	List<Question> getQuestionBySubCategoryId (IssueSubCategory SubCategoryId, UserTracking  trackingId);
	
	QuestionAnswerDetails getAnswerByQuestionId(Question QuestionId);
	
	Integer SetLikeOrDislikeOnAnswer (Question QuestionId ,Boolean isLike ,User userId);
	
	List<Question>  getQusetionByTag(Tag tagTittleName);

}
