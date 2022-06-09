package day0526;

public class SmartTv extends Tv{
	
	Netflix net = new Netflix();
	
	int counter = net.counter;
	
	void play() { net.play(); }
	void stop() { net.stop(); }
	void rew() { net.rew(); }
	void ff() { net.ff(); }
}
