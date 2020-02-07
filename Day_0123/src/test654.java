public class test654 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Scanner scn = new Scanner(System.in);
		
		
		int [] a = new int[6];
		
		
		for(int x = 0; x < 6 ; x++)
		{
			a[x] = (int) (Math.random()*45+1);
		}
		for(int x= 0; x< 6 ; x++) 
		{
			System.out.print(a[x]+"\t");
		}
	}
}
