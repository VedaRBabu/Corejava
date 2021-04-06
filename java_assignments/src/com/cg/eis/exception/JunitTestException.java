package com.cg.eis.exception;

import com.cg.eis.bean.Employee;
import com.cg.eis.pl.EmployeeServiceImpl;

public class JunitTestException {

		//EmployeeServiceImpl emp = new EmployeeServiceImpl();
		//Employee emp1 = emp.getEmpDetails();
		CheckException check = new CheckException();
		@Test(expected = EmployeeException.class)
		public void CheckException() throws EmployeeException{
				check.checkSalary();
			
		}
		
		
	}
