
public class SawonData {
	void sourceDataPrint(Sawon[] s, int cnt) {
		for (int i = 0; i < cnt; i++) {
			s[i].print();
		}
	}

	void sortDataPrint(Sawon[] s, int cnt, int n) {
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (n == 1) {
					if (s[i].pay > s[j].pay) {
						Sawon temp = s[i];
						s[i] = s[j];
						s[j] = temp;
					}
				}
				else if (n==2) {
					if (s[i].pay < s[j].pay) {
						Sawon temp = s[i];
						s[i] = s[j];
						s[j] = temp;
					}
				}
				else System.out.println("잘못된 입력값, 정렬할 수 없습니다.");
			}
		}
	}
}
