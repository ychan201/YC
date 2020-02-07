package generics;

class Box{
	
	private Object obj;  // object는 무엇이든 담을수(저장할 수) 있는 객체이다.
	
	public void set(Object o) {
		obj=o; 
	}
	
	public Object get() {
		return obj;
	}
}

class Apple{
	
}


public class Exam_06_UserClass_Generics {
	public static void main(String[] args) {
//		Box<String> box = new Box<String>();   - 클래스 생성시 generics 을 사용할 것이라고 알려줘야함.
		box.set("홍길동");
		String name = (String)box.get();
		
		box.set(new Apple());
		Apple Ap = (Apple)box.get();
	}
}
