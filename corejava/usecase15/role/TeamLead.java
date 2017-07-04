package corejava.usecase15.role;

import java.util.Set;

public class TeamLead implements Employee{
	
	private final Employee supervisor;
	private final long empID;
	private final String name;
	private final Set<Employee> teleCallers;
	private volatile boolean busy;
	
	public TeamLead(Employee supervisor, long empID, String name,
			Set<Employee> teleCallers) {
		super();
		this.supervisor = supervisor;
		this.empID = empID;
		this.name = name;
		this.teleCallers = teleCallers;
		this.setBusy(false);
	}

	public Employee getSupervisor() {
		return supervisor;
	}

	public long getEmpID() {
		return empID;
	}

	public String getName() {
		return name;
	}

	public Set<Employee> getTeleCallers() {
		return teleCallers;
	}

	public boolean isBusy() {
		return busy;
	}

	public void setBusy(boolean busy) {
		this.busy = busy;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
