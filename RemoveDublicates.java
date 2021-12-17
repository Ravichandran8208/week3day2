package week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicates {

	public static void main(String[] args) {
		String values = "paypal india";
		Set<Character> charset=new LinkedHashSet<Character>();
		for (int i = 0; i < values.length(); i++) {
			charset.add(values.charAt(i));
			
		}
		for (Character  character : charset) {
			if(character!=' ')
			System.out.println( character);
				
		}
		

	}

}
