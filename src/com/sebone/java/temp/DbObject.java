package com.sebone.java.temp;
import java.sql.Statement;
import java.util.ArrayList;

import com.sebone.helpcenter.object.IssueCategory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DbObject {
		static String DB_URL = "jdbc:mysql://localhost:3306/prd_dbms";
		static String USER = "root";
		static String PWD = "Ritika@123";
		ArrayList<IssueCategory>arraylist = new ArrayList<IssueCategory>();
		public ArrayList<IssueCategory> getIssueCat() {
		try {
			Connection con = DriverManager.getConnection(DB_URL,USER,PWD);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select category_id,category_name from issue_category");
			while(rs.next()) {
				IssueCategory isuecategory = new IssueCategory();
				isuecategory.setCategoryId(rs.getInt("category_id"));
				isuecategory.setCategoryName(rs.getString("category_name"));
				arraylist.add(isuecategory);
			}
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return arraylist;
	     
		}

	}


