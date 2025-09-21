package com.edu.jdbc.javaprogs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertJdbcDemo {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/Library";

	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "Password@123";
	private static final String INSERT_SQL = "INSERT INTO BOOKS VALUES(102,'Python',2200),"+
			                                                           "(103,'Dot Net',3200),"+
			                                                            "(104,'Django',24400)";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Class.forName("com.mysql.cjjdbc.Driver");

			Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			
			Statement  st=con.createStatement();
			int rowsEffected=st.executeUpdate(INSERT_SQL);
			System.out.println(rowsEffected+" Records inserted");
			} catch (SQLException e) {

			e.printStackTrace();
		}

		

	}

}
