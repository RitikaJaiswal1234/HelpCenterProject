package com.sebone.helpcenter.system.data.access.layer;
import java.util.*;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.sebone.helpcenter.object.IssueCategory;

public class IssueCategoryDAO extends Connection{
	public boolean insert(IssueCategory issueCategory) {
		boolean flag=false;
		try {
			String sqlquery="insert into issue_category(category_id,category_name,category_desc,category_status,is_guest,category_created_at,category_last_modified) values(?,?,?,?,?,?,?)";
			java.sql.Connection con= Connection.getconnection();
			PreparedStatement preparedStatement  = con.prepareStatement(sqlquery);
			preparedStatement.setInt(1,issueCategory.getCategoryId());
			preparedStatement.setString(2,issueCategory.getCategoryName());
			preparedStatement.setString(3,issueCategory.getCategoryDescription());
			preparedStatement.setString(4,issueCategory.getCategoryStatus());
			preparedStatement.setInt(5,issueCategory.getIsGuest());
			preparedStatement.setDate(7,new java.sql.Date(System.currentTimeMillis()));
			preparedStatement.setDate(6,new java.sql.Date(System.currentTimeMillis()));
			
		    int count = preparedStatement.executeUpdate();
		    
		    if(count!=0) {
		    	flag=true;
		    }
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
		public IssueCategory findAllData(int categoryId) {
			IssueCategory issueCategory = new IssueCategory();
//			category_id,category_name,category_desc,category_status,is_guest,category_created_at,category_last_modified
			try {
				String sqlquery="select * from issue_category where category_id=?";
				
				con=getconnection();
				PreparedStatement pt=con.prepareStatement(sqlquery);
				pt.setInt(1,categoryId);
				
				ResultSet resultSet = pt.executeQuery();
				//System.out.println(resultSet);
			    while(resultSet.next()) {
			    	issueCategory.setCategoryName(resultSet.getString("category_name"));
			    	issueCategory.setCategoryId(resultSet.getInt("category_id"));
			    	issueCategory.setCategoryDescription(resultSet.getString("category_desc"));
			    	issueCategory.setCategoryStatus(resultSet.getString("category_status"));
			    	issueCategory.setIsGuest(resultSet.getInt("is_guest"));
			    	issueCategory.setLastModifiedAt(resultSet.getDate("category_created_at"));
			    	issueCategory.setCreatedAt(resultSet.getDate("category_last_modified"));
			   }
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return issueCategory;
		}
			
	public boolean delete( int CategoryId) {
		int count=0;
		boolean flag=false;
		try {
			String sqlquery="delete from issue_category where Category_id=?";
			java.sql.Connection con= Connection.getconnection();
			
			PreparedStatement preparedStatement  = con.prepareStatement(sqlquery);
			preparedStatement.setInt(1,CategoryId);
			
		    count = preparedStatement.executeUpdate();
		    
		    if(count!=0) {
		    	flag=true;
		    }
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
		public boolean update(IssueCategory issuecategory) {
			int count=0;
			boolean flag=false;
			try {
				String sqluqery="update issue_category set category_name=?,category_desc=? where category_id=?";
				PreparedStatement preparedStatement  = con.prepareStatement(sqluqery);
				
				preparedStatement.setString(1,issuecategory.getCategoryName());
				preparedStatement.setString(2,issuecategory.getCategoryDescription());
				preparedStatement.setInt(3, issuecategory.getCategoryId());
				
				count=preparedStatement.executeUpdate();
				
				if(count!=0) {
					flag=true;
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return flag;
		}
	
   /*public static void main(String[] arg) {
	IssueCategory issueCategory = new IssueCategory();
	issueCategory.setCategoryId(125);
	IssueCategoryDAO issueCategoryDAO = new IssueCategoryDAO();
	issueCategory = issueCategoryDAO.findAllData(issueCategory.getCategoryId());
	System.out.println(issueCategory);
	
}*/
}



