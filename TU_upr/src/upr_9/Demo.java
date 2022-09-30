package upr_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		HashSet<Integer> hashSet = new HashSet<>();
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		//adding values to the collections
		for(int i=10; i>0;i--) {
			arrayList.add(i);      //10, 9, ... 1
			linkedList.add(i);     //10, 9, ... 1
			hashSet.add(i);        //1, 2, ... 10 -> sorted
			treeSet.add(i);        //1, 2, ... 10 -> sorted
		}
		
		arrayList.add(5);    //10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 5
		linkedList.add(5);   //10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 5
		hashSet.add(5);      //1, 2, 3, 4, 5, 6, 7, 8, 9, 10  -> cannot add existing element
		treeSet.add(5);      //1, 2, 3, 4, 5, 6, 7, 8, 9, 10  -> cannot add existing element
		
		System.out.println(arrayList);
		System.out.println(linkedList);
		System.out.println(hashSet);
		System.out.println(treeSet);
		
		
	}
}
