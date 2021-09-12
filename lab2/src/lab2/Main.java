package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main { 

	public static void main(String[] args) {
		//Create arraylist of user-defined class objects
		List<Fruit> fl = new ArrayList<Fruit>();
		
		System.out.println("Fruit List(ordered by name)");
		Fruit s1 = new Fruit(101, "Apple",1000);
		fl.add(s1);
		
		Fruit s2 = new Fruit(102, "orange",1500);
		fl.add(s2);
		fl.add(new Fruit(103,"Kiwi",2000));
		fl.add(new Fruit(104,"Aiwi",2000));
		fl.add(new Fruit(105,"Biwi",2000));
		fl.add(new Fruit(106,"Ciwi",2000));
		fl.add(new Fruit(107,"Diwi",2000));
		fl.add(new Fruit(108,"Eiwi",2000));
		fl.add(new Fruit(109,"Fiwi",2000));
		fl.add(new Fruit(110,"Giwi",2000));
		
		
		
		Collections.sort(fl, new FruitComparator());
		//Traverse elements of arraylist (ordered)
		
		for(Fruit s: fl) {
			System.out.println(s.toString());
			
		}
		System.out.println("Fruit List (reverse order by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		//Traverse elements of arraylist (reserve ordered)
		
		for(int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString()); 
		}
		
		
	}

}
