package Student;

public abstract class Student {
	int bun;
	String name;
	int[] jum = new int[10];
	int tot;
	double avg;

	public Student(int bun, String name, int[] jum) {
		this.bun = bun;
		this.name = name;
		this.jum = jum;
	}
	
	public void title() {
		System.out.println("��ȣ\t�̸�\t����\t���");
		System.out.print(bun+"\t"+name+"\t");
	}
	
	public abstract void account(); // ����,���(�Ҽ���2�ڸ�)�� ����� ����ϴ� �޼ҵ�
	public abstract void scoreMax(); // ���� �ִ�, �ּҸ� ���Ͽ� ����ϴ� �޼ҵ�
	public abstract void scoreSelection(); // ���������� �̿��Ͽ� ���� ��������
	public abstract void scoreBubble(); // ��ǰ������ �̿��Ͽ� ���� ��������
}
