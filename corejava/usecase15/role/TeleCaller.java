package corejava.usecase15.role;

public class TeleCaller implements Employee {

	private final Employee supervisor;
	private final long empID;
	private final String name;
	private volatile boolean busy;
	
	public TeleCaller(Employee supervisor, long empID, String name) {
		super();
		this.supervisor = supervisor;
		this.empID = empID;
		this.name = name;
		this.setBusy(false);
	}

	public long getEmpID() {
		return empID;
	}

	public String getName() {
		return name;
	}

	public Employee getSupervisor() {
		return supervisor;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (empID ^ (empID >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeleCaller other = (TeleCaller) obj;
		if (empID != other.empID)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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
