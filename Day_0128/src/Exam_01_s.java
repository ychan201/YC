import java.util.Scanner;

class AlphaTests{
	int a[] = new int[26];
	public void alphaFre(String str) {
		for(int i=0;i<str.length();i++) 
			a[str.charAt(i)-65]++;
	}
	
	public void alphaPrint(){
		for(char ch='A';ch<='Z';ch++)
			System.out.print(ch+" ");
		System.out.println();
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}

public class Exam_01_s {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		AlphaTests alpha = new AlphaTests();
		
		while(true) {
			System.out.print("´Ü¾î :");
			String word = sc.next().toUpperCase();
			if(word.equals("END")) break;
			alpha.alphaFre(word);
		}
		alpha.alphaPrint();
	}
}
