package textstream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/* 텍스트 입출력
 * Reader / Writer
 * InputStreamReader - 키보드입력 / OutputStreamWriter -- -- -- --  콘솔
 * FileReader / FileWriter  --  --  --  --  --  -- 파일 입출력
 * BufferedReader / BufferedWriter --  --  --  --  연결자 역할 (속도 때문에 사용, 꼭 사용할 필요는 없다.)
 *                  PrintWriter
 */

public class Exam_01_Writer {
	public static void main(String[] args) throws Exception {
		File file = new File("c:\\data\\work\\data2.txt");
		// 콘솔 출력
//		OutputStreamWriter osw = new OutputStreamWriter(System.out);
//		BufferedWriter bw = new BufferedWriter(osw);
//		PrintWriter pw = new PrintWriter(bw);
		
		PrintWriter pw  = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		pw.println("화면 출력 테스트 입니다");
		pw.close();
		
		// 파일 출력
		
		PrintWriter pwf  = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		pwf.println("파일 출력 Test");
		pwf.println("Test2");
		pwf.close();
	}
}
