package ClasseAtributoMetodo2;

//Classe produto
public class Product {
	
	//Atributos da classe
	public String name;
	public Double price;
	public int quantity;
	
	//Metodo para calcular o valor do estoque
	public double totalValueInStock() {
		
		return price * quantity;
		
	}
	
	//Metodo para adicionar produtos no estoque.
	public void addProducts(int quantity) {
		
		this.quantity += quantity;
		
	}
	
	//Metodo para remover produtos do estoque.
	public void removeProducts(int quantity) {
		
		this.quantity -= quantity;
		
	}
	
	//Metodo para imprimir os dados usando o toString.
	public String toString() {
		
		return name 
		+ ", $ " 
		+ String.format("%.2f", price) 
		+ ", " + quantity
		+ " units, Total: $ "
		+ String.format("%.2f", totalValueInStock());
	}

}
