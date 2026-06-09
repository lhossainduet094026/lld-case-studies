package dip.refactorOrderService;

public interface Database {
	
	void insert(String table, String data);

	String query(String table, String id);
}
