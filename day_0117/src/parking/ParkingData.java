package parking;

public class ParkingData {
	Parking[] pk;
	int cnt;
	ParkingData(Parking[] p,int cnt){
		pk=p;
		this.cnt=cnt;
	}
	
	void parkingPay(){
		for(int i=0;i<cnt;i++) {
			if(pk[i].parkTime<10) {
				pk[i].money=0;
			}
			else if(10<=pk[i].parkTime && pk[i].parkTime<30) {
				pk[i].money=500;
			}
			else if(pk[i].parkTime>=30) {
				pk[i].money = ((pk[i].parkTime-30)/10)*500 +1000;
			}
			
			if (pk[i].money>30000) pk[i].money=30000;
		}
	}
	
	void pPayPrint() {
		System.out.println("������ȣ\t�����ð�(��)\t�������");
		for(int i=0;i<cnt;i++) {
			System.out.println(pk[i].carNo+"\t"+pk[i].parkTime+"\t\t"+pk[i].money);
		}
	}
	
	void jungsan() {
		int sum = 0;
		for(int i=0;i<cnt;i++) {
			sum+=pk[i].money;
		}
		System.out.println("-----------------����-------------------");
		System.out.println("���� �� ������� : "+cnt+"��");
		System.out.println("�� ������� : "+sum+"��");
	}
}
