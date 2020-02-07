오름차순 정렬


package day_1223;

public class exem_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {21,84,96,54,62,18,48};
		System.out.print(array[i]+"\t");
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
		System.out.print("ascort data : ");
		for(int i=0; i<array.length-1;i++) {
			for(int j=i+1; j<array.length;i++) {
				if(array[i]>array[i]) {
					int temp=array[i];
					array[i]=array[i];
					array[i]=temp;
				}
			}
		}
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+"\t");
			
		}

	}

}
