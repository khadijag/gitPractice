package project2Coding;

public class Car {
    /*
    Create a Class Car that would have the following
    fields:   carPrice   and   color   and   method
    calculateSalePrice() which should be returning a price
    of the car.
    Create 2 sub classes: Sedan and Truck. The Truck
    class   has   field   as   weight   and   has   its   own
    implementation   of   calculateSalePrice()   method   in
    which   returned   price   calculated   as   following:   if
    weight>2000 then returned price car should include
    10% discount, otherwise 20% discount.
    The Sedan class has field as length and also does it
    is   own   implementation   of   calculateSalePrice():   if
    length of sedan is >20 feet then returned car price
    should include 5% discount, otherwise 10% discount
     */
	double carPrice;
	String color;
	double calculateSalePrice(){
	return carPrice;
}
}
    class Sedan extends Car{
    	double weight;
    	double carPrice;
    
   
    double calculateSalePrice() {
    	if(weight>2000) {
    		double total=carPrice-(carPrice * 0.10);
    		return total;
    	}else {
    		double total = carPrice-(carPrice * 0.20);
    		return total;
    	}
     }
    }
     class Truck extends Car{
    	 double length;
    	 double carPrice;
    	 public Truck (double length, double carPrice) {
    		 this.length=length;
    		 this.carPrice=carPrice;
    	 }
    	 double calculateSalePrice() {
    		 if(length>20) {
    			 double total=carPrice-(carPrice * 0.05);
    			 return total;
    		 }else {
    			 double total= carPrice-(carPrice * 0.10);
    			 return total;
    		 }
    	 }
     }
     class CarTester{
    	 public static void main(String[] args) {
			Sedan sedan= new Sedan();
			System.out.println("The price of this sedan will be "+sedan.calculateSalePrice());
			Truck truck= new Truck(8800,67000);
			System.out.println("The price of this truck will be "+truck.calculateSalePrice());
		}
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
