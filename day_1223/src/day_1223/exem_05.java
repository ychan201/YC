Ű����� ������ ���� data 10���Է�
��, data�� 50�̻� 100���� �� �Է�

package day_1223;

import javax.print.attribute.IntegerSyntax;

public class exem_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scnner(System.in);
		int[] score = new int[10];
		int cnt=0; // data���� ī��Ʈ(50~100���� ��)
		while(true) {//�ݺ��� ���Ѵ�� �Ѵٴ� �ǹ�
			System.out.print("���� �Է�:");
			int. jumsu = scn.nestint();
			if(jumsu>=50 && jumsu<=100) {
				cnt++;
				score[cnt]=jumsu;
				if(cnt=10) {
					break;
					
				}
			}
			
		}
		// ���
		for(int. i=0; i<10; i++) {
			System.out.print(score[i]+" ");
		}

	}

}
