package lab2;

import java.util.*;

//public class Fruit {}

public class Fruit {
	
	int no; //number
	String name; //name
	int price; //price
	
	public Fruit(int no, String name, int price) {
		// TODO Auto-generated constructor stub
		this.no = no;
		this.name = name;
		this.price = price;
	}
	
}

class FruitComparator implements Comparator<Fruit>{
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
}

class FruitComparatorDesc implements Comparator<Fruit>{
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o2.name.compareTo(o1.name); 
	}

}

