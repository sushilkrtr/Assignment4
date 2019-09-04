
public class DASS implements module{

	String course_name;
	double no_of_stu;
	double no_of_stu_placed;
	public DASS(String cn,double ns,double np)
	{
		this.course_name=cn;
		this.no_of_stu=ns;
		this.no_of_stu_placed=np;
		
	}
	public void placementPercentage()
	{
		double pp=(no_of_stu/no_of_stu_placed)*100;
		System.out.println("Placement percentage of Course:"+course_name+"is "+pp);
	}
}
