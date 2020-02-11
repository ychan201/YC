package oracle.exam2;

import java.sql.Connection;

import oracle.db.DBManager;

public class DBTest {
	public static void main(String[] args) throws Exception{
		DBManager manager = DBManager.getInstance();
		Connection conn = manager.getConnection();
		System.out.println(conn);
	}
}
