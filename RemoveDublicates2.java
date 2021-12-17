package week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicates2 {

	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		String[] str= text.split(" ");
		Set<String> str2= new LinkedHashSet<String>();
		for(String s:str) {
			str2.add(s);
			
		}
		System.out.println(str2);

	}

}
