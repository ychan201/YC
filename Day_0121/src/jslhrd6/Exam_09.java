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
		Student2 s1 = new Student2(1, "ȫ�浿", 90);
		Student2 s2 = new Student2(1, "ȫ�浿", 90);
		System.out.println("s1 : "+s1.hashCode()); // ��ü�� �ĺ��ϱ� ���� ������ �� ( �ּҿ� ��� ) �ĺ���
		System.out.println("s2 : "+s2.hashCode());
		
		String str = "AAA";
		String str2 = new String("AAA");
		System.out.println("str : "+str.hashCode());  // String�� ����! �̹� �۾��� �Ǿ��ִ�
		System.out.println("str2 : "+str2.hashCode());
	}
}
