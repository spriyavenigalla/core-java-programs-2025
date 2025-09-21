package com.edu.jdbc.javaprogs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BlobClobDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String DB_URL = "jdbc:mysql://localhost:3306/files";
		String DB_USERNAME = "root";
		String DB_PASSWORD = "Password@123";
		String INSERT_SQL = "INSERT INTO Blobfile VALUES (?, ?, ?)";

		try {
			Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			PreparedStatement ps = con.prepareStatement(INSERT_SQL);
			File f = new File("C:\\Users\\Bharath Kumar\\OneDrive\\Desktop\\Lord-venkateswara-images-22.jpg");

			FileInputStream fis = new FileInputStream(f);
			
			ps.setInt(1, 1);
			ps.setString(2, "Lord-venkateswara-images-22");
			ps.setBinaryStream(3, fis);
			ps.executeUpdate();
			System.out.println(" Blob file is Insert Bharat");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
