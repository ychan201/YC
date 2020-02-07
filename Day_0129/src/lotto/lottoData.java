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
			if(lt[i].dcnt<3) lt[i].rank="꽝";
			else if(lt[i].dcnt==3) lt[i].rank="5등";
			else if(lt[i].dcnt==4) lt[i].rank="4등";
			else if(lt[i].dcnt==5 && lt[i].bonus) lt[i].rank="2등";
			else if(lt[i].dcnt==5) lt[i].rank="3등";
			else if(lt[i].dcnt==6) lt[i].rank="1등";
			
		}
		
		System.out.print("당첨번호 : ");
		for(int i=0;i<dangchum.length-1;i++) {
			System.out.print(dangchum[i]);
			if(i<6) System.out.print(", ");
		}
		System.out.println("ㅡ 보너스 "+dangchum[6]);
		for(int i=0;i<cnt;i++) {
			for(int j=0;j<6;j++) {
				System.out.print(lt[i].game[j]+"\t");
			}
			if(lt[i].rank.equals("1등")||lt[i].rank.equals("1등")||lt[i].rank.equals("1등"))
			System.out.println(" -- "+lt[i].rank+i+"번째 복권");
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
