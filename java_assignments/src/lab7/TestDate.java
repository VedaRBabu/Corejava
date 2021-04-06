package lab7;


import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;
public class TestDate {
	JunitDate date = new JunitDate(16,11,1993);
	String date1 = "16/11/1993";
	@Test
	public void test() {
		assertEquals(16,date.getIntDay());
	}
	@Test
	public void test1(){
		assertEquals(11,date.getIntMonth());
	}
	@Test
	public void test2(){
		assertEquals(1993,date.getIntYear());
	}
	/*@Test
	public void test3() {
		assertEquals(01,date.getIntDay());
	}
	@Test
	public void test4(){
		assertEquals(04,date.getIntMonth());
	}
	@Test
	public void test5(){
		assertEquals(2016,date.getIntYear());
	}*/
	@Test
	public void test6(){
		Assert.assertEquals(date1,date.toString());
	}
	
}


