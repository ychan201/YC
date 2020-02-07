	
public class Exam_02 {
	public static void main(String[] args) {
		String str="AAAAA";
		String str2 = new String("AAAAA");
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(20);
		System.out.println("sb="+sb.capacity()); // 공간의 크기
		System.out.println("sb2="+sb2.capacity()); // 공간의 크기
		System.out.println("sb="+sb.length()); // 실제 데이터
		System.out.println("sb2="+sb2.length()); // 실제 데이터
		sb.append("AAAAA");
		sb.append("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
		sb.append("ccccccccccccccccccccccccccccccccccccc");
		System.out.println(sb);
		System.out.println("sb="+sb.capacity());
		System.out.println("sb="+sb.length()); // 실제 데이터
		
		
	}
}
