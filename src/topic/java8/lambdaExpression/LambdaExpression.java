package topic.java8.lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpression {

	public static void main(String[] args) {

		MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Hello World");
		myFunctionalInterface.draw();

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<Integer> squarenum = list.stream().map(e -> e * e * e).collect(Collectors.toList());
		System.out.println(squarenum);

	}

}
