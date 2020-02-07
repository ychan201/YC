package student;

public class Student {
	int bun,jumsu;
	String name;
	int[] dap =new int[20];
	String[] ox = new String[20];
	
	Student() {}
	
	Student(String[] s){
		bun=Integer.parseInt(s[0]);
		name=s[1];
		
		for(int i=2;i<s.length;i++) {
			dap[i-2]=Integer.parseInt(s[i]);
		}

	}
	
}
