import java.util.List;
import java.util.Vector;

public class Exam_04_CF_Vector {
	public static void main(String[] args) {
		List list = new Vector(); // list ������ capacity() �޼ҵ带 ȣ�� �� �� ����. capacity�� Vector ���̱� ����.
		
		Vector vc = new Vector(); // Vector�� Ŭ������ �����ؾ� capacity() �޼ҵ� ȣ�� ����
		
		System.out.println(vc.size()); // ������Ʈ ��
		System.out.println(vc.capacity()); // ������ ���� ( defalut ������ 10�� �Ҵ� - �迭�� ������ 10�� ���ٰ� �� �� ����) 
											// ����ȭ ���� ( ��Ƽ������ ȯ�濡�� ��� ) , ���� ������δ� ����ȭ ������ ArrayList�� ���. 
		
		vc.add("AAAA");
		vc.add(0,"BBBB");
		vc.add(1,"cBBc");
		vc.add("dddd");
		for(int i=0;i<vc.size();i++) System.out.println(vc.get(i));
	}
}
 