package streams;

import java.util.Arrays;

public class ArrayOperationsUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Basic operations on Array using Streams
		
		int a [] = {1,2,3,4,5};
		
		System.out.println("Min " + Arrays.stream(a).min().getAsInt());
		System.out.println("Max " + Arrays.stream(a).max().getAsInt());
		System.out.println("Average " + Arrays.stream(a).average().getAsDouble());
		System.out.println("Sum "+ Arrays.stream(a).sum());
		
		//find 2nd largest in given array
			
		System.out.println("Second largest element is : "+Arrays.stream(a).boxed().sorted((x,y)-> y-x).skip(1).findFirst().get());
	}

}
