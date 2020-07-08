package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		//list.remove(1);
		//list.remove("Anna");
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------------------");
		//tira todas as palavras que come�am com 'M'
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------------");
		//diz a posi��o do elemento
		System.out.println("Index of Bob: "+list.indexOf("Bob"));
		//quando n�o encontra retorna -1
		System.out.println("Index of Marco: "+list.indexOf("Marco"));
		
		
		System.out.println("----------------------");
		//filtrar
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		
		System.out.println("----------------------");
		//Encontrar o primeiro cara que come�a com a letra 'A' se n�o retorna nulo
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		
		System.out.println(name);
		System.out.println(name1);
	}

}
