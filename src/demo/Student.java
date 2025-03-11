package demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Student {

	private int id;
	private String name;
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student() {

	}

	public Student(int i, String n, String c) {
		id = i;
		name = n;
		city = c;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public static void main(String[] args) {

		List<Student> list = Arrays.asList(new Student(1, "Ajit", "Kanpur"), new Student(2, "Rahul", "Vishal"),
				new Student(3, "Tushar", "Nashik"), new Student(4, "Vijay", "Nashik"));

		Map<String, Long> count = list.stream().collect(Collectors.groupingBy(Student::getCity, Collectors.counting()));
		
		List<Entry<String, Long>> sortedList=count.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());

		sortedList.forEach(entry->System.out.println(entry.getKey()+":"+entry.getValue()));
	}
}