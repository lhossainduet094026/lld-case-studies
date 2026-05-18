package aggregation.shoppingCartSystem;

import java.util.List;

public class Customer {

	private String name;

	private Cart cart;

	public Customer(String name, Cart cart) {
		this.name = name;
		this.cart = cart;
	}

	public void checkOut() {

		if (cart != null) {
			List<Product> items = cart.getItems();
			items.forEach(item -> {
				System.out.println("productName:" + item.getName() + " Price" + item.getPrice());
			});

			System.out.println("cart total:" + cart.getTotal());
			cart.clearCart();
		}
	}
}
