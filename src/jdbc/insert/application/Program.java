package jdbc.insert.application;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import jdbc.db.DB;

public class Program {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static String SQL_INSERT = 
			"INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) "
			+ "VALUES (?, ?, ?, ?, ?)";
	
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		
		
		try {
			connection = DB.getConnection();
			ps = connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1, "Wesley");
			ps.setString(2, "wesley@gmail.com");
			ps.setDate(3, new Date(sdf.parse("17/12/2003").getTime()));
			ps.setDouble(4, 22852.34);
			ps.setInt(5, 1);
			
			int rowsAffected = ps.executeUpdate();
			
			if(rowsAffected > 0) {
				ResultSet resultSet = ps.getGeneratedKeys();
				while(resultSet.next()) {
					int id = resultSet.getInt(1);
					System.out.println("Done! \nId: " + id);
				}
			} else {
				System.out.println("No rows Affected");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e ) {
			e.printStackTrace();
		} finally {
			
			DB.closeStatement(ps);
			DB.closeConnection();
		}
	}

}
