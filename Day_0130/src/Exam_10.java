import java.util.Arrays;

class Member implements Comparable<Member>{
	String name;
	Member(){}
	Member(String n){
		name=n;
	}
	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
}

public class Exam_10 {
	public static void main(String[] args) {
		Member m[] = new Member[10];
		m[0] = new Member("홍길동");
		m[1] = new Member("김길서");
		m[2] = new Member("이길남");
		m[3] = new Member("박길북");
		m[4] = new Member("서길일");
		m[5] = new Member("정길이");
		m[6] = new Member("구길삼");
		m[7] = new Member("총길사");
		m[8] = new Member("표길오");
		m[9] = new Member("원길육");
		for(int i=0;i<m.length;i++) {
			System.out.print(m[i].name+"\t");
		}
		Arrays.parallelSort(m);
		System.out.println();
		for(int i=0;i<m.length;i++) {
			System.out.print(m[i].name+"\t");
		}
	}
}
