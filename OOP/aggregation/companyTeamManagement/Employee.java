package aggregation.companyTeamManagement;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private String role;
	private List<Team> teams;

	public Employee(String name, String role) {
		this.name = name;
		this.role = role;
		this.teams = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public void assignTeam(Team team) {
		if (!teams.contains(team)) {
			teams.add(team);
		}
	}

	public void removeTeam(Team team) {
		teams.remove(team);
	}

	public List<String> getTeamNames() {
		return teams.stream().map(Team::getName).toList();
	}
}
