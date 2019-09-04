
public class Book extends Author {

	String name;
	double price;
	int qty;
	Author aut;
	public Book(String name,String email,char gender,double price,int qty)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;		
		this.price=price;
		this.aut=aut;	
	}
	
	public String getName()
	{
		return this.name;
	}
	public Author getAuthor()
	{
		return this.aut;
	}
	public double getPrice()
	{
		return this.price;
	}
	public int getqty()
	{
		return this.qty;
	}
	public void setqty(int qty)
	{
		this.qty=qty;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public String toString()
	{
		return "Book[Book Name is "+name+"written by "+aut+" of gender "+gender+" at "+email+"and Book Price is "+price+"and quantity is "+qty+"]";
	}
	
	public static void main(String[] args) {
		
		Author att=new Author("Harivansh","ssstt007@gmail.com",'M');
		Author att1=new Author("Hari","sushilkrtr@gmail.com",'F');
		Author att2=new Author("Hariva","anilkumble32@yahoo.com",'G');
		Book bk1=new Book("Hariva","anilkumble32@yahoo.com",'G',340,5);
		String xxx=att.getName();
		System.out.println(xxx);
		System.out.println(att);
		bk1.setPrice(567);
		System.out.println(bk1);
		
	}
}

