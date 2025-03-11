package demo;

import java.util.Date;

public class ImmutableClass{
	public static void main(String[] args) {
		TestImmutableClass a1=new TestImmutableClass("Ajit", 1, new Date());
		
		System.out.println(a1);
		
	}
	
}

 final class TestImmutableClass {

	private final String name;
	private final int id;
	private final Date date;

 TestImmutableClass(String name, int id, Date date) {
		this.name = name;
		this.id = id;
		this.date = new Date();
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public Date getDate() {
		return new Date();
	}

	@Override
	public String toString() {
		return "TestImmutableClass [name=" + name + ", id=" + id + ", date=" + date + "]";
	}
	
	
}
