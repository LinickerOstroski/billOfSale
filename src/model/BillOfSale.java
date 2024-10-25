package model;

import java.util.List;

public class BillOfSale {
	
	
	
	private List<SaleItem> products;
	
	public BillOfSale(List<SaleItem> products) {
		super();
		this.products = products;
	}

	public List<SaleItem> getProducts() {
		return products;
	}

	public void setProducts(List<SaleItem> products) {
		this.products = products;
	}
	
	public void seeProducts() {
		for (SaleItem saleItem : products) {
			System.out.println("Produto: " + saleItem.getProduct().getNome());
			System.out.println("Preço: " + saleItem.getProduct().getPrice());
			System.out.println("Quantidade: " + saleItem.getQuantity());
			System.out.println();
		}
	}
	
	public double getTotalPrice() {
		
		double total = 0.0;
		for (SaleItem saleItem : products) {
			total += saleItem.getTotalPrice();
		}
		return total;
	}
	
}
