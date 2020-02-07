package iostream;

import java.io.File;

public class Exam_19 {
	public static void main(String[] args) {
		File f = new File("c:\\data\\work\\test.txt");
		if(f.exists()) {
			f.deleteOnExit(); // ���� �� ����
			System.out.println("���ϸ� :"+f.getName());
			System.out.println("���� ��� :"+f.getPath());
			System.out.println("���� ��� :"+f.getParent());
			System.out.println("���� ũ�� :"+f.length());
			System.out.println("���� ������ :"+f.lastModified());
		}else {
			try{
				f.createNewFile();
			}catch(Exception e) {}
			System.out.println(f.getName()+"��(��) ����");
		}
	}
}
