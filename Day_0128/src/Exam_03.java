import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Scanner 클래스
 * 
 */

public class Exam_03 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in); // System.in은 키보드 입력
		Scanner scF = new Scanner(new File("C:\\Data\\test.txt"));
		while ( scF.hasNext() ){
		    String tmp[] = scF.next().split(",");
		    for(int i=0;i<tmp.length;i++) {
		    	System.out.print(tmp[i]+" ");
		    }
		    System.out.println();
		   }
	}
}
