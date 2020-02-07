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
			// System.out.println("비밀번호를 입력해주세요.");
			if(map.get(id).equals(pass)) {
				System.out.println("로그인 성공");
			}
			else System.out.println("비밀번호 오류");
		}
		else System.out.println("ID가 없습니다.");
	}
}
