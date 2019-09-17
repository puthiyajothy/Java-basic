package com.java.defect;

public class Defectmain {

	public static void main(String[] args) {
		
		Defect defect1 = new Defect(1,"defect",Defectseverity.HIGH,Defectpriority.HIGH);
		Defect defect2 = new Defect(2,"defect dfg",Defectseverity.HIGH,Defectpriority.HIGH);
		
		Project project=new Project(1,"defect tracker");
		
		project.addDefects(defect1);
		project.addDefects(defect2);
//		
		
		System.out.println(project);
	
		
	

	}

}
