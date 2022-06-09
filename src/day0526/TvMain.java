package day0526;

public class TvMain {

	public static void main(String[] args) {

		SmartTv sTv = new SmartTv();
		
		if(sTv.power != true) {	
			sTv.power();
			System.out.println("smartTv 전원을 켜다");
		}
		
		sTv.channel = 10;
		
		sTv.channelUp();
		sTv.channelUp();
		
		System.out.println("현재 채널 : " + sTv.channel);
		
		sTv.channelDown();
		System.out.println("현재 채널 : " + sTv.channel);
		
		if(sTv.net.power != true) {	
			sTv.net.power();
			System.out.println("Netflix 전원을 켜다");
		}
		
		sTv.play();
		sTv.rew();
		sTv.stop();
		sTv.ff();
		sTv.play();
		
		if(sTv.net.power == true) {
			sTv.net.power();
			System.out.println("Netflix 전원을 끄다");
		}
		
		if(sTv.power == true) {
			sTv.power();
			System.out.println("smartTv 전원을 끄다");
		}
		
		
	}

}
