package com.sst;

import java.util.Date;

public class SetterInjection {
	public Date date;//Instead of date class we can use other class also.

	/* Setter method to set value */
	public void setDate123(Date date) {
		this.date = date;
	}
	
	public void getCurrentTime() {
		System.out.println("Current Time: "+date.getHours()+":"+date.getMinutes());
	}
}
