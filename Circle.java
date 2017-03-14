
public class Circle {
	
		
	  private final double pi=3.14;
	  private double radius;
	  
	  
	  public void setRadius(double r)
	  {
		  radius=r;
		 // pi=2.1;
	  }
	  public double Area()
	  {
		  return pi*radius*radius;
	  }
	  public static void main(String args[])
	  {
		  
		  Circle fi=new Circle();
		  //fi.SetPi(3.14);
		  fi.setRadius(4);
		  System.out.println("Area of the Circle:"+fi.Area());
	  }

	}



