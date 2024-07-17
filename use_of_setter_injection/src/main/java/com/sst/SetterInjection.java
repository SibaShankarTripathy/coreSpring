package com.sst;

import java.util.Date;

public class SetterInjection {
	public Date date;//Instead of date class we can use other class also.

	/* Setter method to set value */
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void getCurrentTime() {
		System.out.println("Hour: "+date.getHours()+" Min: "+date.getMinutes());
	}
}
