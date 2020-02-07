package Student;

public class StudentHak extends Student {
	public StudentHak(int bun, String name, int[] jum) {
		super(bun, name, jum);
	}
	@Override
	public void account() { // 총점,평균(소수점2자리)를 계산후 출력하는 메소드
		int sum=0;
		for(int i=0;i<jum.length;i++) {
			sum+=jum[i];
		}
		avg = (double)sum/jum.length;
		System.out.print(sum+"\t");
		System.out.println(avg);
	}@Override
	public void scoreMax() { // 점수의 최대 최소를 구하여 출력하는 메소드
		int max=jum[0],min=jum[0];
		for(int i=0;i<jum.length;i++) {
			if(max<jum[i]) max=jum[i];
			if(min>jum[i]) min=jum[i];
		}
		System.out.println("점수의 최대값 : "+max);
		System.out.println("점수의 최소값 : "+min);
		
	}@Override
	public void scoreSelection() { // 선택정렬을 이용하여 점수 오름차순
		for(int i=0;i<jum.length-1;i++) {
			for(int j=i+1;j<jum.length;j++) {
				if(jum[i]>jum[j]) {
					int temp=jum[i];
					jum[i]=jum[j];
					jum[j]=temp;
				}
			}
		}
		System.out.println("오름차순 정렬");
		for(int i=0;i<jum.length;i++) {
			System.out.print(jum[i]+"\t");
		}
		System.out.println();
	}@Override
	public void scoreBubble() { // 버블정렬을 이용하여 점수 내림차순
		for(int j=0;j<jum.length-1;j++) {
			for(int i=0;(i<jum.length-(j+1));i++) {
			if(jum[i]<jum[i+1]) {
					int temp=jum[i+1];
					jum[i+1]=jum[i];
					jum[i]=temp;	
				}
			}
		}
		System.out.println("내림차순 정렬");
		for(int i=0;i<jum.length;i++) {
			System.out.print(jum[i]+"\t");
		}
	}
	
}
