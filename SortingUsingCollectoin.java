package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollectoin {

	public static void main(String[] args)  {
		 
		
		List <String> input=new ArrayList<String>();
		input.add("HCL");
		input.add("Wibro");
		input.add("Aspire Systems");
		input.add("CTS");
		
		Collections.sort(input);
		System.out.println(input);
		Collections.reverse(input);
		System.out.println(input);
		
		

	}

}
