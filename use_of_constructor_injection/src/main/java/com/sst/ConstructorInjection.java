package com.sst;

import java.util.Date;

public class ConstructorInjection {
	public Date date;
	
	public ConstructorInjection(Date dat){ //This variable name should be same is xml file <Constructor-arg name>
		System.out.println("Constructor execution");
		this.date = dat;
	}
	
	public void getCustomCurrentTime() {
		System.out.println("Current Time: "+date.getHours()+":"+date.getMinutes());
	}
}
