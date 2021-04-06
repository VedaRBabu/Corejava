package com.cg.eis.exception;

import com.cg.eis.bean.Employee;
import com.cg.eis.pl.EmployeeServiceImpl;
public class CheckException1 {
	public void checkSalary() throws EmployeeException1{
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		Employee emp1 = emp.getEmpDetails();
		if(emp1.salary<3000){
			//EmployeeException e = new EmployeeException(emp1.salary);
			//e.catchEmployeeException();
			double salary = emp1.salary;
				throw new EmployeeException1("Salary less than 3000 :"+salary);
			
		}
		else{	
			String scheme = emp.insuranceScheme(emp1.designation, emp1.salary);
			Employee person = new Employee(emp1.id,emp1.name,emp1.designation,scheme,emp1.salary);
			emp.EmpDetails(person);
		}
		}
	}



