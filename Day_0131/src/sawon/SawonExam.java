package sawon;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/*  사번  이름   급여
 *  1101 aaaa  345,890
 *   .    .     .
 *  합계        4,234,560
 */
public class SawonExam {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc= new Scanner(new File("src\\sawon\\sawon.txt"));
		int cnt=0;
		int sum=0;
		while(sc.hasNext()) {
			sc.nextLine();
			cnt++;
		}
		System.out.println("cnt" +cnt);
		Sawon sa[]=new Sawon[cnt];

		sc= new Scanner(new File("src\\sawon\\sawon.txt"));
		int cnt1=0;
		System.out.println("사번\t이름\t급여");
		while(sc.hasNext()) {
			
			String str=sc.nextLine();
			String st[]=str.split(",");
			Sawon sa1 =new Sawon(st);
			sa[cnt1]=sa1;
			cnt1++;
		
			
		}
		sc.close();
		DecimalFormat df=new DecimalFormat("#,###,###");
		for(int x=0; x<cnt1; x++) {
			System.out.println(sa[x]+"\t");
			sum+=sa[x].money;
		}
		String a=df.format(sum);
		System.out.print("합계\t\t" + a);
		
		
	}

}
