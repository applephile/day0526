package day0526;

public class RacingCar extends Car{
	
	private int course;
	
	public RacingCar() {
		course = 0;
		System.out.println("레이싱카 만들어짐");
	}
	
	public void setCourse(int course) {
		this.course = course;
		System.out.println("코스번호 설정 : " + this.course);
	}
	
}
