package user;

public class user {
	String name,userid,email;
	int bun;
	
	@Override
	public boolean equals(Object obj) {
		user eq = (user)obj;
		if (userid == eq.userid) return true;
		return false;
	}
	
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bun +"\t"+ name + "\t" + userid + "\t" + email;
	}	
	
}
