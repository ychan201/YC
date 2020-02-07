package test03;

interface Car{
	void test();
}

class Truck implements Car{
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Truck Call");
	}
}

public class Exam_16 {
	public static void main(String[] args) {
		Car c = new Truck();
		c.test();
		
		//인터페이스 익명 구현 Exam_16$1
		Car cc = new Car() {
			@Override
			public void test() {
				System.out.println("Car call");
			}
		};
		
		cc.test();
		
		//인터페이스 익명 구현 Exam_16$2
		Car cc1 = new Car() {
			@Override
			public void test() {
				System.out.println("Car1 call");
			}
		};
		
		
	}
}