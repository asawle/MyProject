package demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Immutable {
	public static void main(String[] args) {

	}
}

final class Immutable1 {

	private final int id;
	private final String name;
	private Map<Integer, String> map;

	public Immutable1(int id, String name, Map<Integer, String> map) {

		this.id = id;
		this.name = name;
		this.map = new HashMap(map);

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

public Map<Integer, String> getMap(){
	return Collections.unmodifiableMap(map);
}

}
