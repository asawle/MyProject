package solidprincipal;

interface InputDevice {
	void input();

}

class Keyboard implements InputDevice {

	@Override
	public void input() {
		System.out.println("Keyboard is typing");

	}

}

class Computer{
	private InputDevice inputDevice;
	
	public Computer(InputDevice inputDevice) {
		this.inputDevice=inputDevice;
	}
	
	public void operate() {
		inputDevice.input();
	}
}

public class Solid {
	public static void main(String[] args) {
		Keyboard keyboard= new Keyboard();
		Computer computer= new Computer(keyboard);
		computer.operate();
	}

	

}
