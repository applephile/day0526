package day0526;

class Parent { 
	String name;
	
	void PrintInfo() {
		System.out.println("name : " + name);
	}
	
}

class Child extends Parent{
	String hobby;
	
	void PrintInfo() {
		System.out.println("name : " + name + "\nhobby : " + hobby);
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}

public class ParentMain {
	
	public static void main(String[] args) {
		Parent p = new Parent();
		
		p.name = "parent";
		p.PrintInfo();
		
		System.out.println("----------------------");
		
		Child c = new Child();
		
		c.name = "child";
		c.setHobby("swimming");
		
		c.PrintInfo();
	}
	
}
