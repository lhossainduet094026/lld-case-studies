package aggregation.shoppingCartSystem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Product> items = new ArrayList<>();

	public void addItem(Product product) {
		items.add(product);
	}

	public void clearCart() {
		items.clear();
	}

	public BigDecimal getTotal() {
		return items.stream().map(product -> product.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
	}

	public List<Product> getItems() {
		return items;
	}

	public int getItemCount() {
		return items.size();
	}
}
