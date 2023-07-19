package jdbc.db;

public class DBIntegrityException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public DBIntegrityException(String msg) {
		super(msg);
	}
}
