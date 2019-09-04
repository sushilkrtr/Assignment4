
public class CustomerAccount {
	
	public static void main(String[] args) {
		
		ICICI ic=new ICICI("Sharad",12345,349875.98);
		SBI sb=new SBI("Sushil",123456789,34985.98);
		HDFC hd=new HDFC("Shashank",123,3475.98);
		ic.accountDetails();
		sb.accountDetails();
		hd.accountDetails();
		System.out.println(ic);
		ic.rateOfInterest();
		ic.calculateLoan();
		System.out.println(sb);
		sb.rateOfInterest();
		sb.calculateLoan();
		System.out.println(hd);
		hd.rateOfInterest();
		hd.calculateLoan();
		
	}
}
