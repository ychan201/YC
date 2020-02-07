package jslhrd6;

public class Exam10 {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int b[] = new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		int c[] = a.clone();
		b[1]=77;
		c[3]=84;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print(b[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print(c[i]+"\t");
		}
	}
}