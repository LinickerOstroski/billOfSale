package view;

import java.util.ArrayList;

import model.SaleItem;
import model.Product;
import model.BillOfSale;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<SaleItem> list = new ArrayList<SaleItem>();
		
		Product p1 = new Product(1, "Caixa de leite 1L", 10.0);
		Product p2 = new Product(1, "Batata palha 100g", 7.99);
		Product p3 = new Product(1, "Saco de Arroz 5kg", 29.99);
		
		SaleItem cart1 = new SaleItem(p1, 10);
		SaleItem cart2 = new SaleItem(p2, 5);
		SaleItem cart3 = new SaleItem(p3, 2);
		
		list.add(cart1);
		list.add(cart2);
		list.add(cart3);
		
		BillOfSale sc = new BillOfSale(list);
		
		
		System.out.println("\n\t---Nota de Venda---\n");
		sc.seeProducts();
		double total = sc.getTotalPrice();
		System.out.printf("Preço total da compra: %.2f",total);
	
	}
}
