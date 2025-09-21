package com.edu.jdbc.javaprogs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatement {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/Library";

	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "Password@123";
	private static final String INSERT_SQL ="INSERT INTO BOOKS Values (?, ?, ?)";
	private static final String SELECT_SQL ="SELECT BOOK_ID, BOOK_NAME, BOOK_PRICE FROM BOOKS WHERE BOOK_PRICE>=?";
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		select();
		insert();
		

	}
	
	public static void insert() {
		try {
			Connection con= DriverManager.getConnection(DB_URL,DB_USERNAME, DB_PASSWORD);
			java.sql.PreparedStatement ps=con.prepareStatement(INSERT_SQL);
			ps.setInt(1, 1);
			ps.setString(2, "Java");
			ps.setDouble(3, 2000);
			int records=ps.executeUpdate();
			System.out.println(records+"  Records Insert Bharat");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public static void select() {
		try {
			Connection con= DriverManager.getConnection(DB_URL,DB_USERNAME, DB_PASSWORD);
			java.sql.PreparedStatement ps=con.prepareStatement(SELECT_SQL);
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
