package lab7;

import java.util.Scanner;
import java.math.*;
public class DisplayDetails {
	Person person = new Person();
	public Person displayDetails(String fname,String lname,char gender){
		/*System.out.println("First Name : "+fname);
		System.out.println("Last  Name : "+lname);
		System.out.println("Gender : "+gender);
		System.out.println("PhoneNo. "+phoneno);*/
		person.setFirstName(fname);
		person.setLastName(lname);
		person.setGender(gender);
		return person;
	}
}


