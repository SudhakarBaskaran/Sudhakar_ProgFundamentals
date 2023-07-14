package com.gradedproject.q1;

public class AdminDepartment extends SuperDepartment {
	String departmentName() {
		return "Admin Department";
	}

	String getTodaysWork() {
		return "Complete your documents submission";
	}

	String getWorkDeadline() {
		return "Complete by EOD";
	}
}
