package corejava.usecase15.callcenter;

public class Call {

	private String fromUser;
	private long seconds;

	public Call(String fromUser, long seconds) {
		super();
		this.fromUser = fromUser;
		this.seconds = seconds;
	}
	
	public String getFromUser() {
		return fromUser;
	}
	
	public void setFromUser(String fromUser) {
		this.fromUser = fromUser;
	}
	public long getSeconds() {
		return seconds;
	}
	public void setSeconds(long seconds) {
		this.seconds = seconds;
	}
	
	
	
}
