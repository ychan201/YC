import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Scanner Ŭ����
 * 
 */

public class Exam_03 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in); // System.in�� Ű���� �Է�
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
