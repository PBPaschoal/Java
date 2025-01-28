package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
		
		System.out.println(list.size());
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------- REMOVE ----------");
		list.remove("Lola");
		list.remove(5);
		list.removeIf(x -> x.charAt(0) == 'B');
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------- Index ----------");
		System.out.println("Index of Pandora: " + list.indexOf("Pandora"));
		
		System.out.println("---------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'P').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
		System.out.println(name);
	}

}
