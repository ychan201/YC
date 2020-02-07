package student;

public class Student {
	int bun,kor,eng,mat,suk=1,tot;
	double avg;
	String name;
	
	Student(){}
	
	Student(String b,String n,String k,String e,String m){
		bun=Integer.parseInt(b);
		name=n;
		kor=Integer.parseInt(k);
		eng=Integer.parseInt(e);
		mat=Integer.parseInt(m);
	}
	
}
