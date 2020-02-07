package treeset;

import java.util.Iterator;
import java.util.TreeSet;

/* Comparable 인터페이스 구현 (정렬) -default 오름차순
 * Comparator 인터페이스 - 내림차순 등 오름차순 외의 정렬위해 사용
 */
class Person implements Comparable<Person>{
	String name;
	int age;
	Person(){}
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"\t"+age;
	}
	@Override
	public int compareTo(Person o) {
		if(age<o.age) {
			return -1;
		}
		else if(age == o.age) {
			return 0;
		}else
		return 1;
	}
}


public class Exam_04_TreeSet_User_class {
	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<Person>();
		
		set.add(new Person("길동",32));
		set.add(new Person("길서",24));
		set.add(new Person("길남",26));
		set.add(new Person("길북",37));
		set.add(new Person("길중",42));
		System.out.println(set);
		
		Iterator<Person> iter = set.iterator();
		while(iter.hasNext()) {
			Person p = iter.next();
			System.out.println(p);
		}
	}
}
