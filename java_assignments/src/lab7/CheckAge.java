package lab7;


import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
public class CheckAge {
	public void ageCheck(){
		AtomicInteger count = new AtomicInteger(0);
		Scanner in = new Scanner(System.in);
		try {
			Person smith = new Person("Smith",21);
			int age = smith.getAge();
			if(age<15)
				throw new AgeException(smith.getName()+"'s age is less than 15");
			Person kathy = new Person("Kathy",31);
			age = kathy.getAge();
			if(age<15)
				throw new AgeException(kathy.getName()+"'s age is less than 15");
				AccountAbstract smithsavingaccount = new SavingsAccount(count.incrementAndGet(),2000,smith);
				AccountAbstract smithcurrentaccount = new CurrentAccount(count.incrementAndGet(),2000,smith);
				System.out.println(smithsavingaccount);
				System.out.println(smithcurrentaccount);
				System.out.println("For AccountHolder Smith :");
				/*if(choice=="deposit"&&type=="savings"){*/
					System.out.println("Enter amount to deposit in savingsaccount");
					double amount = in.nextDouble();
					smithsavingaccount.deposit(amount);

					System.out.println("Enter amount to withdraw in savings account ");
						amount = in.nextDouble();
						smithsavingaccount.withdraw(amount);
			
						System.out.println("Enter amount to deposit in currentaccount");
						amount = in.nextDouble();
					smithcurrentaccount.deposit(amount);
						
						System.out.println("Enter amount to withdraw in currentaccount");
					  amount = in.nextDouble();
					smithcurrentaccount.withdraw(amount);
					
				
				
				//smithaccount.deposit(2000);
				//kathyaccount.withdraw(2000);
				
				System.out.println("Balance in Smith's Current Account:");
				smithcurrentaccount.getaccountBalance();
				System.out.println("Balance in Smith's Savings Account:");
				smithsavingaccount.getaccountBalance();
				
				AccountAbstract kathysavingaccount = new SavingsAccount(count.incrementAndGet(),3000,kathy);
				AccountAbstract kathycurrentaccount = new CurrentAccount(count.incrementAndGet(),3000,kathy);
				System.out.println(kathysavingaccount);
				System.out.println(kathycurrentaccount);
				//System.out.println(smithaccount);
				//System.out.println(kathyaccount);
				/*System.out.println("Enter type of operation to perform for :Smith");
				String choice = in.next();
				System.out.println("Enter the account type:");
				String type = in.next();*/
				
				
				System.out.println("For AccountHolder Kathy :");
				/*if(choice=="deposit"&&type=="savings"){*/
					System.out.println("Enter amount to deposit in savingsaccount");
					 amount = in.nextDouble();
					kathysavingaccount.deposit(amount);

					System.out.println("Enter amount to withdraw in savings account ");
						amount = in.nextDouble();
						kathysavingaccount.withdraw(amount);
			
						System.out.println("Enter amount to deposit in currentaccount");
						amount = in.nextDouble();
						kathycurrentaccount.deposit(amount);
						
						System.out.println("Enter amount to withdraw in currentaccount");
					  amount = in.nextDouble();
					kathycurrentaccount.withdraw(amount);
				
				//smithaccount.deposit(2000);
				//kathyaccount.withdraw(2000);
				
				System.out.println("Balance in Kathy's Current Account:");
				kathycurrentaccount.getaccountBalance();
				System.out.println("Balance in Kathy's Savings Account:");
				kathysavingaccount.getaccountBalance();
				//System.out.println("Balance in Kathy's Account:");
				//kathyaccount.getBalance();
			
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}


