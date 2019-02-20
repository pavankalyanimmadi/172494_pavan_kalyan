package assignment5;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
public static void main(String[] args) {
		
		List<String> array = new ArrayList<String>();
		array.add("venky");
		array.add("venkat");
		array.add("venkatesh");
		array.add("surya");
		System.out.println("String is :\n"+array);
		System.out.println("The first words of the Strings are-->");
	
		String stringresult = array.stream().map(x -> Character.toString(x.charAt(1))).reduce(" ", (a, b) -> a + b);
		System.out.println(stringresult);
	
	}

}
