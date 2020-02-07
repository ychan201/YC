import java.util.Scanner;

class HH_SOL{
	void sourcePrint(int a[],int cnt) {
		System.out.print("전 :");
		for(int x=0; x<a.length;x++) {
			System.out.print(a[x]+"\t");
		}
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

public class Exma_08_SOL {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] score = new int[10];
		int cnt=0;
		//입력 작업
		System.out.print("입력 :");
		for(int i=0;i<10;i++) {
			score[i]=scn.nextInt();
			if(score[i]==-99) {
				score[i]=0;
				break;
			}
			cnt++;
		}
		//객체 생성
		HH_SOL hh = new HH_SOL();
		//전(출력 메소드) - 호출
		hh.sourcePrint(score, cnt);
		//정렬 메소드
		
		//후(출력 메소드) - 호출
	}
}
