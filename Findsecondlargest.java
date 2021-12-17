package week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Findsecondlargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		
		List<Integer> n= new ArrayList<Integer>();
		for(Integer n1:data) {
			n.add(n1);
		}
		Collections.sort(n);
		System.out.println(n.get(n.size()-2));
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(7);
		list.add(8);
		int integer = list.get(0);
		int integer2 = list.get(list.size()-1);
		
		for(int i=integer+1;i<integer2;i++) {
			if(!list.contains(i)) {
				System.out.println("missing element is="+i);
			}
		}

	}

}
