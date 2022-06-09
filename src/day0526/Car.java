package day0526;

public class Car {
	
	private int num; //접근제어자 private 이 안에서만 사용 가능
	private double gas;
	
	Car(){
		num = 0;
		gas = 0.0;
		System.out.println("차 만들어짐");
	}
	
	public void setCar(int num, double gas) {
		this.num = num;
		this.gas = gas;
		System.out.println("차량번호 : " + num + " 연료량 : " + gas + "으로 설정");
	}
	
	public void show() {
		System.out.println("차량번호 : " + num);
		System.out.println("연료량 : " + gas);
	}
}
