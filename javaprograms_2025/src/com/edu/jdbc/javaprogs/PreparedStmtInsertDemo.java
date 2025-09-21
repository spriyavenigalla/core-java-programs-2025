package com.edu.jdbc.javaprogs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStmtInsertDemo {	private static final String DB_URL = "jdbc:mysql://localhost:3306/Library";

private static final String DB_USERNAME = "root";
private static final String DB_PASSWORD = "Password@123";
private static final String INSERT_SQL ="INSERT INTO BOOKS Values (?, ?, ?)";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con= DriverManager.getConnection(DB_URL,DB_USERNAME, DB_PASSWORD);
			PreparedStatement ps=con.prepareStatement(INSERT_SQL);
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

}
