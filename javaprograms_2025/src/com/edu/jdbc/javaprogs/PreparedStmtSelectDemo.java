package com.edu.jdbc.javaprogs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStmtSelectDemo {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/Library";

	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "Password@123";
	private static final String SELECT_SQL ="SELECT BOOK_ID, BOOK_NAME, BOOK_PRICE FROM BOOKS WHERE BOOK_PRICE>=?";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con= DriverManager.getConnection(DB_URL,DB_USERNAME, DB_PASSWORD);
			PreparedStatement ps=con.prepareStatement(SELECT_SQL);
			ps.setDouble(1, 1000);
			ResultSet rs= ps.executeQuery();
			System.out.println("*** books ****");
			
			while(rs.next()) {
				int id=rs.getInt("BOOK_ID");
				String name=rs.getString("BOOK_Name");
				double price =rs.getDouble("BOOK_PRICE");
				System.out.println("BOOK_ID "+id+" BOOK_NAME "+name+" BOOK_PRICE "+price);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
