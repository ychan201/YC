import java.util.HashMap;
import java.util.Map;

public class Exam_10_Map_Login {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		//        id  , pw
		map.put("java", "90");
		map.put("jsp", "96");
		map.put("servlet", "88");
		map.put("spring", "59");
		map.put("linux", "95");
		
		String id="java";
		String pass="1234";
		if(map.containsKey(id)) {
			// System.out.println("��й�ȣ�� �Է����ּ���.");
			if(map.get(id).equals(pass)) {
				System.out.println("�α��� ����");
			}
			else System.out.println("��й�ȣ ����");
		}
		else System.out.println("ID�� �����ϴ�.");
	}
}
