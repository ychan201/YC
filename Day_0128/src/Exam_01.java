import java.util.Scanner;

/* Ű����� ���� �ܾ �Է�
 * �������� �󵵼��� ���(��ҹ��� ����X)
 * �Է¿���
 * �ܾ� : Apple
 * �ܾ� : Seoul
 *   .   .   .
 * �ܾ� : end(�Ǵ� END) --> ����
 * ��� ����
 * A B C D . . . . . Z
 * 0 2 1 0           1
 */


class AlphaTest{
	static int a[]=new int[26];
	AlphaTest(){}
	AlphaTest(String s){
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=97) {
				a[(int)s.charAt(i)-97]++;
			}
			else {
				a[(int)s.charAt(i)-65]++;
			}
			
		}
	}
	void print() {
		
		for(int i=65;i<=90;i++)
			System.out.print((char)i+"\t");
		System.out.println();
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+"\t");
		System.out.println();
	}
	
	void maxprint() {
		int max=a[0],alpha=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max = a[i];
				alpha=i;
			}
		}
		System.out.println("���� ���� �󵵼� :"+(char)(alpha+65)+" "+max+"ȸ");
	}
	
}


public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�Է� :");
			String str = sc.next();
			boolean flag=false;
			for(int i=0;i<str.length();i++) {
				if('Z'>str.charAt(i) || str.charAt(i)<'A') {
					flag =true;
				}
			}
			if(flag) {
				System.out.println("���� �����Է�, �ٽ��Է��ϼ���");
				continue;
			}
			if(str.equals("end")) break;
			AlphaTest apt = new AlphaTest(str);
		}
		System.out.println("����");
		AlphaTest a = new AlphaTest();
		a.print();
		a.maxprint();
	}
}
