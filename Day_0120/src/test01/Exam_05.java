package test01;
class Car{
	String name;
	int inwon;
	
	Car(){}
	
	Car(String name){
		this(name,30);
		this.name=name;
	}
	Car(String name,int inwon){
		this.name=name;
		this.inwon=inwon;
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		Car c = new Car("sa");
		System.out.println(c.inwon);
		System.out.println(c.name);
	}
}
