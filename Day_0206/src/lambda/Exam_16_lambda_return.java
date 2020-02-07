package lambda;

interface DDD{
	int test(int x,int y);
}


public class Exam_16_lambda_return {
	public static void main(String[] args) {
		DDD d;
		d = (a,b)->{
			int c = a*b;
			return c;
		};
		
		int e = d.test(3, 5);
		System.out.println(e);
		
		d = (a,b) ->{
			int s=0;
			for(int i=a; i<b;i++) {
				s+=i;
			}
			return s;
		};
		System.out.println("1~15 гу ="+d.test(1, 15));
	}
}
