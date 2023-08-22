package atm_app;
import java.util.*;

class ATM
{
	double balance;
	double amount;		//member variables
	int PIN=1998;
	
	public void checkpin()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your PIN: ");
		int entered_pin = sc.nextInt();
		String name = "Saptanil";
		if(entered_pin == PIN)
		{
			System.out.println("Congratulations!! "+name+" welcome to ATM Transaction");
			menu();
		}
		else
		{
			System.out.println("Please enter correct pin");
			//menu();
		}
		sc.close();
	}
	public void menu()
	{
		
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit Amount");
		System.out.println("3.Withdraw amnount");
		System.out.println("4.Exit");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your choice: ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1: checkBalance();
					break;
					
			case 2: depositamt();
					break;
			case 3: withdrawamt();
					break;
			case 4: String name="Saptanil";
					System.out.println("Thanks "+name+" for using our ATM BYE!!");
					break;
			default: System.out.println("Please enter correct choice");	
					 break;
		}
		sc.close();		
	}
	public void checkBalance()
	{
		System.out.println("Balance is: "+balance);
		menu();
	}
	public void depositamt()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to be deposited: ");
		double amount = sc.nextDouble();
		balance = balance + amount;
		System.out.println("Amount deposited successfully");
		menu();
		sc.close();
	}
	public void withdrawamt()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn: ");
		double amount=sc.nextDouble();
		if(balance<amount)
		{
			System.out.println("Insufficient money");
			menu();
		}
		else
		{
			balance = balance-amount;
			System.out.println("Amount withdrawm successfully");
			menu();
		}
		sc.close();
		
	}
	
}
public class atm_iransaction {
	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.checkpin();

	}

}
