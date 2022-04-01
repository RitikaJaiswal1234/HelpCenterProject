package com.sebone.helpcenter.system.data.access.layer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sebone.helpcenter.object.IssueSubCategory;

public class IssueSubCategoryDAO extends Connection  {
	public boolean insert (IssueSubCategory issueSubCategory ) {
		boolean flag = false;
		try {
			String query="insert into issue_sub_category(sub_category_id,category_id,sub_category_desh,sub_category_name,sub_category_status,sub_category_created_at)values(?,?,?,?,?,?)";
		    java.sql.Connection con = Connection.getconnection();
			PreparedStatement preparedStatement  = con.prepareStatement(query);
			preparedStatement.setInt(1,issueSubCategory.getsubCategoryId());
			preparedStatement.setInt(2,issueSubCategory.getCategoryId());
			preparedStatement.setString(3,issueSubCategory.getSubcategorydescription());
			preparedStatement.setString(4,issueSubCategory. getSubCategoryName());
			preparedStatement.setString(5,issueSubCategory.getSubCategoryStatus());
			preparedStatement.setDate(6,new java.sql.Date(System.currentTimeMillis()));
			 int count = preparedStatement.executeUpdate();
			 if(count!=0) {
				 flag = true;
			 }
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public IssueSubCategory readData(int subCategoryId) {
		IssueSubCategory issueSubCategory = new IssueSubCategory();
		try {
			String query = "select * from issue_sub_category where sub_category_id=?";
			con=getconnection();
			PreparedStatement ps =con.prepareStatement(query);
			ps.setInt(1, subCategoryId);
			
			ResultSet resultSet = ps.executeQuery();
			//System.out.println(resultSet);
		    while(resultSet.next()) {
		    	issueSubCategory.setsubCategoryId(resultSet.getInt("Sub_category_id"));
		    	issueSubCategory.setCategoryId(resultSet.getInt("category_id"));
		    	issueSubCategory.setSubcategorydescription(resultSet.getString("sub_category_desh"));
		    	issueSubCategory.setSubCategoryName(resultSet.getString("sub_category_name"));
		    	issueSubCategory.setSubCategoryStatus(resultSet.getString("sub_category_status"));
		    	issueSubCategory.setSubCategoryCreated(resultSet.getDate("sub_category_created_at"));
		   }
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return issueSubCategory;
	}
	
	public boolean update(IssueSubCategory issueSubCategory) {
		boolean flag = false;
		try {
			String query="update issue_sub_category set sub_category_name,sub_category_status,sub_category_desh where sub_category_id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,issueSubCategory.getSubCategoryName());
			ps.setString(2,issueSubCategory.getSubCategoryStatus());
			ps.setString(3,issueSubCategory.getSubcategorydescription());
			ps.setLong(4,issueSubCategory.getCategoryId());
			int count=ps.executeUpdate();
			
			if(count!=0) {
				flag=true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
		
	}
	public boolean delete(int subCategoryId) {
		int count=0;
		boolean flag=false;
		try {
			String sqlquery="delete from issue_sub_category where sub_category_id=?";
			java.sql.Connection con= Connection.getconnection();
			
			PreparedStatement preparedStatement  = con.prepareStatement(sqlquery);
			preparedStatement.setInt(1,subCategoryId);
			
		    count = preparedStatement.executeUpdate();
		    
		    if(count!=0) {
		    	flag=true;
		    }
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
 /*  public static void main(String[] arg) {
	IssueSubCategory issueCategory = new IssueSubCategory();
	issueCategory.setCategoryId(125);
	IssueSubCategoryDAO issueCategoryDAO = new IssueSubCategoryDAO();
	issueCategory = issueCategoryDAO.readData(issueCategory.getCategoryId());
	System.out.println(issueCategory);
   
	IssueSubCategory issueCategory1 = new IssueSubCategory();
	issueCategory.setCategoryId(125);
	IssueSubCategoryDAO issueCategoryDAO1 = new IssueSubCategoryDAO();
	issueCategory = issueCategoryDAO.delete(issueCategory.getCategoryId());
	System.out.println(issueCategory);
   
   }*/
 }

