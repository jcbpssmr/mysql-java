package project.entity;

import java.math.BigDecimal;

import provided.entity.EntityBase;

public class Materials extends EntityBase {
	private Integer materialId;
	private Integer  projcetId;
	private String materialName;
	private Unit numRequired;
	private BigDecimal cost;
	
	public Integer getMaterialId() {
		return materialId;
	}
	public void setMaterialId(Integer materialId) {
		this.materialId = materialId;
	}
	
	public Integer getProjcetId() {
		return projcetId;
	}
	public void setProjcetId(Integer projcetId) {
		this.projcetId = projcetId;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public Unit getNumRequired() {
		return numRequired;
	}
	public void setNumRequired(Unit numRequired) {
		this.numRequired = numRequired;
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
		
		return b.toString();
	}
	

}