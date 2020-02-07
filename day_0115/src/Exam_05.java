class AA {
	int a;
	int b;
}

public class Exam_05 {
	public static void main(String[] args) {
		AA a = new AA();
		int[] b = new int[5];
		b[0] = 10;
		b[1] = 20;
		AA[] s = new AA[5];
		s[0] = new AA();
		//s[1] = new AA();
		s[1]=s[0];
		System.out.println("s[0]="+s[0]);
		System.out.println("s[1]="+s[1]);

	}
}
