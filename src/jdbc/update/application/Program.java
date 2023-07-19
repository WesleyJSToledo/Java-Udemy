package jdbc.update.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.db.DB;

public class Program {
	private static String SQL_UPDATE = 
			"UPDATE FROM seller"
			+ "SET BaseSalary = BaseSalary + ?"
			+ "WHERE DepartamentId = ?";
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			
			connection = DB.getConnection();
			ps = connection.prepareStatement(SQL_UPDATE);
			
			ps.setDouble(1, 123.23);
			ps.setInt(2, 1);
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(ps);
			DB.closeConnection();
		}
	}

}
