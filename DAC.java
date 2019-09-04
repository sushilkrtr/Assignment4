
public class DAC implements module {
	
	String course_name;
	double no_of_stu;
	double no_of_stu_placed;
	public DAC(String cn,double ns,double np)
	{
		this.course_name=cn;
		this.no_of_stu=ns;
		this.no_of_stu_placed=np;
		
	}
	public void placementPercentage()
	{
	
		double pp=(no_of_stu_placed/no_of_stu)*100;
		System.out.println("Placement percentage of Course:"+course_name+"is "+pp);
	}
}
