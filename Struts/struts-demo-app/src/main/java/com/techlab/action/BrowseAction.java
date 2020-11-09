package com.techlab.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.opensymphony.xwork2.Action;

public class BrowseAction implements Action {
	private String mssg = "";
	private String date;

	@Override
	public String execute() throws Exception {
		Calendar c = Calendar.getInstance();
		int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

		if (timeOfDay >= 0 && timeOfDay < 12) {
			mssg = "Good Morning";
		} else if (timeOfDay >= 12 && timeOfDay < 16) {
			mssg = "Good Afternoon";
		} else if (timeOfDay >= 16 && timeOfDay < 21) {
			mssg = "Good Evening";
		} else if (timeOfDay >= 21 && timeOfDay < 24) {
			mssg = "Good Night";
		}
		date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

		return "success";
	}

	public String getMssg() {
		return mssg;
	}

	public String getDate() {
		return date;
	}

}
