package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenOutUsingStreams {

	public static void main(String[] args) {
		
		 List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		 
		 List<Integer> evenList = list.stream().filter(x-> x % 2 == 0).collect(Collectors.toList());
		 System.out.println("Even List : " +evenList);
		 
		 List<Integer> oddList = list.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
		 System.out.println("Odd List : "+ oddList);

	}

}
