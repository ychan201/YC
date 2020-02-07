package bytestream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Exam_04_IN {
	public static void main(String[] args) throws Exception {
		File file = new File("c:\\data\\work\\data1.txt");
		FileInputStream fos = new FileInputStream(file);
		BufferedInputStream bos = new BufferedInputStream(fos);
		DataInputStream dos  = new DataInputStream(bos); // java의 기본자료형
		
		int a=dos.readInt();
		double d = dos.readDouble();
		byte b[] = new byte[20];
		dos.read(b);
		
		System.out.println(a);
		System.out.println(d);
		System.out.println("b="+new String(b));
	}
}
