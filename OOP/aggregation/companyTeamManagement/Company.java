package aggregation.companyTeamManagement;

import java.util.ArrayList;
import java.util.List;

public class Company {

	private String name;
	private List<Team> teams;
	private List<Employee> employees;

	public Company(String name) {
		this.name = name;
		this.teams = new ArrayList<>();
		this.employees = new ArrayList<>();
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void addTeam(Team team) {
		teams.add(team);
	}

	public void dissolveTeam(Team team) {
		teams.remove(team);
		team.dissolve();
	}

	public int getTeamCount() {
		return teams.size();
	}

	public int getEmployeeCount() {
		return employees.size();
	}
}
