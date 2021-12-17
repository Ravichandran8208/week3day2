package week3day2;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class PrintDublicatesInArray {

	public static void main(String[] args) {
		int [] arr= { 14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> array=new LinkedHashSet<Integer>();
		//Collections.sort(array);
		System.out.println(arr.length);
		for(int num:arr) {
			if(!array.add(num)) {
				System.out.println("Dublicate numbers are="+num);
			}
		}

	}

}
