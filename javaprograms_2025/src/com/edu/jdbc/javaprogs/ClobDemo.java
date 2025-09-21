package com.edu.jdbc.javaprogs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClobDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String DB_URL = "jdbc:mysql://localhost:3306/files";
		String DB_USERNAME = "root";
		String DB_PASSWORD = "Password@123";
		String INSERT_SQL = "INSERT INTO Clobfile VALUES (?, ?, ?)";
		
		try {
			Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			PreparedStatement ps = con.prepareStatement(INSERT_SQL);
			File f = new File("C:\\Users\\Bharath Kumar\\OneDrive\\Desktop\\clob.txt");

			FileReader fr = new FileReader(f);
			
			ps.setInt(1, 1);
			ps.setString(2, "clob");
			ps.setCharacterStream(3, fr);
			ps.executeUpdate();
			System.out.println(" Clob file is Insert Bharat");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
