/* 사용자 정의 클래스
 * 
 */
import java.util.HashSet;
import java.util.Set;

class Person{
	int bun;
	String name;
	Person(){}
	Person(int b,String n){
		bun=b;
		name=n;
	}
	@Override
	public String toString() {
		return bun+"\t"+name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person per = (Person)obj;
			return per.bun==bun;
		}else {
			return false;
		}
	}
	@Override
		public int hashCode() {
			
			return bun;
		}
}

public class Exam_08_Userclass {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		set.add(new Person(1,"AAA"));
		set.add(new Person(2,"BBB"));
		set.add(new Person(1,"AAA"));
		System.out.println(set);
	}
}
