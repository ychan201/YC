package student.main;

import java.util.Scanner;

import student.ui.UI;


public class StudentMain {
	public static void main(String[] args) {
		UI ui = new UI();
		Scanner sc = new Scanner(System.in);
		ui.main1select(ui.main1(sc),sc);
	}
}
