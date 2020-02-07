import java.util.Scanner;

/* 키보드로 사원 번호, 이름 , 급여를 입력
 * 입력 : 1101 홍길동 345678
 * 입력 : 1102 홍길서 345679
 * .  . . . . . .. . .
 * 입력 : -99
 * 출력
 * 사번 이름 급여 50,000 10,000 5,000 . . . . 1
 */
class Sawon{
	int num,pay;
	String name;
	int money[] = new int[10]; // 50,000
	
	void count() {
		int flag=0;
		int temp =pay;
		int mon=50000;
		for(int i=0;i<10;i++) {
			money[i]=temp/mon;
			temp%=mon;	
			if(flag==0) {
				mon/=5;
				flag=1;
			}
			else {
				mon/=2;
				flag=0;
			}
		}
		
	}
}


public class Exam_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sawon sw[] = new Sawon[5];
		
		for(int i=0;i<sw.length;i++)sw[i]=new Sawon();
		for(int i=0;i<sw.length;i++) {
			System.out.print("입력 :");
			sw[i].num = sc.nextInt();
			if(sw[i].num==-99) {sw[i].num=0; break;}
			sw[i].name= sc.next();
			sw[i].pay = sc.nextInt();
			sw[i].count();
		}
		dataP(sw);
		/*System.out.print("입력 :");
		 *  for(int i=0;i<sw.length;i++){
		 *  sw=new Sawon();
			sw.num = sc.nextInt();
			if(sw.num==-99) break;
			sw.name= sc.next();
			sw.pay = sc.nextInt();
			sw[i]=sw;
			}
		*/
		
	}
	static void dataP(Sawon sw[]) {
		System.out.println("사번\t이름\t급여\t50000\t10000\t5000\t1000\t500\t100\t50\t10\t5\t1");
		for(int i=0;i<sw.length;i++) {
			System.out.print(sw[i].num+"\t"+sw[i].name+"\t"+sw[i].pay+"\t");
			for(int j=0;j<sw[i].money.length;j++)
			System.out.print(sw[i].money[j]+"\t");
			System.out.println();
		}
	}
}
