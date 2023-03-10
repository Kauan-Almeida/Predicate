package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {

	/**Fazer um programa que, a partir de uma lista de produtos, remova da
	lista somente aqueles cujo pre?o m?nimo seja 100.**/
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		list.removeIf(p -> p.getPrice() >= 100.00);
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}