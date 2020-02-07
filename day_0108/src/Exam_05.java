
public class Exam_05 {
	public static void main(String[] args) {
		int[] bun = {5,3,1,4,2};
		int[] score = {50,70,60,90,80};
		int sa_b,sa_s;
		//출력
		//1   2  3  4  5
		//60 80 70 90 50
		System.out.println("----------------정렬 전---------------");
		for(int i=0;i<5;i++) {
			System.out.print(bun[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<5;i++) {
			System.out.print(score[i]+"\t");
		}
		
		for(int i=0;i<bun.length-1;i++) {
			for(int j=i+1;j<bun.length;j++) {
				if(bun[i]>bun[j]) {
					sa_b=bun[j];
					sa_s=score[j];
					bun[j]=bun[i];
					score[j]=score[i];
					bun[i]=sa_b;
					score[i]=sa_s;
				}
			}
		}
		System.out.println();
		System.out.println("----------------정렬 후---------------");
		for(int i=0;i<5;i++) {
			System.out.print(bun[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<5;i++) {
			System.out.print(score[i]+"\t");
		}
	}
}
