package Student;

public abstract class Student {
	int bun;
	String name;
	int[] jum = new int[10];
	int tot;
	double avg;

	public Student(int bun, String name, int[] jum) {
		this.bun = bun;
		this.name = name;
		this.jum = jum;
	}
	
	public void title() {
		System.out.println("번호\t이름\t총점\t평균");
		System.out.print(bun+"\t"+name+"\t");
	}
	
	public abstract void account(); // 총점,평균(소수점2자리)를 계산후 출력하는 메소드
	public abstract void scoreMax(); // 점수 최대, 최소를 구하여 출력하는 메소드
	public abstract void scoreSelection(); // 선택정렬을 이용하여 점수 오름차순
	public abstract void scoreBubble(); // 거품정렬을 이용하여 점수 내림차순
}
