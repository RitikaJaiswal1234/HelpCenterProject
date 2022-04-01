package com.sebone.helpcenter.system.data.access.layer;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Connection {
	static java.sql.Connection con;
	public static java.sql.Connection getconnection() {
		try {
			 String DB_URL="jdbc:mysql://localhost/prd_dbms";
			 String USER="root";
			 String PWD="Ritika@123";
			 con = DriverManager.getConnection(DB_URL,USER,PWD);
			return con;
		    }catch(SQLException e) {
		    	e.printStackTrace();
		    }
		return con;
	}
	public void closeConnection() {
		((Connection) con).closeConnection();
	}
	public PreparedStatement prepareStatement(String sqlquery) {
		// TODO Auto-generated method stub
		return null;
	}
}
