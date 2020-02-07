package lotto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetLotto_02 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		int cnt=0;
		for(int i=1;i<46;i++) {
			set.add(i);
		}
		System.out.println(set); // 1~45�� ������ Ȯ������ ���
		
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.shuffle(list); // list ���� ���� ������.
		
		for(int i=0;i<6;i++) System.out.print(list.get(i)+"\t");
		
		Iterator iter = set.iterator();
	}
}
