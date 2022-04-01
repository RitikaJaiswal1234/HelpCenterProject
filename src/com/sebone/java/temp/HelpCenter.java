package com.sebone.java.temp;
import java.util.ArrayList;

import com.sebone.helpcenter.object.IssueCategory;
//import com.sebone.java.temp.DbObject;
public class HelpCenter {

	public static void main(String[] args) {
	 DbObject dbObject = new DbObject();
	  ArrayList<IssueCategory> is=dbObject.getIssueCat();
	  for(IssueCategory res:is) {
		  System.out.println("category Id = " + res.getCategoryId() + " category Name = " + res.getCategoryName());
		 // System.out.println("category Name = " + res.getCategoryName());
	  }

	}

}
