import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/* 1.���� ��¥
 * Date now= new Date();
 * 1.8 ���� ��밡��
 */
public class Exam_08 {

	public static void main(String[] args) { 
		LocalDate now=LocalDate.now();  //���糯¥
		LocalTime time=LocalTime.now(); //����ð�
		LocalDateTime today =LocalDateTime.now(); //���糯¥�ð�
		
		System.out.println("��¥ :" + now);
		System.out.println("�ð� :" + time);
		System.out.println("��¥ �ð� :" + today);

	}

} 
