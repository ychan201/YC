package member2;

public class MemberData {
	Member[] a;
	int cnt;
	
	MemberData(){}
	
	MemberData(Member[] a,int cnt){
		this.a=a;
		this.cnt=cnt;
	}
	
	void update() {
		for(int i=0;i<cnt;i++) {
				int year = Integer.parseInt(a[i].year.substring(0, 2)); // 주민번호 앞 두자리 추출하여 year 변수에 정수형으로 저장
				int Scom = Integer.parseInt(a[i].year.substring(7,8));	// 생년월일 다음 식별번호
				
				if(Scom%2 ==1 )a[i].S="남";
				else a[i].S="여"; 
				
				if(Scom==1 || Scom==2 || Scom==5 || Scom==6) {
					a[i].nai=2020-(year+1900);
				}
				else a[i].nai=2020-(year+2000);
		}
		
	}
	
	void print() {
		System.out.println("이름\t전화\t\t성별\t나이");
		for(int i=0;i<cnt;i++)
		System.out.println(a[i].name+"\t"+a[i].bunho+"\t"+a[i].S+"\t"+a[i].nai);
	}
}
