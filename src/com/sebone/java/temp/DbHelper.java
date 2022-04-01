package com.sebone.java.temp;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbHelper {
	static String DB_URL = "jdbc:mysql://localhost:3306/prd_dbms";
	static String USER = "root";
	static String PWD = "Ritika@123";
	public static void main(String[] args) {
	try {
		Connection con = DriverManager.getConnection(DB_URL,USER,PWD);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select category_id,category_name from issue_category");
		while(rs.next()) {
			System.out.println("id="+rs.getInt("category_id"));
			System.out.println("Name="+rs.getString("category_name"));
		}
		con.close();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}
}
