package aggregation.companyTeamManagement;

import java.util.ArrayList;
import java.util.List;

public class Team {

	private String name;
	private List<Employee> employees;

	public Team(String name) {
		this.name = name;
		employees = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void addMember(Employee employee) {
		if (!employees.contains(employee)) {
			employees.add(employee);
			employee.assignTeam(this);
		}
	}

	public int getMemberCount() {
		return employees.size();
	}

	public void dissolve() {

		employees.forEach(employee -> {
			employee.removeTeam(this);
		});

		employees.clear();
	}
}
