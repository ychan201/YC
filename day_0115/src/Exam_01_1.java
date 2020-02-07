import java.util.Scanner;

class Student1{
	int b,k,e,m,tot;
	String na;
	double avg;
	
	Student1(){}
	
	Student1(int b,String na, int k,int e, int m){
		this.b=b;
		this.k=k;
		this.e=e;
		this.m=m;
		this.na=na;
		this.tot=k+e+m;
		this.avg=tot/3.;
	}
	void print() {
		
		System.out.println("¹øÈ£ :"+b);
		System.out.println("ÀÌ¸§ :"+na);
		System.out.println("ÃÑÁ¡ :"+tot);
		System.out.println("Æò±Õ :"+(int)(avg*100+0.5)/100.);
	}
	
}

public class Exam_01_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b,k,e,m;
		String na;
		System.out.print("ÀÔ·Â :");
		b=sc.nextInt();
		na=sc.next();
		k=sc.nextInt();
		e=sc.nextInt();
		m=sc.nextInt();	
		
		
		Student1 st = new Student1(b,na,k,e,m);
		st.print();
		
	}
}
