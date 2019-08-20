package com.java.defect;

public class Defect {
	
	private int dId;
	private String disc;
	private Defectseverity defectseverity;
	private Defectpriority defectpriority;
	
	
	public Defect(int dId, String disc, Defectseverity defectseverity, Defectpriority defectpriority) {
		super();
		this.dId = dId;
		this.disc = disc;
		this.defectseverity = defectseverity;
		this.defectpriority = defectpriority;
	}

	public Defect() {
		super();
	}

	

	@Override
	public String toString() {
		return "Defect [dId=" + dId + ", disc=" + disc + ", defectseverity=" + defectseverity + ", defectpriority="
				+ defectpriority + "]";
	}
	

	
	
	
	

}
