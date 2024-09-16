package Snorlax054;
public class Bank {
	private String owner;
	private int balance;
	private int minbalance;
	public Bank(String owner, int balance, int minbalance)
	{
		this.owner = owner;
		this.balance = balance;
		this.minbalance = minbalance;
	}
	public int getBalance() 
	{
		return balance;
	}
	public int getMinbalance() 
	{
		return minbalance;
	}
	public String getOwner() 
	{
		return owner;
	}
	public void setBalance(int balance)
	{
		int x = balance;
		if(x>this.minbalance)
		{
			this.balance = balance;
		}
	}
	public void setMinbalance(int minbalance) 
	{
		this.minbalance = minbalance;
	}
	public void setOwner(String owner) 
	{
		this.owner = owner;
	}	
	public boolean withdraw(int balance)
	{
		if(this.balance-balance>=minbalance)
		{
			this.balance-=balance;
			return true;
		}
		else
		{
			System.out.println("Not enough money");
			return false;
		}
	}
	public void deposit(int balance)
	{
		this.balance+=balance;
	}
	public void transfer(Bank x, int a)
	{
		boolean flag = this.withdraw(a);
		if(flag==true)
		{
			x.deposit(a);
		}
		else
		{
			System.out.println("Transfer failed");
		}
	}
	public String toString()
	{
		String x = "Balance of "+this.owner+": "+this.balance;
		return x;
	}
	
}