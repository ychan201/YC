package iostream;

import java.io.File;

/* ����� ��Ʈ��
 * ����Ʈ ��� (InputStream, OutputStream ) // �ѱ� ����
 * ����(�ؽ�Ʈ) ��� (Reader , Writer)
 */
public class Exam_17_file_mkdir {
	public static void main(String[] args) {
		File f = new File("c:\\data\\work");
		if(f.exists()) {
			System.out.println("����");
			f.delete();
		}
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		System.out.println("����");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		
		if(!f.exists()) {
			f.mkdir();
		}
	}
}
