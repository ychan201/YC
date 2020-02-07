package generics;

class Box2<T>{
	private T t;
	
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t=t;
	}
}


public class Exam_07_UserClass_Generics_EX {
	public static void main(String[] args) {
		Box2<String> box = new Box2<String>();
		box.set("ȫ�浿");
		String a = box.get();
		System.out.println(a);
		
		Box2<Integer> box2 = new Box2<Integer>();
		box2.set(100);
		int b = box2.get();
		System.out.println(b);
	}
}
