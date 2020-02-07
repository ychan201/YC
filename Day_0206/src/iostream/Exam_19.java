package iostream;

import java.io.File;

public class Exam_19 {
	public static void main(String[] args) {
		File f = new File("c:\\data\\work\\test.txt");
		if(f.exists()) {
			f.deleteOnExit(); // 종료 시 삭제
			System.out.println("파일명 :"+f.getName());
			System.out.println("파일 경로 :"+f.getPath());
			System.out.println("파일 경로 :"+f.getParent());
			System.out.println("파일 크기 :"+f.length());
			System.out.println("최종 수정일 :"+f.lastModified());
		}else {
			try{
				f.createNewFile();
			}catch(Exception e) {}
			System.out.println(f.getName()+"이(가) 없음");
		}
	}
}
