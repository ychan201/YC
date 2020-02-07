import java.util.Scanner;

/* 키보드 입력 (최대 10개)
 * 오름차순 정렬하는 클래스 생성
 * 입력 : 2 6 9 7 5 2 6
 * 
 * 출력 :
 * 전 : 2 6 9 7 5 2 6
 * 후 : 2 2 5 6 6 7 9
 */
class HH {
	static int flag = 0;
	void print(int a[],int cnt) {
		if(flag==0) System.out.print("전 :");
		else System.out.print("후 :");
		for(int i=0;i<cnt;i++) {
			System.out.print(a[i]+"\t");
		}
		flag++;
		System.out.println();
	}
	
	void sort(int a[],int cnt) {
		for(int i=0;i<cnt-1;i++) {
			for(int j=i+1;j<cnt;j++) {
				if(a[i]>a[j]) {
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}


public class Exam_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input[] = new int[10];
		int cnt=0;
		System.out.print("입력 :");
		for(int i=0;i<10;i++) {
			input[i]= sc.nextInt();
			if(input[i]==-99) {
				input[i] = 0;
				break;
			}
			cnt++;
		}
		HH hh = new HH();
		
		hh.print(input, cnt);
		
		hh.sort(input, cnt);
		
		hh.print(input, cnt);
		
		
	}
}
