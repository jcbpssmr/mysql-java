package project.entity;

public class Steps {
	private Integer stepId;
	private Integer projectId;
	private Integer stepOrder;
	private String stepText;
	
	
	public Integer getStepId() {
		return stepId;
	}
	public void setStepId(Integer stepId) {
		this.stepId = stepId;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public Integer getStepOrder() {
		return stepOrder;
	}
	public void setStepOrder(Integer stepOrder) {
		this.stepOrder = stepOrder;
	}
	public String getStepText() {
		return stepText;
	}
	public void setStepText(String stepText) {
		this.stepText = stepText;
	}
	
	@Override
	public String toString() {
		return "Steps [stepId=" + stepId + ", projectId=" + projectId + ", stepOrder=" + stepOrder + ", stepText="
				+ stepText + "]";
	}

}
