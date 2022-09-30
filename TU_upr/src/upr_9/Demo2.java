package upr_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Person2> arrayList = new ArrayList<>();
		LinkedList<Person2> linkedList = new LinkedList<>();
		HashSet<Person2> hashSet = new HashSet<>();
		TreeSet<Person2> treeSet = new TreeSet<>();
			
		//in the order of adding:
		//[Person [name=Ivancho, age=17], Person [name=Mariika, age=18]....]
			arrayList.add(new Person2("Ivancho",17));
			arrayList.add(new Person2("Mariika",18));
			arrayList.add(new Person2("Dancho",16));
			arrayList.add(new Person2("Gancho",20));
			arrayList.add(new Person2("Pancho",19));
			arrayList.add(new Person2("Vancho",22));
			arrayList.add(new Person2("Siika",20));
			arrayList.add(new Person2("Ginka",21));
			arrayList.add(new Person2("Pencho",15));
			arrayList.add(new Person2("Ivancho",17));
			
		//in the order of adding:
		//[Person [name=Ivancho, age=17], Person [name=Mariika, age=18]....]
			linkedList.add(new Person2("Ivancho",17));
			linkedList.add(new Person2("Mariika",18));
			linkedList.add(new Person2("Dancho",16));
			linkedList.add(new Person2("Gancho",20));
			linkedList.add(new Person2("Pancho",19));
			linkedList.add(new Person2("Vancho",22));
			linkedList.add(new Person2("Siika",20));
			linkedList.add(new Person2("Ginka",21));
			linkedList.add(new Person2("Pencho",15));
			linkedList.add(new Person2("Ivancho",17));
			
		//not in the order of adding:
		//[Person [name=Mariika, age=18], Person [name=Pancho, age=19]....]
			hashSet.add(new Person2("Ivancho",17));
			hashSet.add(new Person2("Mariika",18));
			hashSet.add(new Person2("Dancho",16));
			hashSet.add(new Person2("Gancho",20));
			hashSet.add(new Person2("Pancho",19));
			hashSet.add(new Person2("Vancho",22));
			hashSet.add(new Person2("Siika",20));
			hashSet.add(new Person2("Ginka",21));
			hashSet.add(new Person2("Pencho",15));
			hashSet.add(new Person2("Ivancho",17));
			
		//cannot add elements of class -> ClassCastException
		//sorting by name
			treeSet.add(new Person2("Ivancho",17));
			treeSet.add(new Person2("Mariika",18));
			treeSet.add(new Person2("Dancho",16));
			treeSet.add(new Person2("Gancho",20));
			treeSet.add(new Person2("Pancho",19));
			treeSet.add(new Person2("Ivancho",14));
			treeSet.add(new Person2("Siika",20));
			treeSet.add(new Person2("Ginka",21));
			treeSet.add(new Person2("Pencho",15));
			treeSet.add(new Person2("Ivancho",17));
			
			System.out.println(arrayList);
			System.out.println(linkedList);
			System.out.println(hashSet);
			System.out.println(treeSet);
			
			String str1 = new String("Test");
			String str2 = new String("test");
			System.out.println(str1==str2);
			System.out.println(str1.equals(str2));
			
			//System.out.println(linkedList.size());
			//comparing the first and the last element of the linked list
			System.out.println(linkedList.get(0)==linkedList.get(9));            //-> false
			System.out.println(linkedList.get(0).equals(linkedList.get(9)));     //-> false if not overriden in Person
			
			System.out.println("contains: "+linkedList.contains(new Person2("Ivancho",17)));
			
			System.out.println("compare: "+str1.compareTo(str2));
			//System.out.println("compare: "+linkedList.get(1).compareTo(linkedList.get(9)));
			
			System.out.println(linkedList.get(0));
			System.out.println(linkedList.get(9));
			System.out.println(linkedList.get(0).hashCode());
			System.out.println(linkedList.get(9).hashCode());
			
			linkedList.sort(null);
			System.out.println(linkedList);
		}

}
