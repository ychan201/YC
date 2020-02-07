import java.util.ArrayList;
import java.util.List;

class AA{
	int b;
	String n;
	AA(){}
	AA(int b, String n){
		this.b=b;
		this.n=n;
	}
	
	public String toString() {
		return "번호:" + b + "\t이름:" + n;
	}
	
}


public class Exam_03_CF_list_class {
	public static void main(String[] args) {
	//	List list = new ArrayList();
		List<AA> list = new ArrayList<AA>();
		list.add(new AA(1,"AAA"));
		list.add(new AA(2,"BBB"));
		list.add(new AA(3,"CCC"));
		list.add(new AA(4,"DDD"));
		for(int i=0;i<list.size();i++) {
		//	AA a = (AA)list.get(i);
		//	System.out.println(a.b);
			System.out.println(list.get(i).b);
		}
	}
} 