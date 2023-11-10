package project.entity;

import java.math.BigDecimal;

import provided.entity.EntityBase;

public class Material extends EntityBase {
	private Integer materialId;
	private Integer  projectId;
	private String materialName;
	private BigDecimal cost;
	
	
	public Integer getNumRequired() {
		return numRequired;
	}
	public void setNumRequired(Integer numRequired) {
		this.numRequired = numRequired;
	}

	private Integer numRequired;
	
	public Integer getMaterialId() {
		return materialId;
	}
	public void setMaterialId(Integer materialId) {
		this.materialId = materialId;
	}
	
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("ID = ").append(materialId).append(": ");
		b.append("Material Name = ").append(materialName).append(": ");
		b.append("Cost = ").append(cost).append(": ");
		b.append("Num Required = ").append(numRequired).append(": ");
		
		return b.toString();
	}
	

}
