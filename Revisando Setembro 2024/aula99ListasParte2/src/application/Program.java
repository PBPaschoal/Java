package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Bruna");
		list.add("Bruno");
		list.add("Kabeça");
		list.add("Pepe Antonio");
		list.add("Lola");
		list.add("Belinha");
		list.add("Fred");
		list.add("Jenna");
		list.add("Pandora");
		list.add(3, "Luna");
		list.add("Anna");
		list.add("Junior");
		list.add("Doug");
		
		System.out.println(list.size());
		list.remove("Anna");
		list.remove(11);
		
		for(String x : list) {
			System.out.println(x);
		}
		
	}

}
