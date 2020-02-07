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
		
		System.out.println("50보다 작은 값 :"+set.headSet(50));
		System.out.println("50이상인 값 :"+set.tailSet(50));
		System.out.println("가장 작은 값 :"+set.first());
		System.out.println("가장 큰 값 :"+set.last());
		System.out.println("90점 아래 첫번째 값 :"+set.lower(90));
		System.out.println("90점 위 첫번째 값 :"+set.higher(90));
		System.out.println("90점 이하 첫번째 값 :"+set.floor(90));
		System.out.println("90점 이상 첫번째 값 :"+set.ceiling(90));
		//컬렉션에서 제거
		while(!set.isEmpty()) {
			int sc = (int)set.pollLast(); // poll 값을 꺼내오면서 set에서 삭제
			System.out.println(sc);
		}
	}
}
