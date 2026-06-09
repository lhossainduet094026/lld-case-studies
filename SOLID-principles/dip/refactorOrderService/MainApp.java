package dip.refactorOrderService;

public class MainApp {

	public static void main(String[] args) {

		System.out.println("--- MySQL ---");
		Database mysql = new MYSQLDatabase();
		OrderService mysqlService = new OrderService(mysql);
		mysqlService.placeOrder("ORD-001", "{ item: 'Widget', qty: 3 }");
		String order1 = mysqlService.getOrder("ORD-001");
		System.out.println("Order: " + order1);

		System.out.println();
		System.out.println("--- PostgreSQL ---");
		Database postgres = new PostgresDatabase();
		OrderService pgService = new OrderService(postgres);
		pgService.placeOrder("ORD-001", "{ item: 'Widget', qty: 3 }");
		String order2 = pgService.getOrder("ORD-001");
		System.out.println("Order: " + order2);

	}

}
