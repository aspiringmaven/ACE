package corejava.usecase15.callcenter;

import corejava.usecase15.team.Team;

public class CallCenter {
	
	private final Team team;

	public CallCenter(Team team) {
		super();
		this.team = team;
	}



	public Team getTeam() {
		return team;
	}
	
	
	
}
