package thread;

class AA extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			try{
				Thread.sleep(200);
			}catch(Exception e) {};
			System.out.println();
		}
	}
}

class BB implements Runnable{
	@Override
	public void run() {
		int s=0;
		for(int i=1;i<10;i++) {
			System.out.println(i);
			s+=i;
			try{
				Thread.sleep(200);
			}catch(Exception e) {};	
		}
		System.out.println("s="+s);
	}
}


public class Exam_12_Thread_implements_EX {
	public static void main(String[] args) {
		AA a = new AA();
		Runnable b = new BB();
		Thread t = new Thread(b);
		a.start();
		t.start();
	}
}
