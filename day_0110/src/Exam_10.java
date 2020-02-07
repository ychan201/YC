/*  2차원 배열에 Data 가 입력 되어 있을 경우
 * 1: 9 90 80 89 80 90
 * 2: 5 77 88 99 90 70
 *  : . . . . . . . . . 
 * 5:55 66 76 89 80 90
 * 
 * 1. 입력 자료 출력 메소드 구현(dataPrint())
 * 	  번호 점수1 점수2 점수3 점수4 점수5
 * 2. 총점 구하는 메소드 구현(dataTot())
 * 3. 총점을 기준으로 내림차순 정렬 메소드 구현(totSort())
 * 4. 전체 출력 메소드 구현(dataPrint())
 */
public class Exam_10 {
	public static void main(String[] args) {
		int arr[][] = { { 9, 90, 80, 89, 80, 90, 0 }, { 5, 80, 46, 97, 85, 66, 0 }, { 3, 67, 85, 79, 90, 84, 0 },
				{ 7, 80, 70, 76, 84, 74, 0 }, { 1, 65, 84, 95, 76, 82, 0 } };

		// dataPrint() 호출
		dataPrint("입력 자료", arr);
		// dataTot() 호출
		dataTot(arr);
		// totSort() 호출
		totSort(arr);
		// dataPrint() 호출
		dataPrint("전체 자료",arr);

	}

	static void dataPrint(String str, int a[][]) {
		System.out.println("---------------------" + str + " 출력-----------------------");
		System.out.print("번호\t점수1\t점수2\t점수3\t점수4\t점수5");
		if(str=="전체 자료") System.out.print("\t총점");
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				System.out.print(a[i][j] + "\t");
			}
			if(str=="전체 자료") System.out.print(a[i][6]);
			System.out.println();
		}
	}

	static void dataTot(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				a[i][6]+=a[i][j];
			}
		}
	}
	static void totSort(int a[][]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i][6] < a[j][6]) {
					for(int k=0;k<a[i].length;k++) {
						int temp=a[i][k];
						a[i][k]=a[j][k];
						a[j][k]=temp;
					}
				}
			}
		}
	}
}
