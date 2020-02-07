package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetLotto_01 {
	public static void main(String[] args) {
		Set set = new HashSet();
		Set set2 = new HashSet();
		for(int i=0; set.size()<6;i++) {
			int lotto = (int)(Math.random()*45)+1;
			set.add(lotto);
		}
		
		while(set2.size()<6) {
			Double d = Math.random()*45+1;
			set2.add(d.intValue());
		}
		
		// 1차 출력
		System.out.println("set :"+set);
		System.out.println("set2 :"+set2);
		
		//정렬 후 출력
		List list = new ArrayList(set);
		Collections.sort(list);
		System.out.println(list);
		
	}
}
