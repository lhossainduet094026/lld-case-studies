package dip.refactorOrderService;

public class MYSQLDatabase implements Database {

	@Override
	public void insert(String table, String data) {
		System.out.println("MySQL: Inserting into " + table + " -> " + data);
	}

	@Override
	public String query(String table, String id) {

		System.out.println("MySQL: Querying " + table + " for id " + id);
		return "{ id: " + id + ", item: 'Widget' }";
	}

}
