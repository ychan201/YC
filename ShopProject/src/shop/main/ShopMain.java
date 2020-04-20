package shop.main;

import java.util.Scanner;

import shop.ui.UI;

public class ShopMain {
	public static void main(String[] args) {
		UI ui = new UI();
		Scanner sc = new Scanner(System.in);
		while (true) {
			switch (ui.mainmenu(sc)) {
			case 1: {
				ui.Join(sc);
				break;
			}
			case 2:{
				ui.ShopList();
				break;
			}
			case 3:{
				ui.update(sc);
				break;
			}
			case 4:
				ui.delete(sc);
				break;
			}
		}
		
	}
}
