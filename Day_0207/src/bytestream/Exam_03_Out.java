package bytestream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Exam_03_Out {
	public static void main(String[] args) throws Exception {
		File file = new File("c:\\data\\work\\data1.txt");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos  = new DataOutputStream(bos); // java의 기본자료형
		
		dos.writeInt(35);
		dos.writeDouble(3.14);
		dos.writeBytes("Seoul");
		dos.close();
	}
}
