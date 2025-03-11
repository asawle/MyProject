package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton single = Singleton.getInstance();

		try (FileOutputStream fileOut = new FileOutputStream("person.ser");
				ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
			out.writeObject(single);
			System.out.println("Serialized data is saved in person.ser");
			System.out.println(single.hashCode());
		} catch (IOException i) {
			i.printStackTrace();
		}
		
		
Singleton person = null;
        
        try (FileInputStream fileIn = new FileInputStream("person.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            person = (Singleton) in.readObject();
            System.out.println("Deserialized Person...");
            System.out.println(person.hashCode());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

	}

}

class Singleton implements Serializable {
	private static final long serialVersionUID = 1L;
	private static Singleton instance;

	private Singleton() {
	};

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;

	}
	public Object readResolve() throws ObjectStreamException {
        // Return the singleton instance after deserialisation
        return instance;
    }
}
