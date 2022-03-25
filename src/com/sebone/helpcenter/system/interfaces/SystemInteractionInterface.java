package com.sebone.helpcenter.system.interfaces;

import java.sql.Date;
import java.util.List;

import com.sebone.helpcenter.entity.AnswerRatings;
import com.sebone.helpcenter.entity.ResolvedByDate;
import com.sebone.helpcenter.entity.ResolvedQuestionRatings;
import com.sebone.helpcenter.entity.TagRatings;

public interface SystemInteractionInterface {
	
	List<AnswerRatings> getAnswerRatingsListByMostLikes();
	
	List<ResolvedQuestionRatings> getQuestionMostResolved();
	
	List<TagRatings> getMostAccessedTags();
	
	List<ResolvedByDate> countOfResolvedQuestion(Date startDate, Date endDate);


}
