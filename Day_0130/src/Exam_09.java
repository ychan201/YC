import java.util.Arrays;

/* -- Á¤·Ä
 * 
 */
public class Exam_09 {
	public static void main(String[] args) {
		int arr[] = {90,55,66,77,88,61,25,36,97,25,24,21,19,68,67,98,91,84,81,36,52,67,71,76};
		int var[][] = {{12,55,61,32,64,78,54,26,14,25,78,96,52,3,5,6,71,85,62,64},{58,24,14,26,87,41,56,98,65,32,14,78,54,25,21,14,15,69,58,9,8,98,87,65,97,88},
				{44,85,21,36,98,74,54,26,84,57,58,65,21,45,65,88,95,6,6,21,74,85,96,85,77,45,62,14}};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Arrays.parallelSort(arr);
		System.out.println("--------------------------------------------------------------");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------");
		
		for(int i=0;i<var.length;i++) {
			for(int j=0;j<var[i].length;j++) {
				System.out.print(var[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------");
		Arrays.parallelSort(var[0]);
		Arrays.parallelSort(var[1]);
		Arrays.parallelSort(var[2]);
		for(int i=0;i<var.length;i++) {
			for(int j=0;j<var[i].length;j++) {
				System.out.print(var[i][j]+" ");
			}
			System.out.println();
		}
		
		}
	}

