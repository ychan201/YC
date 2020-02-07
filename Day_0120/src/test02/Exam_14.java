package test02;

interface Control{
	int MAX_VOLUME=10; // static final�� int �տ� ����Ʈ������ ���ǵǾ�����.
	int MIN_VOLUME=0;
	void turnOn();	 // abstract�� void �տ� ����Ʈ������ ���ǵǾ�����.
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) { // default �޼ҵ�� static �޼ҵ�� �ڹ�8.0���� ���Ӱ� �߰��� ���.
		if(mute) System.out.println("����ó��");
		else System.out.println("���� ����");
	}
	static void changeBattery(){
		System.out.println("������ ��ü");
	}
}

class Tv implements Control{
	private int volume;
	
	void print() {
		System.out.println("Tv.volume = "+volume);
	}
	@Override
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME) {
			this.volume=MAX_VOLUME;
		}else if(volume<MIN_VOLUME) {
			this.volume=MIN_VOLUME;
		}
		else this.volume=volume;
		System.out.println("���� TV ������ "+this.volume+"�Դϴ�");
	}@Override
	public void turnOff() {
		System.out.println("TV ON �մϴ�");
	}@Override
	public void turnOn() {
		System.out.println("TV OFF �մϴ�");
	}
}




public class Exam_14 {
	public static void main(String[] args) {
		Tv vv = new Tv();
		vv.print();
		vv.setVolume(10);
	}
}
