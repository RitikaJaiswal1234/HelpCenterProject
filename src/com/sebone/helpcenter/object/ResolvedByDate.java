package com.sebone.helpcenter.object;
import java.util.Date;
  /**Class Name:- ResolvedByDate
	* Objective:- this class contain resolved number of qusetion according to date
	* @author :-Ritika jaiswal
	* Date:- 24/03/22
	*/
public class ResolvedByDate {
	private Date dateFrom;
	private Date dateTo;
	private String listOfNoOfResolve;
	
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	public String getListOfNoOfResolve() {
		return listOfNoOfResolve;
	}
	public void setListOfNoOfResolve(String listOfNoOfResolve) {
		this.listOfNoOfResolve = listOfNoOfResolve;
	}
}
