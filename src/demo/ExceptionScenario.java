package demo;

import java.io.IOException;

public class ExceptionScenario {

	public static void main(String[] args) {

	}

}
//If the superclass method does not declare an exception, 
//subclass overridden method cannot declare the checked exception but it can declare unchecked exception.

class Parent {
	public void printMessage() {
		System.out.println("Inside Parent class");
	}
}

class Child extends Parent {
	public void printMessage() throws RuntimeException {
		System.out.println("Inside Child class");
	}

	class Parent1 {
		public void printMessage() throws RuntimeException{
			System.out.println("Inside Parent class");
		}
	}

	class Child1 extends Parent1 {
		public void printMessage() throws RuntimeException {
			System.out.println("Inside Child class");
		}
	}
}
