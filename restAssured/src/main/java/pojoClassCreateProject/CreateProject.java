package pojoClassCreateProject;

public class CreateProject {
	//declare the variables globally
	String createdBY;
	String projectName;
	String status;
	int teamSize;
	
	//provide constructors to initialize values
	public CreateProject(String createdBY, String projectName, String status, int teamSize) {
		super();
		this.createdBY = createdBY;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}
	//provide getters and setters

	public String getCreatedBY() {
		return createdBY;
	}

	public void setCreatedBY(String createdBY) {
		this.createdBY = createdBY;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
}
