package jslhrd5;
/* ����ó��
 * �ֻ��� Ŭ���� Exception
 * try - catch 
 */

import java.io.IOException;

public class Exam_05 {
	public static void main(String[] args) {
		try { // ���� �߻������� �����Ͽ� �����ְ�
			int a = System.in.read();
			System.out.println(a);
		} catch (IOException e) { // ���ܰ� �߻��ߴٸ�, �� ���ܸ� e�� �޴´� - ����¿��ܸ� ĳġ
								  // IOException - ����� ���ܸ� ó�� , Exception - ��� ���� ó��
			System.out.println("���ܰ� �߻�"); // - ���ܸ� ���� �� ���
		}catch (Exception ee){    // ����� ���ܰ� �Ӵ� ���, Exception ���� ĳġ
			ee.printStackTrace(); // catch���� ���� �� ���α׷� ����.
		}finally {
			//���� �߻��� ���Ծ��� ����
		}
	}
}
