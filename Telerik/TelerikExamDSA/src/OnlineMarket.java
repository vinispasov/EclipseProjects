import java.util.List;
import java.util.ArrayList;
public class OnlineMarket {

	public static void main(String[] args) {
		
	}
	static class Market{
		private List<Product>products;
		public Market() {
			setProducts(new ArrayList<>());
		}
		
		public List<Product> getProducts() {
			return products;
		}
		public void setProducts(List<Product> products) {
			this.products = products;
		}
		
		public void addProduct(Product product) {
			if (products.contains(product)) {
				System.out.println("Error: Product "+product.getName()+" already exists");
			}else {
			   products.add(product);
			   System.out.println("Ok: Product "+ product.getName()+" added successfully");
			}
		}
		
	}
	
	static class Product{
		private String name;
		private double price;
		private String type;
		
		public Product(String name, double price) {
			this.name = name;
			this.price = price;
		}
		
		public Product(String name, double price, String type) {
			this.name = name;
			this.price = price;
			this.type = type;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
	}
}
