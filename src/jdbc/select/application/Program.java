package jdbc.select.application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.db.DB;

public class Program {
	
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			connection = DB.getConnection();
			statement = connection.createStatement();
			
			resultSet = statement.executeQuery("SELECT * FROM department");
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt("Id") + " " + resultSet.getString("Name") );
			}
			
		} catch (SQLException e) { 
			e.printStackTrace();
		} finally {
			DB.closeStatement(statement);
			DB.closeResultSet(resultSet);
			DB.closeConnection();
		}
	}

}
