import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* �Ʒ��� ���� args ����(Map)�� �̸��� ���̰� ����Ǿ� �մ�.
 * (�̸��� 'Ű' �̹Ƿ� ���� �̸��� ���ٰ� �����Ѵ�)
 * 
 */

public class Exam_02_Map_ContainsKey {
	public static void main(String[] ar) {
		Map args = new HashMap();
		Scanner sc = new Scanner(System.in);
		args.put("Alice", 23);args.put("Paul", 25);args.put("Peter", 19);
		args.put("Karen", 40);args.put("Andy", 25);args.put("Cindy", 30);
		args.put("David", 19);args.put("Sally", 28);args.put("Tom", 22);
		args.put("Sue", 32);args.put("Bob", 31);
		
		while(true) {
		System.out.print("Enter name :");
		String str = sc.nextLine();
		if(str.equalsIgnoreCase("end")) break;
		if(args.containsKey(str)) {
			System.out.println(str+" is "+args.get(str)+" years old");
		}
		else System.out.println("�ش� �̸��� �������� �ʽ��ϴ�.");
		}
		System.out.println("���α׷�����");
	}
}
