package atm;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.io.IOException;
import java.text.DecimalFormat;

public class user extends account
{
	Scanner sc=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("$ ###,##0.00");
	
	Map<Integer,Integer> creds=new HashMap<>();
	
	public void login() throws IOException
	{
		int attempts=1;
		while(attempts<=3)
		{
			try 
			{
				creds.put(699613, 1207);
				creds.put(100201, 2081);
				
				System.out.println("Welcome to Bank of Delhi!");
				System.out.print("Please enter your 6 digit account number : ");
				setAccountNum(sc.nextInt());
				System.out.print("Please enter your 4 digit PIN number : ");
				setPinNum(sc.nextInt());
				
				Set<Integer> keys=creds.keySet();
				for(Integer k : keys)
				{
					if(getPinNum()==creds.get(k))
					{
						mainDisplay();
					}
				}
				
			}catch (Exception e)
			{
				System.out.println("Invalid Account Credentials");
				attempts+=1;
			}
		}
	}
	
	public String accountType()
	{
		System.out.println("Choose account type :-");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		
		int choice=sc.nextInt();
		if(choice==1)
			return "Savings";
		else
			return "Current";
		
	}
	
	public void mainDisplay()
	{
		System.out.println("Main Menu");
		System.out.println("1.Check Balance");
		System.out.println("2.Withdraw Money");
		System.out.println("3.Deposit Money");
		System.out.println("4.Exit");
		
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				{
					String accType=accountType();
					if(accType=="Savings")
						System.out.println("Savings Balance" + moneyFormat.format(getSavingsBalance()));
					else
						System.out.println("Current Balance" + moneyFormat.format(getCurrentBalance()));
				}
				break;
			case 2:
				{
					String accType=accountType();
					if(accType=="Savings")
						withdrawSavings();
					else
						withdrawCurrent();
				}
				break;
			case 3:
				{
					String accType=accountType();
					if(accType=="Savings")
						depositSavings();
					else
						depositCurrent();
				}
				break;
			case 4:
				System.out.println("Thank You!");
				break;
			default:
				System.out.println("Invalid Choice");
				mainDisplay();
		}
		
		
	}

}
