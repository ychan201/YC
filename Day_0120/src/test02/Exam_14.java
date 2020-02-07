package test02;

interface Control{
	int MAX_VOLUME=10; // static final이 int 앞에 디폴트값으로 정의되어있음.
	int MIN_VOLUME=0;
	void turnOn();	 // abstract가 void 앞에 디폴트값으로 정의되어있음.
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) { // default 메소드와 static 메소드는 자바8.0부터 새롭게 추가된 기능.
		if(mute) System.out.println("무음처리");
		else System.out.println("무음 해제");
	}
	static void changeBattery(){
		System.out.println("건전지 교체");
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
		System.out.println("현재 TV 볼륨은 "+this.volume+"입니다");
	}@Override
	public void turnOff() {
		System.out.println("TV ON 합니다");
	}@Override
	public void turnOn() {
		System.out.println("TV OFF 합니다");
	}
}




public class Exam_14 {
	public static void main(String[] args) {
		Tv vv = new Tv();
		vv.print();
		vv.setVolume(10);
	}
}
