public class PatientInformation {
	private String lastName;
	private String dOB;
	private String healthIns;
	private VisitType visitType;
	
	
	public PatientInformation(String lastName, String dOB, VisitType visitType) {
	
		this.lastName = lastName;
		this.dOB = dOB;
		this.visitType = visitType;
	}
	
	
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setDOB(String dOB) {
		this.dOB = dOB;
	}
	
	public void setHealthIns(String healthIns) {
		this.healthIns = healthIns;
	}
	
	public void setvisitType(VisitType visitType) {
		this.visitType = visitType;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getDOB() {
		return dOB;
	}
	
	public String getHealthIns() {
		return healthIns;
	}
	
	public VisitType getVisitType() {
		return visitType;
	}
	
	

}
