import java.util.Scanner;

/* Ű����� 10����, ��ȯ�� ���� �Է� ������ ���� ����ϴ� Ŭ������ �ۼ��Ͻÿ�
 * [�Է� ����] 			[�Է� ����]			[�Է� ����]
 * 10���� : 25			10����: 45			10����:45
 * 		��ȯ : 2			    ��ȯ: 8					��ȯ:16
 * [��� ����]			[��� ����]			[��� ����]
 * 10���� : 25			10����: 45			10����:45
 * 	2����:11001		8����:55				16����:2D
 */
class ConvNumber{
	int dec,conv,cnt;
	int arr[] = new int[16];
	char str[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	char binary[]=new char[16];
	String string="";

	ConvNumber(){}
	ConvNumber(int a,int b){
		dec=a;
		conv=b;
	}
	String coversion(){
			for(int i=0;i<arr.length;i++) {
				binary[i]=str[dec%conv];
				if((dec/conv)>0) cnt++;
				dec=dec/conv;
	}
			for(int i=cnt;i>=0;i--) 
				//System.out.print(binary[i]);
					string+=binary[i];
			return string;
}
}


public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10���� :");
		int dec,conv;
		dec= sc.nextInt();
		while(true) {
		System.out.print("��ȯ :");
		conv = sc.nextInt();
		if (conv == 2 || conv == 8 || conv ==16) break;
		else System.out.println("�߸��� ��ȯ ��");
		}
		
		ConvNumber cv = new ConvNumber(dec,conv);
		System.out.println("10���� "+dec);
		System.out.println(conv+"���� :"+cv.coversion());
	}
}
