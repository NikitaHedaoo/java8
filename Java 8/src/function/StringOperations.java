package function;
import java.util.ArrayList;
import java.util.function.Function;
public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String,Integer> getLength = n -> n.length();
		System.out.println("Length of given String is : " + getLength.apply("Nikita"));
		
		Function<String,String> subString = x -> x.substring(0,4);
		System.out.println("Substring [0,4] : "+ subString.apply("Divyank"));
		
		Function<String,Integer> getIndex = x -> x.indexOf('n');
		System.out.println("index of n is : "+ getIndex.apply("Nipun"));
	}

}
