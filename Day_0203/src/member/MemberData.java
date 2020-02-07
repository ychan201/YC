package member;

import java.util.List;

public class MemberData {
	List list;
	
	MemberData(){}
	MemberData(List list){
		this.list=list;
		memberPrint();
	}
	private void memberPrint() {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
