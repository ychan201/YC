package school;

public class Student {
	int bun;
	String name;
	int kor,eng,mat,tot,rank=1;
	double avg;
	
	Student(){}
	
	Student(int b,String n,int k, int e,int m){
		bun=b;
		name=n;
		kor=k;
		eng=e;
		mat=m;
		tot = k+e+m;
		avg = ((int)(tot/3.)*100)/100.;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bun+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg+"\t"+rank;
	}
	
}
