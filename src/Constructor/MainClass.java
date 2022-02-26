package Constructor;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		BanquetHall banquet = new BanquetHall(0.05, 0.05, 0.10);
		System.out.println("Welcome to our Banquet Hall");
		System.out.println("Please note our basic requirements to book hall");
		System.out.println("1- BaseCost needs to be atleast 100$");
		System.out.println("2-Food and beverages needs to be included in package , but tip is optional");
		System.out.println("3_ tax on food and beverages will applied in addition to total Tax");
		System.out.println("4-Guest Capacity=10 to 400 people");
		System.out.println("Based on your requirements please enter following;");
		System.out.println("Please enter Base Cost");
		banquet.setBaseCost(sc.nextDouble());

		if (banquet.getBaseCost() >= 100) {//checking condition for BaseCost
			System.out.println("Please Enter cost for food");
			banquet.setFoodCost(sc.nextDouble());

			if (banquet.getFoodCost() > 0.0) {//condition for food cost
				System.out.println("Please enter cost for beverages");
				banquet.setBeverageCost(sc.nextDouble());

				if (banquet.getBeverageCost() > 0.0) {//condition for tip
					System.out.println("Please Enter tip amount");
					banquet.tip = sc.nextDouble();
					System.out.println(" Please Enter total number of guest");
					int noOfGuest = sc.nextInt();

					if (noOfGuest >= 10 && noOfGuest <= 400) {//condition for guest

						double totalBaseCost = banquet.calculateBaseCost(banquet.getBaseCost(), banquet.getFoodCost(),
								banquet.getBeverageCost());
						double theTotalCost = banquet.calculateTheTotalCost(totalBaseCost,
								banquet.getTotalTaxApplied(totalBaseCost), banquet.getCess(noOfGuest, totalBaseCost),
								noOfGuest);
						banquet.printInvoice(noOfGuest, totalBaseCost); //calling  method to print the detailed Invoice
						System.out.println("               Invoice Amount :  $" + theTotalCost);
						
					} else {
						System.out.println("Invalid entry for guest");
					}
				} else {
					System.out.println("Invalid entry for beverages");
				}
			} else {
				System.out.println("Invalid entry for food");
			}
		} else {
			System.out.println("Invalid entry for Base Cost");
		}
	}

}
