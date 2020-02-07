package Student;

public class StudentHak extends Student {
	public StudentHak(int bun, String name, int[] jum) {
		super(bun, name, jum);
	}
	@Override
	public void account() { // ����,���(�Ҽ���2�ڸ�)�� ����� ����ϴ� �޼ҵ�
		int sum=0;
		for(int i=0;i<jum.length;i++) {
			sum+=jum[i];
		}
		avg = (double)sum/jum.length;
		System.out.print(sum+"\t");
		System.out.println(avg);
	}@Override
	public void scoreMax() { // ������ �ִ� �ּҸ� ���Ͽ� ����ϴ� �޼ҵ�
		int max=jum[0],min=jum[0];
		for(int i=0;i<jum.length;i++) {
			if(max<jum[i]) max=jum[i];
			if(min>jum[i]) min=jum[i];
		}
		System.out.println("������ �ִ밪 : "+max);
		System.out.println("������ �ּҰ� : "+min);
		
	}@Override
	public void scoreSelection() { // ���������� �̿��Ͽ� ���� ��������
		for(int i=0;i<jum.length-1;i++) {
			for(int j=i+1;j<jum.length;j++) {
				if(jum[i]>jum[j]) {
					int temp=jum[i];
					jum[i]=jum[j];
					jum[j]=temp;
				}
			}
		}
		System.out.println("�������� ����");
		for(int i=0;i<jum.length;i++) {
			System.out.print(jum[i]+"\t");
		}
		System.out.println();
	}@Override
	public void scoreBubble() { // ���������� �̿��Ͽ� ���� ��������
		for(int j=0;j<jum.length-1;j++) {
			for(int i=0;(i<jum.length-(j+1));i++) {
			if(jum[i]<jum[i+1]) {
					int temp=jum[i+1];
					jum[i+1]=jum[i];
					jum[i]=temp;	
				}
			}
		}
		System.out.println("�������� ����");
		for(int i=0;i<jum.length;i++) {
			System.out.print(jum[i]+"\t");
		}
	}
	
}
