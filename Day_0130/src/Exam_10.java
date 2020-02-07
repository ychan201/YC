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
		m[0] = new Member("ȫ�浿");
		m[1] = new Member("��漭");
		m[2] = new Member("�̱泲");
		m[3] = new Member("�ڱ��");
		m[4] = new Member("������");
		m[5] = new Member("������");
		m[6] = new Member("�����");
		m[7] = new Member("�ѱ��");
		m[8] = new Member("ǥ���");
		m[9] = new Member("������");
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
