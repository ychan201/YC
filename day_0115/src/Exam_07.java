import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sawon sa[] = new Sawon[10];
		int cnt=0;
		while(cnt<10) {
			System.out.print("입력 :");
			int sb = sc.nextInt();
			if(sb==-99) break;
			String na = sc.next();
			int pay = sc.nextInt();
			sa[cnt]=new Sawon(sb,na,pay);
			cnt++;
		}
		SawonData saD = new SawonData();
		saD.sourceDataPrint(sa,cnt);
		System.out.print("정렬기준 급여(오름차순:1/내림차순:2) 입력 :");
		int ns =sc.nextInt();
		saD.sortDataPrint(sa,cnt,ns); // n=1 오름차순 , n=2 내림차순
		saD.sourceDataPrint(sa,cnt);
	}
}
