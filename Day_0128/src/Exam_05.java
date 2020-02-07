import java.util.StringTokenizer;

public class Exam_05 {
	public static void main(String[] args) {
		String str="010-1111.2222";
		String str2[]=str.split("-");
		for(int i=0;i<str2.length;i++)
		System.out.println(str2[i]);
		StringTokenizer st = new StringTokenizer(str,"-.");
		System.out.println("ÅäÅ« ¼ö:"+st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken()+" ");
		}
	}
}
