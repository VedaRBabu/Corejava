package lab4;

import java.util.concurrent.atomic.AtomicInteger;
public class AccountMain 
{
	public static void main(String[] args) 
	{
		Person smith = new Person("Smith",23);
		Person kathy = new Person("Kathy",31);
		AtomicInteger count = new AtomicInteger(0);
		Account smithaccount = new Account(count.incrementAndGet(),2000,smith);
		Account kathyaccount = new Account(count.incrementAndGet(),3000,kathy);
		
		System.out.println(smithaccount);
		System.out.println(kathyaccount);
		
		smithaccount.deposit(2000);
		kathyaccount.withdraw(2000);
		
		System.out.println("Balance in Smith's Account:");
		smithaccount.getBalance();
		System.out.println("Balance in Kathy's Account:");
		kathyaccount.getBalance();
		
	}

}
