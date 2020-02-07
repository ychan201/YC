package iostream;

import java.io.File;

/* 입출력 스트림
 * 바이트 방식 (InputStream, OutputStream ) // 한글 깨짐
 * 문자(텍스트) 방식 (Reader , Writer)
 */
public class Exam_17_file_mkdir {
	public static void main(String[] args) {
		File f = new File("c:\\data\\work");
		if(f.exists()) {
			System.out.println("있음");
			f.delete();
		}
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		System.out.println("시작");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		
		if(!f.exists()) {
			f.mkdir();
		}
	}
}
