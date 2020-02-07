package textstream;

public class Student implements Comparable<Student>  {
	int bun;
	String name,gender;
	int score[]=new int[3],tot;
	double avg;
	
	Student(String s[]){
		bun = Integer.parseInt(s[0]);
		name = s[1];
		if(s[2].equalsIgnoreCase("m")) gender = "³²";
		else gender ="¿©";
		for(int i=0;i<score.length;i++) {
			score[i]=Integer.parseInt(s[i+3]);
			tot += score[i];
		}
		avg = Math.round((tot/3.)*100)/100.;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bun+"\t"+name+"\t"+gender+"\t"+score[0]+"\t"+score[1]+"\t"+score[2]+"\t"+tot+"\t"+avg;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Student) {
//			Student s = (Student)obj;
//			return s.bun==bun;
//		}
//		return false;
//	}
//	@Override
//	public int hashCode() {
//		return bun;
//	}
	@Override
	public int compareTo(Student o) {
		if(bun<o.bun) return -1;
		else if(bun==o.bun) return 0;
		else return 1;
	}
	
}
