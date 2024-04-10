package predicate;

import java.util.function.Predicate;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> checkEven = (n -> (n % 2) == 0) ;
		System.out.println(" Is number even? : " + checkEven.test(4));
		
		Predicate<Integer> checkOdd = n -> n %2 != 0;
		System.out.println("Is number odd? : "+ checkOdd.test(3));
	}

}
