package student;

public class Student {
	int bun,tot,rank=1;
	String name;
	int[] score=new int[5];
	double avg;
	
	Student(){}
	Student(String[] s){
		bun=Integer.parseInt(s[0]);
		name=s[1];
		for(int i=2;i<s.length;i++) {
			score[i-2]=Integer.parseInt(s[i]);
			tot += score[i-2];
		}
		avg =tot/5.;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bun+"\t"+name+"\t"+score[0]+"\t"+score[1]+"\t"+score[2]+"\t"+score[3]+"\t"+score[4]+"\t"+tot+"\t"+avg+"\t"+rank;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student) obj;
			return bun==s.bun;
		}
		else return false;
	}
}
