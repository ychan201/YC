package treeset;

import java.util.TreeSet;

public class Exam_02_treeset_method {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {50,80,95,70,44,56,10,100,59};
		
		for(int i=0; i<score.length;i++) {
			set.add(score[i]);
		}
//		System.out.println(set);
		
		System.out.println("50���� ���� �� :"+set.headSet(50));
		System.out.println("50�̻��� �� :"+set.tailSet(50));
		System.out.println("���� ���� �� :"+set.first());
		System.out.println("���� ū �� :"+set.last());
		System.out.println("90�� �Ʒ� ù��° �� :"+set.lower(90));
		System.out.println("90�� �� ù��° �� :"+set.higher(90));
		System.out.println("90�� ���� ù��° �� :"+set.floor(90));
		System.out.println("90�� �̻� ù��° �� :"+set.ceiling(90));
		//�÷��ǿ��� ����
		while(!set.isEmpty()) {
			int sc = (int)set.pollLast(); // poll ���� �������鼭 set���� ����
			System.out.println(sc);
		}
	}
}
