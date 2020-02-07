import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/* 1.현재 날짜
 * Date now= new Date();
 * 1.8 부터 사용가능
 */
public class Exam_08 {

	public static void main(String[] args) { 
		LocalDate now=LocalDate.now();  //현재날짜
		LocalTime time=LocalTime.now(); //현재시간
		LocalDateTime today =LocalDateTime.now(); //현재날짜시간
		
		System.out.println("날짜 :" + now);
		System.out.println("시간 :" + time);
		System.out.println("날짜 시간 :" + today);

	}

} 
