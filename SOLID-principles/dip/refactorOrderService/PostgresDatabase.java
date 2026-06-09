package dip.refactorOrderService;

public class PostgresDatabase implements Database {

	@Override
	public void insert(String table, String data) {
		System.out.println("Postgres: Inserting into " + table + " -> " + data);
	}

	@Override
	public String query(String table, String id) {
		System.out.println("Postgres: Querying " + table + " for id " + id);
		return "{ id: " + id + ", item: 'Widget' }";
	}

}
