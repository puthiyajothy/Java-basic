package com.java.basic.Adepter;

public class PenAdopter implements Pen{
	PilotPen pp = new PilotPen();
	@Override
	public void write(String str) {
		pp.mark(str);
	}
}
