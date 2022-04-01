package com.sebone.helpcenter.system.interfaces;

import java.sql.Date;
import java.util.List;

import com.sebone.helpcenter.object.AnswerRatings;
import com.sebone.helpcenter.object.ResolvedByDate;
import com.sebone.helpcenter.object.ResolvedQuestionRatings;
import com.sebone.helpcenter.object.TagRatings;

public interface SystemInteractionInterface {
	
	List<AnswerRatings> getAnswerRatingsListByMostLikes();
	
	List<ResolvedQuestionRatings> getQuestionMostResolved();
	
	List<TagRatings> getMostAccessedTags();
	
	List<ResolvedByDate> countOfResolvedQuestion(Date startDate, Date endDate);


}
