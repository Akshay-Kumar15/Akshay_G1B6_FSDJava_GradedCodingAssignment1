package com.greatlearning.app;

import com.greatlearning.service.AdminDepartment;
import com.greatlearning.service.HrDepartment;
import com.greatlearning.service.TechDepartment;

public class Driverclass {

	public static void main(String[] args) {
		AdminDepartment ad = new AdminDepartment();
		System.out.println("Welcome to " + ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday() +"\n");
		
		HrDepartment hr = new HrDepartment();
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday() +"\n");
		
		TechDepartment t = new TechDepartment();
		System.out.println("Welcome to " + t.departmentName());
		System.out.println(t.getTodaysWork());
		System.out.println(t.getWorkDeadline());
		System.out.println(t.getTechStackInformation());
		System.out.println(t.isTodayAHoliday());

	}

}
