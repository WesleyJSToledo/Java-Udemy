package jdbc.transactions.application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.db.DB;
import jdbc.db.DBException;

public class Program {

	public static void main(String[] args) {
		Connection connection = null;
		Statement st = null;
		
		try {
			connection = DB.getConnection();
			connection.setAutoCommit(false);
			st = connection.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = BaseSalary + 2000 WHERE DepartmentId = 1");
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = BaseSalary + 3000 WHERE DepartmentId = 2");
			
			
			connection.commit();
			
			System.out.println("Rows 1: " + rows1);
			System.out.println("Rows 2: " + rows2);
			
		} catch (SQLException e) {
			try {
				connection.rollback();
				throw new DBException(e.getMessage());
			} catch (SQLException ex) {
				throw new DBException("Error trying to rollback! Caused by: "+ ex.getMessage());
			}
		}
	}

}
