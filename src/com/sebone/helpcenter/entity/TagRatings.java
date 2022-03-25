package com.sebone.helpcenter.entity;
/**Class Name:- TagRatings
* Objective:- this class caontains the tagRating 
* @author :-Ritika jaiswal
* Date:- 24/03/22
*/
public class TagRatings {
	private String tag;
	private Long countAccess;
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Long getCountAccess() {
		return countAccess;
	}
	public void setCountAccess(Long countAccess) {
		this.countAccess = countAccess;
	}
}
