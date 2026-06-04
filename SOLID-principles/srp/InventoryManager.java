package srp;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {

	private Map<String, Integer> stock = new HashMap<>();

	public InventoryManager() {
		stock.put("LAPTOP", 10);
		stock.put("PHONE", 25);
		stock.put("TABLET", 15);
	}

	public boolean checkInventory(String productId, int quantity) {
		 return stock.getOrDefault(productId, 0) >= quantity;
	}

	public void updateInventory(String productId, int quantity) {
		 stock.put(productId, stock.get(productId) - quantity);
	}

}
