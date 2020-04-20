package reserv.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import reserv.ui.UI;

public class reservMain {
	public static void main(String[] args) {
		UI ui = new UI();
		Scanner sc = new Scanner(System.in);
		while (true) {
			switch (ui.mainmenu(sc)) {
			case 1: {
				ui.reserv(sc);
				break;
			}
			case 2:{
				ui.reservList();
				break;
			}
			case 3:{
				ui.update(sc);
				break;
			}
			case 4:
				ui.inbook(sc);
				break;
			}
		}
	}
}
