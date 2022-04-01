package com.sebone.java.temp;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatement {
	static String DB_URL = "jdbc:mysql://localhost:3306/prd_dbms";
	static String USER = "root";
	static String PWD = "Ritika@123";
	public static void main(String[] args, Object tag_Title) {
		Scanner sc = new Scanner(System.in);
	try {
		Connection con = DriverManager.getConnection(DB_URL,USER,PWD);
		String query="insert into Tag values(?,?)";
        PreparedStatement prepstmt = (PreparedStatement) con.prepareStatement(query);
		while(true) {
	     System.out.println("Enter TagId = tag_id");
	     Object tag_id;
		sc.setnextInt(1,tag_id);
	     sc.nextLine();
	     System.out.println("Enter TagTitle = tag_title");
	     sc.setString(2,tag_Title);
		}
		con.close();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}
}
