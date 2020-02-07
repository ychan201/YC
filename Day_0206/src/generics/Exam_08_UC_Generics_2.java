package generics;

class Product<N,M>{
	private N kind;
	private M model;
	public N getKind() {
		return kind;
	}
	public void setKind(N kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}

class Car{
	
}

public class Exam_08_UC_Generics_2 {
	public static void main(String[] args) {
		Product<String,Integer> p = new Product<String,Integer>();
		p.setKind("배고프다");
		p.setModel(999);
		System.out.println(p.getKind());
		System.out.println(p.getModel());
		
		Product<Car,Integer> pp = new Product<Car,Integer>();
		pp.setKind(new Car());
		pp.setModel(33);
	}
}
