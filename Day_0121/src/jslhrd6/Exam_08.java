package jslhrd6;

class Student {
	int bun;
	String name;
	int score;

	Student(int bun, String name, int score) {
		this.bun=bun;
		this.name=name;
		this.score=score;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Student) {
			
			return bun == ((Student) obj).bun && ((Student)obj).name.equals(name);
		} else 
			return false;
		
	}
}

public class Exam_08 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "È«±æµ¿", 90);
		Student s2 = new Student(1, "±èÀÚ¹Ù", 90);

		if (s1.equals(s2)) {
			System.out.println("s1==s2 : " + true);
		} else
			System.out.println("s1==s2 : " + false);
	}
}
