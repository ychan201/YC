배열에 저장된 data 중 가장 큰값, 가장 작은값 찾기.


package day_1223;

public class exem_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {90,52,71,52,56,45,61,32,87};
		System.out.print("array data list");
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i] + "/t");
			
		}
		

	}
	// 최대, 최소 찾기
	int max=array[0];
	int min=array[0];
	for(int i=1; i<array.length; i++) {
		if(max < array[i]) {
			max=array[i];
			
		}
		if(min>array[i]) {
			min=array[i];
			
		}
	}
	system.out.print("/n max =" + max);
	system.out.print("/n min =" + min);
		

}
