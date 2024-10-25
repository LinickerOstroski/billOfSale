package model;

public class Product {
	
	private int id;
	private double price;
	private String nome;
	
	public Product(int id,String nome, double price) {
		this.id = id;
		this.price = price;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
