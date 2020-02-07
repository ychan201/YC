import java.util.Scanner;

/* 1~45 로또 게임 만들기
 * 
 */
public class Exam_07 {
	public static void main(String[] args) {
		int lotto[] = new int[6];
		int cnt = 1;
	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("로또 번호 6개 선택");
	//	String[] str = sc.nextLine().split(" ");
	//	for (int i = 0; i < str.length; i++)
	//		System.out.print(str[i] + "\t");
	//	System.out.println();

		lotto[0] = (int) (Math.random() * 45 + 1);
		while (cnt < lotto.length) {
			boolean flag = false;
			int temp = (int) (Math.random() * 45 + 1);
			for (int i = 0; i < cnt; i++) {
				if(temp==lotto[i]) {
					flag=true;
					break;
				}
			}
			if (flag) continue;
			lotto[cnt] = temp;
			cnt++;
		}
		
		sort(lotto);
		
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+"\t");
		}
	}

	
	
	
	
	
	
	
	
	
	
	static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}
