package bytestream;
import java.io.*;
/* 1Byte�� ����� 
 * 1. �ܼ� ���
 * 	  - FileOutputStream
 * 	  - BufferedOutputStream
 * 	  - DataOutputStream
 * 	  - write();
 */

public class Exam_01_FOS {
	public static void main(String[] args) {
		File file = new File("c:\\data\\work\\data.txt");
		try {
			FileOutputStream fos = new FileOutputStream(FileDescriptor.out); // FileDescriptor �� Ű���带 �ǹ� - �ַܼ� ���
			FileOutputStream fosf = new FileOutputStream(file); // ���Ϸ� ���
			byte[] data = {66,68,70,72,(byte)'!'};
			fos.write(data);
			fosf.write(data);
		} catch (Exception e) {e.printStackTrace();}
		
	}
}
