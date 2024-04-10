package predicate;

import java.util.function.Predicate;

public class CheckPositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> num = n -> n>=0 ? true : false ;
		System.out.println("Is number positive : " + num.test(0));
	}

}
