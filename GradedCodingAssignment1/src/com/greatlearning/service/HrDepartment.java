package com.greatlearning.service;

public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		String s = "Hr Department";
		return s;

	}

	public String getTodaysWork() {
		String s1 = "Fill today's timesheet and mark your attendence";
		return s1;

	}

	public String getWorkDeadline() {
		String s2 = "Complete by EOD";
		return s2;

	}

	public String doActivity() {
		String s3 = "Team Lunch";
		return s3;
	}

}
