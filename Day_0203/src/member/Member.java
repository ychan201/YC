package member;

import java.util.ArrayList;
import java.util.List;

public class Member {
	List list = new ArrayList();
	String id,name,age;
	
	Member(){}
	
	Member(List a){
		for(int i=0;i<a.size();i++) list.add(a.get(i));
	}
	Member(String id,String name,String age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+"\t"+name+"\t"+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return m.id.equalsIgnoreCase(id);
		}else {
			return false; 
		}
	}
}
