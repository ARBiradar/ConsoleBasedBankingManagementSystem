package com.adarsh.CustomException;

class InsufficientFundsException extends Exception
{
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException() {
		super();
	}
	public InsufficientFundsException(String errorMessage) {
		super(errorMessage);
	}
	
}

class InvalidAmountException extends Exception
{
	private static final long serialVersionUID = 1L;

	public InvalidAmountException() {
		super();
	}
	public InvalidAmountException(String errorMessage) {
		super(errorMessage);
	}
}


class AccountNotFoundException extends Exception
{
	private static final long serialVersionUID = 1L;

	public AccountNotFoundException() {
		super();
	}
	public AccountNotFoundException(String errorMessage) {
		super(errorMessage);
	}
}


class LoanNotAllowedException extends Exception
{
	private static final long serialVersionUID = 1L;

	public LoanNotAllowedException() {
		super();
	}
	public LoanNotAllowedException(String errorMessage) {
		super(errorMessage);
	}
}


interface Bank
{
	public void deposit(double amount) throws InvalidAmountException ;
	public void withdraw(double amount) throws InvalidAmountException;
	public void transfer(BankAccount toAccount, double amount)throws InsufficientFundsException, InvalidAmountException, AccountNotFoundException ;
	
	public void applyForLoan (double amount)throws LoanNotAllowedException,InvalidAmountException ;
}

class BankAccount implements Bank
{
	
	private long accountNumber;
	
	private double balance;
	
	
	

	public BankAccount(long accountNumber, double balance) 
	{
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	
	public long getAccountNumber() {
		return this.accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getBalance() {
		return this.balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public void deposit(double amount) throws InvalidAmountException 
	{
		if(amount <= 0)
		{
			throw new InvalidAmountException("Amount is invalid it must be more then 0");
		}
		else {
			
		
			this.balance = this.balance+amount;
			
			IO.println("Deposit successful. New balance: "+this.balance);
		}
	}

	@Override
	public void withdraw(double amount) throws InvalidAmountException
	{
		
		if(amount > this.balance)
		{
			throw new InvalidAmountException ("Insufficient Balance Check the balance");
		}
		else
		{
			this.balance = this.balance - amount;
			IO.println("Withdraw successful. New balance: "+this.balance);
		}
		
		
	}

	@Override
	
	public void transfer(BankAccount toAccount, double amount)
	        throws InsufficientFundsException,
	               InvalidAmountException,
	               AccountNotFoundException {

	    
	    if (toAccount == null) {
	        throw new AccountNotFoundException(
	            "Account is not found. Please check again."
	        );
	    }

	    
	    if (amount <= 0) {
	        throw new InvalidAmountException(
	            "Amount must be greater than zero."
	        );
	    }

	   
	    if (this.balance < amount) {
	        throw new InsufficientFundsException(
	            "Insufficient funds for transferring the amount."
	        );
	    }

	    this.balance -= amount;

	    
	    toAccount.setBalance(toAccount.getBalance() + amount);

	    
	    IO.println("Deposit successful. New balance: "
	            + toAccount.getBalance());

	    IO.println("Transfer successful.");
	}



	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException,InvalidAmountException 
	{
		if(amount <= 0 )
		{
			throw new InvalidAmountException("Amount must me grater then 0");
		}
		else if(this.balance < amount || amount > 50000)
		{
			
			throw new LoanNotAllowedException("Loan criteria is not matching");
		}
		else
		{
			this.balance += amount;
			IO.println("Loan approved. New balance: "+this.balance);
		}
		
	}
	
}


class Customer 
{
	private String customerName;
	private BankAccount account;
	
	
	public String getCustomerName() {
		return customerName;
	}
	public BankAccount getAccount() {
		return account;
	}
	
	
	public Customer(String customerName, BankAccount account) {
		super();
		this.customerName = customerName;
		this.account = account;
	}
	
	
}


public class ATM
{

	public static void main(String[] args)
	{
		
        BankAccount acc1 = new BankAccount(1111, 60000); 
        BankAccount acc2 = new BankAccount(2222, 3000);
        Customer customer1 = new Customer("Alice", acc1);
		Customer customer2 = new Customer("Bob", acc2);
		
		IO.println(" \r\n"
				+ "      Select an option :\r\n"
				+ "           1. Deposit\r\n"
				+ "           2. Withdraw\r\n"
				+ "           3. Transfer\r\n"
				+ "           4. Loan Application\r\n"
				+ "           5. Check Balance\r\n"
				+ "           6. Exit");
		int choice = Integer.parseInt(IO.readln("Enter Choice"));
		
		
		try
		{
			switch(choice)
			{
				case 1 -> 
				{
					String customerName = IO.readln("Enter Customer Name : ");
					double amount = Double.valueOf(IO.readln("Enter amount to Deposit : "));
					if(customerName.equalsIgnoreCase(customer1.getCustomerName()))
					{
						customer1.getAccount().deposit(amount);
					}
					else if(customerName.equalsIgnoreCase(customer2.getCustomerName()))
					{
						customer2.getAccount().deposit(amount);
					}
					else
					{
						IO.println("Customer Not Found");
					}
					
				}
				case 2 -> 
				{
					String customerName = IO.readln("Enter Customer Name : ");
					double amount = Double.valueOf(IO.readln("Enter amount to withdraw : "));
					if(customerName.equalsIgnoreCase(customer1.getCustomerName()))
					{
						customer1.getAccount().withdraw(amount);
					}
					else if(customerName.equalsIgnoreCase(customer2.getCustomerName()))
					{
						customer2.getAccount().withdraw(amount);
					}
					else
					{
						IO.println("Customer Not Found");
					}			
				}
				case 3 ->
				{
					String customerName = IO.readln("Enter Customer Name : ");
					double amount = Double.valueOf(IO.readln("Enter amount to transfer : "));
					if(customerName.equalsIgnoreCase(customer2.getCustomerName()))
					{
						customer2.getAccount().transfer(customer1.getAccount(),amount);
					}
					else if(customerName.equalsIgnoreCase(customer1.getCustomerName()))
					{
						customer1.getAccount().transfer(customer2.getAccount(),amount);
					}
					else
					{
						IO.println("Customer Not Found");
					}	
					
				}
				case 4 -> 
				{
					String customerName = IO.readln("Enter Customer Name : ");
					double amount = Double.valueOf(IO.readln("Enter amount to apply : "));
					if(customerName.equalsIgnoreCase(customer1.getCustomerName()))
					{
						customer1.getAccount().applyForLoan(amount);
					}
					else if(customerName.equalsIgnoreCase(customer2.getCustomerName()))
					{
						customer2.getAccount().applyForLoan(amount);
					}
					else
					{
						IO.println("Customer Not Found");
					}	
					
				}
				case 5 -> 
				{
					String customerName = IO.readln("Enter Customer Name : ");
					if(customerName.equalsIgnoreCase(customer1.getCustomerName()))
					{
						IO.println("Currant Balance:"+customer1.getAccount().getBalance());
					}
					else if(customerName.equalsIgnoreCase(customer2.getCustomerName()))
					{
						IO.println("Currant Balance:"+customer2.getAccount().getBalance());
					}
					else
					{
						IO.println("Customer Not Found");
					}	
					
				}
				case 6 -> 
				{
					IO.println("Thank you for using the ATM. Goodbye!");
					System.exit(0);
				}
				default  -> 
				{
					IO.println("Choose the correct Option");
				}
			
			}
			
		}
		catch(LoanNotAllowedException e)
		{
			IO.println(e.getMessage());
		}
		catch(AccountNotFoundException e)
		{
			IO.println(e.getMessage());
		}
		catch(InsufficientFundsException e)
		{
			IO.println(e.getMessage());
		}
		catch(InvalidAmountException e)
		{
			IO.println(e.getMessage());
		}
		catch(Exception e)
		{
			IO.println(e.getMessage());
		}
		
		
	}

	
}
