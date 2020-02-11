package jdbc;
/*	JAVA + DB
 * 1. JDBC ����̹� �ε�  - API �ε�
 * 2. Ŀ�ؼ� ���� - �ٸ��� ����
 * 3. ��ɹ� ���� - �����Ӱ� �շ�
 * DB�� �����Ҷ� ���� �⺻���� ��Ű�� import
 */
import java.sql.*;

public class Exam_01 {
	public static void main(String[] args) {
		// JDBC ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // API�� �ҷ��� �� ���� Ŭ����.
			System.out.println("����̹� �ε� ����");
		}catch(Exception e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
			}
		
		// Ŀ�ؼ� ����
		String myURL="jdbc:oracle:thin:@localhost:1521:orcl";
		String myUser="system";
		String myPass="1234";
		try {
			Connection con = DriverManager.getConnection(myURL, myUser, myPass); // �ٸ������!
			System.out.println("Ŀ�ؼ� ���� ����");
		}catch(Exception e){
			System.out.println("Ŀ�ؼ� ���� ����");
			e.printStackTrace();
			}
		
		
	}
}
