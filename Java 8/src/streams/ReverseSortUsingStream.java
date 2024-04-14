package streams;

import java.util.Arrays;
import java.util.List;

public class ReverseSortUsingStream {

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

		myList.stream().sorted((x,y) -> y-x).distinct().forEach(System.out::println);
	}

}
