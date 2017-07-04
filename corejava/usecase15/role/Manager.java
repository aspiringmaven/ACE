package corejava.usecase15.role;

public class Manager implements Employee {

	private final long empID;
	private final String name;
	
	public Manager(long empID, String name) {
		super();
		this.empID = empID;
		this.name = name;
	}

	@Override
	public void run() {
	}

	public long getEmpID() {
		return empID;
	}

	public String getName() {
		return name;
	}
	
	
	
	
	
}
