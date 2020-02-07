package jslhrd6;

class Student2 {
	int bun;
	String name;
	int score;

	Student2(int bun, String name, int score) {
		this.bun=bun;
		this.name=name;
		this.score=score;
	}

	void print() {
		System.out.println(bun + "\t" + name +"\t" + score );
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bun+"\t"+name+"\t"+score;
	}
}

public class Exam_09 {
	public static void main(String[] args) {
		Student2 s1 = new Student2(1, "홍길동", 90);
		Student2 s2 = new Student2(1, "홍길동", 90);
		System.out.println("s1 : "+s1.hashCode()); // 개체를 식별하기 위한 고유의 값 ( 주소와 비슷 ) 식별자
		System.out.println("s2 : "+s2.hashCode());
		
		String str = "AAA";
		String str2 = new String("AAA");
		System.out.println("str : "+str.hashCode());  // String은 동일! 이미 작업이 되어있다
		System.out.println("str2 : "+str2.hashCode());
	}
}
