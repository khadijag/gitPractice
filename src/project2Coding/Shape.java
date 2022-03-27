package project2Coding;

public interface Shape {
    /*
1.	Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code
     */
      void calculateArea();
      void calculatePerimiter();
    }
  class Circle implements Shape{


	public void calculateArea(double input) {
		double area=Math.PI * Math.pow(input,2);
		System.out.println("Area of the Circle = "+area);
	}

	
	public void calculatePerimiter(double input) {
		
		System.out.println("Perimiter of Circle = "+Math.PI * 2 * input);
	}


	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void calculatePerimiter() {
		// TODO Auto-generated method stub
		
	}
	  
  }
  class Square implements Shape{
	 void test() {
		 
	 }
	
	public void calculateArea(double input) {
		double perimiter=4*input;
		System.out.println("Area of Square = "+perimiter);
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculatePerimiter() {
		// TODO Auto-generated method stub
		
	}
	
  }
  class ShapeTester{
	  public static void main(String[] args) {
		Shape object=new Square();
		object.calculateArea();
		object.calculatePerimiter();
	  }
  }
       
	
  
		
	


