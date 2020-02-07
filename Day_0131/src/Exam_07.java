import java.text.SimpleDateFormat;
import java.util.Date;
/* 1.문자열을 날짜형으로 변환 :SimpleDataFormat
 * SimpleDataFormat -->parse(str);
 * 2.날짜형 - 문자열형으로 변환
 */
public class Exam_07 {
	public static void main(String[] args) {
		String today="20200131";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd"); 
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd"); 
		try{
			Date now=sdf.parse(today);
			String now1=sdf2.format(now); 
			System.out.println(now1);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
