package atm;
import java.util.Scanner;

public class account 
{
	private int accountNum;
	private int pinNum;
	private double currentBalance;
	private double savingsBalance;
	
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public int getPinNum() {
		return pinNum;
	}
	public void setPinNum(int pinNum) {
		this.pinNum = pinNum;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public void updateCurrentBalance(double amount)
	{
		currentBalance+=amount;
	}
	public void updateSavingsBalance(double amount)
	{
		savingsBalance+=amount;
	}
	
	public void withdrawCurrent()
	{
		System.out.println("Current Account :-");
		System.out.print("Enter amount to be withdrawn : ");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextInt()*-1;
		updateCurrentBalance(amount);
	}
	public void depositCurrent()
	{
		System.out.println("Current Account :-");
		System.out.print("Enter amount to be deposited : ");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextInt();
		updateCurrentBalance(amount);
	}
	public void withdrawSavings()
	{
		System.out.println("Savings Account :-");
		System.out.print("Enter amount to be withdrawn : ");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextInt()*-1;
		updateSavingsBalance(amount);
	}
	public void depositSavings()
	{
		System.out.println("Savings Account :-");
		System.out.print("Enter amount to be deposited : ");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextInt();
		updateSavingsBalance(amount);
	}

}
