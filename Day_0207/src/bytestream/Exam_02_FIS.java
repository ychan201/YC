package bytestream;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;

public class Exam_02_FIS {
	public static void main(String[] args) throws Exception {
		File file = new File("c:\\data\\work\\data.txt");
		//키보드 입력
//		FileInputStream fi = new FileInputStream(FileDescriptor.in);
//		System.out.print("입력 :");
//		int b = fi.read();
//		System.out.println(b);
		
		FileInputStream fis = new FileInputStream(file); // input 스트림인 fis를 선언. 
		byte[] by = new byte[100]; // 최대 100자
		int count = fis.read(by); // 이부분에서 data.txt 를 읽어들임.
		
		for(int i=0;i<count;i++) {
			System.out.println(i + ":" + (char)by[i]);
		}
	}
}
