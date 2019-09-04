
public abstract class Bank {
	
	String cust_name;
	int acc_no;
	double acc_bal;
	double roi;
	
	public String toString()
	{
		return "CustomerAccount [Customer name is"+cust_name+"|Account No. is "+acc_no+"|Account balance is :"+acc_bal+"]";
	}
	public void accountDetails()
	{
		this.cust_name=cust_name;
		this.acc_no=acc_no;
		this.acc_bal=acc_bal;
	}
	public void calculateLoan()
	{
		if(acc_bal>10000)
		{
			System.out.println("Eligible for loan ");
			double loan_amt=acc_bal*6;
			System.out.println(loan_amt);
		}
		else
		{
			System.out.println("Not eligible for loan");
		}
	}
	public abstract void rateOfInterest();
	

}
