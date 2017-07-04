package corejava.usecase15.team;

import java.util.HashSet;
import java.util.Set;

import corejava.usecase15.role.Employee;

public class TeamBuilder {
	
	private Employee manager;
	private Employee techLead;
	private Set<Employee> teleCallers;
	
	public TeamBuilder() {
		super();
		setTeleCallers(new HashSet<Employee>());
	}

	public TeamBuilder setManager(Employee manager) {
		this.manager = manager;
		return this;
	}

	public TeamBuilder setTechLead(Employee techLead) {
		this.techLead = techLead;
		return this;
	}

	public TeamBuilder setTeleCallers(Set<Employee> teleCallers) {
		this.teleCallers = teleCallers;
		return this;
	}
	
	public TeamBuilder addTeleCaller(Employee employee) {
		this.teleCallers.add(employee);
		return this;
	}
	
	public Team build() {
		return new Team(manager, techLead, teleCallers);
	}
	

}
