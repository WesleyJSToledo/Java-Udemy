package jdbc.delete.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.db.DB;
import jdbc.db.DBIntegrityException;

public class Program {
	private static String SQL_DELETE =
			"DELETE FROM department WHERE Id = ?";
	
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			connection = DB.getConnection();
			ps = connection.prepareStatement(SQL_DELETE);
			ps.setInt(1, 7);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new DBIntegrityException(e.getMessage());
		}
	}
}
