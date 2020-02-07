// 선택정렬 - 하나를 정해놓고 (기준점) 전체를 비교하여 정렬
// 버블정렬 - 
public class Exam_04 {
	public static void main(String[] args) {
		int[] score = {50,70,60,90,80,77,45,78};
		int sa =0;
		System.out.print("Data :");
		// 선택정렬
		for(int i=0;(i<score.length-1);i++) {
			for(int j=i+1;j<score.length;j++) {
				if(score[i]>score[j]) {
					sa=score[j];
					score[j]=score[i];
					score[i]=sa;
				}
			}
		}
		
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+"\t");
		}
		System.out.println();
		int[] sco = {42,74,84,10,56,20,30};
		// 버블정렬
		for(int j=0;j<sco.length-1;j++) {
			for(int i=0;(i<sco.length-(j+1));i++) {
			if(sco[i]>sco[i+1]) {
					sa=sco[i+1];
					sco[i+1]=sco[i];
					sco[i]=sa;	
				}
			}
		}
		for(int i=0;i<sco.length;i++) {
			System.out.print(sco[i]+"\t");
		}
		
	}
}
