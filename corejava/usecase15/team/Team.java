package corejava.usecase15.team;

import java.util.Set;

import corejava.usecase15.role.Employee;

public class Team {
	private Employee manager;
	private Employee techLead;
	private Set<Employee> teleCallers;
	
	public Team(Employee manager, Employee techLead, Set<Employee> teleCallers) {
		super();
		this.manager = manager;
		this.techLead = techLead;
		this.teleCallers = teleCallers;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Employee getTechLead() {
		return techLead;
	}

	public void setTechLead(Employee techLead) {
		this.techLead = techLead;
	}

	public Set<Employee> getTeleCallers() {
		return teleCallers;
	}

	public void setTeleCallers(Set<Employee> teleCallers) {
		this.teleCallers = teleCallers;
	}
	
	
	
	
}
