package week3day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FindInterSectoin {

	public static void main(String[] args) {
		int[] num= {3,2,11,4,6,7};
		int[]num2= {1,2,8,4,9,7};
		//Arrays.sort(num);
		//Arrays.sort(num2);
		//List<Integer> list=new LinkedList<Integer>();
		//List<Integer>list2=new LinkedList<Integer>();
		//Set<Integer>set=new LinkedHashSet<Integer>();
		//Set<Integer>set2=new  LinkedHashSet<Integer>();
		HashSet< Integer> set=new HashSet<Integer>();
		
	set.add(3);
	set.add(2);
	set.add(11);
	set.add(4);
	set.add(6);
	set.add(7);
		System.out.println(set);
		
		HashSet< Integer> set2=new HashSet<Integer>();
		set2.add(1);
		set2.add(2);
		set2.add(8);
		set2.add(4);
		set2.add(9);
		set2.add(7);
		System.out.println(set2);
		set.retainAll(set2);
		System.out.println("the intersection numbers are="+set);
		
		
		
	
			
			
		}
				

	
			
			
		

}
		


