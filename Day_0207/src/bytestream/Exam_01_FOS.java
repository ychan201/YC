package bytestream;
import java.io.*;
/* 1Byte씩 입출력 
 * 1. 콘솔 출력
 * 	  - FileOutputStream
 * 	  - BufferedOutputStream
 * 	  - DataOutputStream
 * 	  - write();
 */

public class Exam_01_FOS {
	public static void main(String[] args) {
		File file = new File("c:\\data\\work\\data.txt");
		try {
			FileOutputStream fos = new FileOutputStream(FileDescriptor.out); // FileDescriptor 는 키보드를 의미 - 콘솔로 출력
			FileOutputStream fosf = new FileOutputStream(file); // 파일로 출력
			byte[] data = {66,68,70,72,(byte)'!'};
			fos.write(data);
			fosf.write(data);
		} catch (Exception e) {e.printStackTrace();}
		
	}
}
