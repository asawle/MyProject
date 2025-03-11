package demo;

//resource have autoclose by using close method from the Autoclosable interface.

class Myresource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Resource closed");

	}

	public void doSomething() {
		System.out.println("Do Something");
	}

}

public class TryWithResources {

	public static void main(String[] args) throws Exception {
		try (Myresource resource = new Myresource()) {
			resource.doSomething();
		}

	}

}
