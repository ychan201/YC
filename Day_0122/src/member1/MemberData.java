package member1;

public class MemberData {
	Member[] mem; // 회원정보 배열 클래스
	int cnt; // 인원수 처리 위한 변수
	
	MemberData(){}
	
	MemberData(Member[] m,int c){
		mem=m;
		cnt=c;
	}
	
	void memPrint() {
		System.out.println("이름\t전화번호\t성별\t나이");
		for(int i=0;i<cnt;i++) {
			System.out.println(mem[i].name+"\t"+mem[i].phone+"\t");
			
		}
	}
	
	
	
	void testPrint() {
		System.out.println("이름\t주민번호\t\t전화번호");
		for(int i=0;i<cnt;i++) {
			System.out.println(mem[i]);
		}
	}
}
