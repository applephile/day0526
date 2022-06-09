package day0526;

public class Netflix {
	
	boolean power;
	int counter;
	
	void power() {
		power = !power;
	}
	
	void play() {
		System.out.println("재생중");
	}
	void stop() {
		System.out.println("정지중");
	}
	void rew() {
		System.out.println("되감기");
	}
	void ff() {
		System.out.println("빨리감기");
	}
	
}
