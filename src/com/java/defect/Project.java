package com.java.defect;

import java.util.ArrayList;
import java.util.List;

public class Project {

	
	private int pId;
	private String pname;
	
	private List<Defect> defects=new ArrayList<>();

	public void addDefects(Defect defect) {
		defects.add(defect);
	}

	public Project(int pId, String pname) {
		super();
		this.pId = pId;
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pname=" + pname + ", defects=" + defects + "]";
	}
	
	

	
	
	
}
