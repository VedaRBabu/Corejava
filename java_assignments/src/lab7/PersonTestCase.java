package lab7;

import static org.junit.Assert.*;

import org.junit.Test;
public class PersonTestCase {
	Person person = new Person("Soumik","Nath",'M');
	DisplayDetails details = new DisplayDetails();
	@Test
	public void test() {
		Person person1 = details.displayDetails("Sanit","Kundu", 'M');
		assertEquals(person,person1);
		//fail("Not yet implemented");
	}
	@Test
	public void test1(){
		Person person1 = details.displayDetails("Soumik","Nath",'M');
		assertEquals(person,person1);
	}
	Person person1 = new Person("Vicky","Kumar",'M');
	@Test
	public void test2(){
		assertEquals("Sanit",person1.getFirstName());
	}
	@Test
	public void test3(){
		person1.setFirstName("Sanit");
		assertEquals("Sanit",person1.getFirstName());
	}
	@Test
	public void test4(){
		assertEquals("Kundu",person1.getLastName());
	}
	@Test
	public void test5(){
		person1.setLastName("Kundu");
		assertEquals("Kundu",person1.getLastName());
	}
	@Test
	public void test6(){
		assertEquals('M',person1.getGender());
	}
	@Test
	public void test7(){
		person1.setGender('F');;
		assertEquals("Sanit",person1.getGender());
	}
	
}


}
