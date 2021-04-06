package com.cg.eis.exception;


import org.junit.Test;

import com.cg.eis.bean.Employee;
import com.cg.eis.pl.EmployeeServiceImpl;
public class JunitTestException1 {
	//EmployeeServiceImpl emp = new EmployeeServiceImpl();
	//Employee emp1 = emp.getEmpDetails();
	CheckException check = new CheckException();
	@Test(expected = EmployeeException1.class)
	public void CheckException() throws EmployeeException1{
			check.checkSalary();
		
	}
	
	
}


