package project.entity;

import java.math.BigDecimal;
//import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Project {
	private Integer projectId;
	private String  projectName;
	private BigDecimal estimatedHours;
	private BigDecimal actualHours;
	private Integer difficulty;
	private String notes;
//	private LocalDateTime createdAt;
	
	@Override
	public String toString() {
		
		String project = "";
		
		project += "\n   ID = " + projectId;
		project += "\n   Porject Name = " + projectName;
		project += "\n   estimatedHours= " + estimatedHours;
		project += "\n   actualHours = " + actualHours;
		project += "\n   difficulty = " + difficulty;
		project += "\n   notes = " + notes;
		//project += "\n   createdAt = " + createdAt;
		
		
		project += "\n   Materials: ";
		 for (Material material : materials ) {
			 project += "\n     "+ material;
		 }
		project += "\n   Steps: ";
		for (Step step : steps ) {
			 project += "\n     "+ step;
		 }
		project += "\n   Categories: ";
		for (Category category : Categories ) {
			 project += "\n     "+ category;
		 }
		
		return project;
				
	}

	private List<Material> materials = new LinkedList<>();
	private List<Step> steps = new LinkedList<>();
	private List<Category> Categories = new LinkedList<>();
	
	
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public BigDecimal getEstimatedHours() {
		return estimatedHours;
	}
	public void setEstimatedHours(BigDecimal estimated_hours) {
		this.estimatedHours = estimated_hours;
	}
	public BigDecimal getActualHours() {
		return actualHours;
	}
	public void setActualHours(BigDecimal actual_hours) {
		this.actualHours = actual_hours;
	}
	public Integer getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
//	public LocalDateTime getCreatedAt() {
//		return createdAt;
//	}
//	public void setCreatedAt(LocalDateTime createdAt) {
//		this.createdAt = createdAt;
//	}
	public List<Material> getMaterials() {
		return materials;
	}
	
	public List<Step> getSteps() {
		return steps;
	}
	
	public List<Category> getCategories() {
		return Categories;
	}
	
	
	
}



