package textstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.OutputStreamWriter;

public class Exam_02_Reader {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File("c:\\data\\work\\data2.txt")));
		String data = br.readLine();
		
		System.out.println(data);
		br.close();
		
	}
}
