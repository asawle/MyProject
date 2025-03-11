package demo;

class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String message) {
		super(message);
	}
	
}
public class CustomExceptionTest {
	
	public static void validate(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Age is not valid to vote");
		}
		else {
			System.out.println("Age is valid");
		}
	}

	public static void main(String[] args) {
		
		try {
			validate(13);
		} catch (InvalidAgeException e) {
			System.out.println("Caugth the Exception :"+e);
		}
		
		System.out.println("Rest of the code............");

	}

}


