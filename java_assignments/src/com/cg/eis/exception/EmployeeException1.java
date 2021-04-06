package com.cg.eis.exception;

public class EmployeeException1 {
	double salary;
	
	public void EmployeeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public void EmployeeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	/*public EmployeeException(double salary){
		this.salary = salary;
	}
	public void catchEmployeeException(){
	try{
		throw new EmployeeException("Salary less than 3000 :"+salary);
	}
	catch(EmployeeException e){
		System.out.println(e.getMessage());
	}
	
	}*/
}



