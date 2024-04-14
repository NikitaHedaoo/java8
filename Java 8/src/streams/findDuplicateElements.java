package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDuplicateElements {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		//Find total number of elements
		long numberOfElements = myList.stream().count();
		System.out.println("Total number of elements : "+numberOfElements);
		
		//Remove duplicates
		//myList.stream().distinct().forEach(System.out::println);

		Set<Integer> mySet = new HashSet<Integer>();
		
		//Find duplicates
		myList.stream().filter(x -> !mySet.add(x)).forEach(System.out::println);
		
		
	}

}
