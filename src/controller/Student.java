package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Studentt","root","abc123");
Statement st=con.createStatement();
ResultSet rs = st.executeQuery("SELECT * FROM stu");
while (rs.next()) {

	System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
}
con.close();
		
	}

}
