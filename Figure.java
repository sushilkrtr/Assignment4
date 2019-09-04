
public abstract class Figure {

	double dim1;
	double dim2;
	double are;	
	public abstract void area(double b,double h);
	
	public static void main(String[] args) {
		Figure f,f1;
		Rectangle rt=new Rectangle();
		f=rt;
		f.area(45,43);
		Triangle tg=new Triangle();
		f1=tg;
		f1.area(23,12);
	}
	
	
}
