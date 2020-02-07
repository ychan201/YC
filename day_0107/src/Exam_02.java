import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		int bun[]= new int[5];
		String[] name = new String[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			bun[i]=(int) (1*Math.pow(10,i));
		}
		name[0]="±èÀÚ¹Ù";
		name[1]="È«±æµ¿";
		name[2]="C/C++";
		name[3]="ÆÄÀÌ½ã";
		name[4]="¼­ºí¸´";
		for(int x=0; x<5; x++) {
			System.out.println(bun[x]+":"+name[x]);
		}
		
	}
}
