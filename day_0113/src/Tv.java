
public class Tv {
	String color,pow;
	boolean power;
	int channel;
	
	void power() { power = !power;
					if (power==true) pow="ON";
					else pow="OFF";}
	void channelUp() { channel++;}
	void channelDown() { channel--; }
}
