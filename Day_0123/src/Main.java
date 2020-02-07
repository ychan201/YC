import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력 받기
		Scanner scn = new Scanner(System.in);
		String sex;
		String name = null;
		while (true) {
			System.out.println("입력주세요 : ");
			String input = scn.nextLine(); // 한줄 전체 입력
			if (input.equalsIgnoreCase("end"))
				;
			String[] array = input.split("-");

			if (array[0].length() > 4)
				System.out.println("이름이 4글자 초과");
			if(array[1].length()!=8) {
				System.out.println("너 주민 8글자아니야 좀있다 오류난다?");
			}
			
			try {
				int imsi = Integer.parseInt(array[0]);
				System.out.println("오류");
			} catch (Exception e) {
				name = array[0];
				System.out.println("잘 들어갔습니다");
			}
			if ('1' == array[1].charAt(7))
				sex = "남자";
			else if ('2' == array[1].charAt(7))
				sex = "여자";
			else {
				System.out.println("주민 입력 오류");
				continue;
			}
			break;
		}
		System.out.println(name+sex);
	}

}
