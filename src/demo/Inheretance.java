package demo;

class Parent1 {

	public void printSomething() {
		System.out.println("Hello Parent");
	}
}

class Child1 extends Parent1 {
	@Override
	public void printSomething() {
		System.out.println("Hello Child");

	}
}

public class Inheretance {

	public static void main(String[] args) {

		Parent1 p = new Parent1();
		p.printSomething();
		Child1 c = new Child1();
		c.printSomething();
		
		Parent1 p2= new Child1();
		p2.printSomething();
		
		//Child1 c2= new Parent1();
	}

}
