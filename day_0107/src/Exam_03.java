import java.util.Scanner;

/* Ű����� �Է�(1~100) �ִ� 10�� �Է�
 * ¦���� ���
 */
public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val[] = new int[10];
		int re=0;
		
		for(int i=0;i<10;i++) {
			System.out.print("�����Է�:");
			val[i] = sc.nextInt();
			}
		System.out.println("--------------�Է��ڷ�--------------");
		for(int i=0;i<10;i++) {
			System.out.print(val[i]+" ");
			}
		for(int i=1;i<10;i++) {
			for(int j=0;j<i;j++) {
				if(val[i]<val[j]) {
					re=val[i];
					val[i]=val[j];
					val[j]=re;
				}
			}
		}
		System.out.println("\n--------------����ڷ�--------------");
		for(int i=0;i<10;i++) {
			if(val[i]%2==0) System.out.print(val[i]+" ");
			}
	}
}
