package aggregation.shoppingCartSystem;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

	private List<Product> products = new ArrayList<>();

	public Product findByName(String productName) {
		return products.stream().filter(product -> product.getName().equalsIgnoreCase(productName)).findAny().orElse(null);
	}

	public void addProduct(Product prouct) {
		this.products.add(prouct);
	}
}
