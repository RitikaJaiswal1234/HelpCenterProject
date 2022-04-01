package com.sebone.helpcenter.object;
/**Class Name:- CategoryDetails 
* Objective:- this class gives the category details based on categries and trackingId
* @author :-Ritika jaiswal
* Date:- 24/03/22
*/
public class CategoryDetails {
	private String categories;
	private long trackingId;
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public long getTrackingId() {
		return trackingId;
	}
	public void setTrackingId(long trackingId) {
		this.trackingId = trackingId;
	}
}
