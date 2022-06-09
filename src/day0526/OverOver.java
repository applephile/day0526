package day0526;

class Parent1{
	void print() {
		System.out.println("부모 클래스의 print()메서드입니다.");
	}
}

class Child1 extends Parent1{
	//오버라이딩
	void print() {
		System.out.println("자식 클래스의 print()메서드입니다.");
	}
	
	//매개변수 1개짜리로 오버로딩
	void print(int n) {
		System.out.println(n);
	}
}

public class OverOver {
	
	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.print();
		
		System.out.println("----------------------");
		
		Child1 c = new Child1();
		
		c.print();
		c.print(3);
	}
	
}
