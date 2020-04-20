package joinexam.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	private DBManager() {} // 외부에서 객체생성 금지 - 싱글 톤 방식. 커넥션을 하나를 열어놓고, 공유하는 방식
	private static DBManager instance = new DBManager();
	public static DBManager getinstance() {
		return instance;
	}
	public Connection getConnection() throws Exception{
			Connection conn = null;
			String myDriver="oracle.jdbc.driver.OracleDriver";
			String myURL="jdbc:oracle:thin:@localhost:1521:xe";
			String myID="system";
			String myPW="1234";
			Class.forName(myDriver);
			try {
				conn = DriverManager.getConnection(myURL,myID,myPW);
			}catch(Exception e) {}
			return conn;
		}
}
