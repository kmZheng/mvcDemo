package com.company.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SessionFactory {
	public static Connection getSession() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mvcdemo";
		String username = "root";
		String password = "101010";
		Connection con = DriverManager.getConnection(url,username,password); 
		return con;
	} 
	
	public static void closeConnection(ResultSet rs, Statement ps, Connection con){
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(con != null) con.close();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
