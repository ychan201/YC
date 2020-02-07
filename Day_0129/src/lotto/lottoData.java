package lotto;

public class lottoData {
	lotto[] lt;
	int cnt;
	int[] dangchum=new int[7];
	
	lottoData(lotto[] l,int c,String str[]){
		lt=l;
		cnt=c;
		for(int i=0;i<7;i++) {
			dangchum[i]=Integer.parseInt(str[i]);
		}
	}
	
	
	
	void dprint() {
		for(int i=0;i<cnt;i++) {
			for(int j=0;j<6;j++) {
				for(int k=0;k<6;k++) {
					if(lt[i].game[j]==dangchum[k]) lt[i].dcnt++;
				}
				if(lt[i].game[j]==dangchum[6]) lt[i].bonus=true;
			}
		}
		
		for(int i=0;i<cnt;i++) {
			if(lt[i].dcnt<3) lt[i].rank="��";
			else if(lt[i].dcnt==3) lt[i].rank="5��";
			else if(lt[i].dcnt==4) lt[i].rank="4��";
			else if(lt[i].dcnt==5 && lt[i].bonus) lt[i].rank="2��";
			else if(lt[i].dcnt==5) lt[i].rank="3��";
			else if(lt[i].dcnt==6) lt[i].rank="1��";
			
		}
		
		System.out.print("��÷��ȣ : ");
		for(int i=0;i<dangchum.length-1;i++) {
			System.out.print(dangchum[i]);
			if(i<6) System.out.print(", ");
		}
		System.out.println("�� ���ʽ� "+dangchum[6]);
		for(int i=0;i<cnt;i++) {
			for(int j=0;j<6;j++) {
				System.out.print(lt[i].game[j]+"\t");
			}
			if(lt[i].rank.equals("1��")||lt[i].rank.equals("1��")||lt[i].rank.equals("1��"))
			System.out.println(" -- "+lt[i].rank+i+"��° ����");
		}
		
		
	}
	
	void gprint() {
		for(int i=0;i<cnt;i++) {
			for(int j=0;j<6;j++) {
				System.out.print(lt[i].game[j]+"\t");
			}
			System.out.println();
		}
	}
}
