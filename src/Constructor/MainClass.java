package Constructor;

import java.util.Scanner; 

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner (System.in);

      BanquetHall banquet=new BanquetHall();
	 System.out.println("What's the cost for food"); 
	 double foodCost=sc.nextDouble();
	 
	 System.out.println("What's the cost for beverages");
	 double beveragesCost=sc.nextDouble();
	 
	 System.out.println("How much tip do you want to add");
	 double tip=sc.nextDouble();
	 
	 double TotalBaseCost=banquet.calculateBaseCost(foodCost, beveragesCost, tip);
	 double tax=banquet.calculateTax(TotalBaseCost);
	 
	 System.out.println("Enter no. of guest");
	 int guest=sc.nextInt();
	 
	 double calculateCessTax=banquet.calculateCess(guest, TotalBaseCost);
	 double theTotalCost=banquet.calculateTheTotalCost(TotalBaseCost, TotalBaseCost, calculateCessTax);
	 System.out.println("Total cost for banquet Hall is:" +theTotalCost);
			 
	}

}
