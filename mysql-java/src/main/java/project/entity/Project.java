package project.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Project {
	private Integer projcetId;
	private String  projectName;
	private BigDecimal estimatedHours;
	private BigDecimal actualHours;
	private Integer difficulty;
	private String notes;
	private LocalDateTime createdAt;
	
	@Override
	public String toString() {
		
		String project = "";
		
		project += "\n   ID = " + projcetId;
		project += "\n   Porject Name = " + projectName;
		project += "\n   estimatedHours= " + estimatedHours;
		project += "\n   actualHours = " + actualHours;
		project += "\n   difficulty = " + difficulty;
		project += "\n   notes = " + notes;
		project += "\n   createdAt = " + createdAt;
		
		
//		project += "\n   Materials = " + createdAt;
//		 for (Materials material : materials ) {
//			 project += "\n     "+ material;
//		 }
//		project += "\n   Steps= " + createdAt;
//		for (Steps step : steps ) {
//			 project += "\n     "+ step;
//		 }
//		project += "\n   Categories = " + createdAt;
//		for (Categories category : Categories ) {
//			 project += "\n     "+ category;
//		 }
		
		return project;
				
	}

//	private List<Materials> materials = new LinkedList<>();
//	private List<Steps> steps = new LinkedList<>();
//	private List<Categories> Categories = new LinkedList<>();
	public Integer getProjcetId() {
		return projcetId;
	}
	public void setProjcetId(Integer projcetId) {
		this.projcetId = projcetId;
	}
	public String getProjcetName() {
		return projectName;
	}
	public void setProjcetName(String projcetName) {
		this.projectName = projcetName;
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
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
//	public List<Materials> getMaterials() {
//		return materials;
//	}
//	
//	public List<Steps> getSteps() {
//		return steps;
//	}
//	
//	public List<Categories> getCategories() {
//		return Categories;
//	}
	
	
	
}



