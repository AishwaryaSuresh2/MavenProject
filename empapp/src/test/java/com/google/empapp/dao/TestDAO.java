package com.google.empapp.dao;

import com.google.empapp.model.EMPLOYEE;

public class TestDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EMPLOYEE employee=new EMPLOYEE();
employee.setNAME("Aishu");
employee.setDESIGNATION("Manager");

EmployeeDAO dao=new EmployeeDAO();
dao.save(employee);
	}

}
