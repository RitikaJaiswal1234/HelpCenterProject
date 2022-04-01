package com.sebone.helpcenter.system.data.access.layer;

import java.sql.SQLException;

import com.sebone.helpcenter.object.Question;

public class QuestionDAO extends Connection {
	public boolean insert(Question question) {
		boolean flag = false;
		try {
			String query = "insert into Question values(?,?,?,?,?,?,?)";
			java.sql.Connection con = Connection.getconnection();
			java.sql.PreparedStatement ps  = con.prepareStatement(query);
			ps.setInt(1,question.getQuestionId());
			ps.setInt(2,question.getSubCategoryId());
			ps.setString(3,question.getFullQuestion());
			ps.setBoolean(4,question.getIsGuest());
			ps.setString(5,question.getQuestionStatus());
			ps.setString(6,question.getFullAnswer());
			ps.setDate(7,new java.sql.Date(System.currentTimeMillis()));
			int count=ps.executeUpdate();
		       if(count!=0) {
	    	   flag=true;
	        }
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return flag;
	}
}

