
public class test_02 {
	public static void main(String[] args) {
		int[] a = {13,65,43,23,76,83,21,54,76,53,97,54,12};
		int sa;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<(a.length-1-i);j++) {
				if(a[j]>a[j+1]) {
					sa=a[j+1];
					a[j+1]=a[j];
					a[j]=sa;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+"\t");
	}
}
