import java.util.*;

class Student{
	int sno;
	String name;
	
	Student(){}
	Student(int sno,String name){
		this.sno=sno;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student st = (Student)obj;
			return st.sno==sno && name.equals(name);
		}
		else return false;
	}
	@Override
	public int hashCode() {
		return sno+name.hashCode();
	}
	
}

public class Exam_12 {
	public static void main(String[] args) {
		HashMap<String,Student> map = new HashMap<String,Student>();
		map.put("A", new Student(1,"AAAAA"));
		map.put("B", new Student(2,"BBBBB"));
		map.put("C", new Student(3,"CCCCC"));
		map.put("D", new Student(4,"DDDDD"));
		map.put("E", new Student(5,"EEEEE"));
		
		System.out.println("map size :"+map.size());
		
		HashMap<Student,Integer> map2 = new HashMap<Student,Integer>();
		map2.put(new Student(1,"AAAAA"),new Integer(100));
		map2.put(new Student(2,"BBBBB"),new Integer(99));
		map2.put(new Student(3,"CCCCC"),new Integer(88));
		map2.put(new Student(4,"DDDDD"),new Integer(77));
		map2.put(new Student(1,"AAAAA"),new Integer(66));
		
		System.out.println("map2 size :"+map2.size());
	}
	
}
