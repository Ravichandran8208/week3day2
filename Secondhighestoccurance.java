package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Multiset.Entry;

public class Secondhighestoccurance {

	public static void main(String[] args) {
	String name="paypalindia";
	char[] ca=name.toCharArray();
	Map<Character,Integer>newone=new HashMap<Character,Integer>();
	for(int i=0;i<ca.length;i++) {
		newone.put(ca[i], newone.getOrDefault(ca[i], 0)+1);
		
		
	}
	System.out.println(newone);
	List<Integer>list=new ArrayList<Integer>(newone.values());
	Collections.sort(list);
	Integer s1=list.get(list.size()-2);
	System.out.println(s1);
	System.out.println("second largest"+s1);
	for (java.util.Map.Entry<Character, Integer> entry:newone.entrySet() ) {
		if(entry.getValue()==s1) {
			System.out.println("the key for value"+s1+"is"+entry.getKey());
		}
		
	}

	}

}
