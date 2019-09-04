
public class Author {

	String name;
	String email;
	char gender;
	
	public Author()
	{}
	// boolean isMale
	public Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;		
	}
	
	public String getName()
	{
		return this.name=name;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	public char getGender()
	{
		return this.gender;
	}
	public void setEmail(String email)
	{
	   this.email=email;
	}
	public String toString()
	{
		return "Author[Name is :"+name+" and gender is "+gender+" at email"+email+"]";
	}
	
	public static void main(String[] args) {
		Author at=new Author("Sushil","sushilkrtr@gmail.com",'M');
//		at.setEmail("ssstt007@gmail.com");
//		String str=at.getName();
//        System.out.println(str);
        
	}
	
}
