package aggregation.shoppingCartSystem;

import java.math.BigDecimal;

public class CartApp {

	public static void main(String[] args) {

		  // Create products and add to catalog
        Product laptop = new Product("Laptop", BigDecimal.valueOf(999.99));
        Product mouse = new Product("Mouse", BigDecimal.valueOf(29.99));
        Product keyboard = new Product("Keyboard", BigDecimal.valueOf(79.99));

        Catalog catalog = new Catalog();
        catalog.addProduct(laptop);
        catalog.addProduct(mouse);
        catalog.addProduct(keyboard);
        
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        Customer alice = new Customer("Alice", cart1);
        Customer bob = new Customer("Bob", cart2);

        // Both customers add the same laptop to their carts
        cart1.addItem(laptop);
        cart1.addItem(mouse);
        cart2.addItem(laptop);
        cart2.addItem(keyboard);

        System.out.println("Alice's cart: " + cart1.getItemCount() + " items, $" + cart1.getTotal());
        System.out.println("Bob's cart: " + cart2.getItemCount() + " items, $" + cart2.getTotal());

        alice.checkOut();
	}
}
