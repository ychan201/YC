import java.util.ArrayList;
import java.util.List;

/* ����Ʈ words ���� ���� ���� ���ܾ �ԷµǾ� �ִ�.
 * �Էµ� �ܾ�� �߿��� ���� ���̰� �� �ܾ ����ϴ� ���α׷��� �ۼ�
 * ���� �� �ܾ �������� ��쿡�� ��� ����Ѵ�.
 */
public class Exam_03_List_Max {
	static void output(List<String> ls) {
		int max=0;
		System.out.print("output : ");
		for(int i=0;i<ls.size();i++) {
			if(ls.get(i).length()>max) max=ls.get(i).length();
		}
		for(int i=0;i<ls.size();i++) {
			if(ls.get(i).length()==max)
			System.out.print(ls.get(i)+"\t");
		}
		
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("name");list.add("lion");list.add("elephants");
		list.add("pig");list.add("train");list.add("apple");
		list.add("republic");list.add("increase");list.add("movements");
		
		System.out.println(list);
		output(list);
	}
}
