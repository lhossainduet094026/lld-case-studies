Refactor OrderService

Problem: An OrderService directly creates and uses a MySQLDatabase object to save orders. 
If you want to switch to PostgreSQL or MongoDB, you would have to rewrite OrderService.
 Refactor by introducing a Database interface so OrderService depends on the abstraction, 
 not the concrete database. Then add a PostgresDatabase implementation and show both databases working with the same OrderService.

Requirements:

Create a Database interface with insert(table, data) and query(table, id) methods
Make MySQLDatabase implement the Database interface
Create a PostgresDatabase implementation that prints "PostgreSQL: ..." instead of "MySQL: ..."
Refactor OrderService to accept a Database through its constructor instead of creating one internally
Show OrderService working with both databases without changing OrderService

// Before: OrderService is tightly coupled to MySQLDatabase
class MySQLDatabase {
    public void insert(String table, String data) {
        System.out.println("MySQL: Inserting into " + table + " -> " + data);
    }

    public String query(String table, String id) {
        System.out.println("MySQL: Querying " + table + " for id " + id);
        return "{ id: " + id + ", item: 'Widget' }";
    }
}

class OrderService {
    private MySQLDatabase database;

    public OrderService() {
        this.database = new MySQLDatabase(); // Direct dependency!
    }

    public void placeOrder(String orderId, String orderData) {
        System.out.println("Placing order: " + orderId);
        database.insert("orders", orderData);
        System.out.println("Order placed successfully.");
    }

    public String getOrder(String orderId) {
        return database.query("orders", orderId);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        OrderService service = new OrderService();
        service.placeOrder("ORD-001", "{ item: 'Widget', qty: 3 }");
        String order = service.getOrder("ORD-001");
        System.out.println("Order: " + order);
    }
}

// TODO: Create a Database interface with insert() and query() methods.
// TODO: Make MySQLDatabase implement the interface.
// TODO: Create a PostgresDatabase that prints "PostgreSQL: ..." instead of "MySQL: ...".
// TODO: Refactor OrderService to accept a Database via its constructor.