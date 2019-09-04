
public class SBI extends Bank {
	
	public SBI(String cust_name,int acc_no,double acc_bal)
	{
		this.cust_name=cust_name;
		this.acc_no=acc_no;
		this.acc_bal=acc_bal;
	}
	public void rateOfInterest()
	{
		 roi=acc_bal*13.5;
	}

}
