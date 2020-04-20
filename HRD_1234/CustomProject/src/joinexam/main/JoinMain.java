package joinexam.main;

import java.util.Scanner;

import joinexam.ui.UI;

public class JoinMain {
	public static void main(String[] args) {
		UI ui = new UI();
		boolean flag=false;
		Scanner sc = new Scanner(System.in);
		while(true) {
		ui.main();
		int select = sc.nextInt();
		switch(select) {
			case 1: {
				ui.joinList(); break;
			}
			case 2: {
				ui.newJoin(sc); break;
			}
			case 3: {
				ui.login(sc);
				break;
			}
			
			case 4: {
				ui.search(sc);break;
			}
			
			case 5:{
				ui.update(sc);break;
			}
			case 6:{
				ui.delete(sc); break;
			}
			case 7:{
				System.out.println("프로그램 종료");
				flag = true;
				break;
			}
			}
		if(flag) break;
		}
	}
}
