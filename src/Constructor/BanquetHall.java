package Constructor;

public class BanquetHall {
	double baseCost;
	double foodCost;
	double beverageCost;
	double tip;
	double totalTaxApplied;
	double totalCessApplied;

	double foodTax;
	double beverageTax;
	double taxApplied;

	// using Constructor to initialize foodTax,beverageTax,taxApplied
	public BanquetHall(double foodTax, double beverageTax, double taxApplied) {
		this.foodTax = foodTax;
		this.beverageTax = beverageTax;
		this.taxApplied = taxApplied;
	}

	public double getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(double baseCost) {
		this.baseCost = baseCost;
	}

	public double getFoodCost() {
		return foodCost;
	}

	public void setFoodCost(double foodCost) {
		this.foodCost = foodCost;
	}

	public double getBeverageCost() {
		return beverageCost;
	}

	public void setBeverageCost(double beverageCost) {
		this.beverageCost = beverageCost;
	}

	// Calculating total Cost for food, beverages &baseCost including tax applied on
	// them;
	// Using +=operator for addition in String
	double calculateBaseCost(double foodCost, double beveragesCost, double baseCost) {
		this.foodCost += foodCost * foodTax;// cal. foodCost and storing value of food cost & tax applied on class level
											// variable food Cost
		this.beverageCost += tip + (beverageCost * beverageTax); // cal.beverageCost+ tax on beverages +tip and storing
																	// value in class level beverage cost
		double totalBaseCost = baseCost + this.foodCost + this.beverageCost;// cal totalBaseCost by using value we store
																			// in instance level variable of
																			// food&beverage.
		return totalBaseCost;
	}

	// calculate tax as per Alberta
	private double calculateTax(double totalBaseCost) {
		this.totalTaxApplied = totalBaseCost * 0.5; // calculating TaxApplied on BaseCost
		return this.totalTaxApplied;
	}

	double getTotalTaxApplied(double totalBaseCost) {
		return calculateTax(totalBaseCost);
	}

	// Checking conditions for noOfguset as CessApplied is based on noOfGuest
	double calculateCess(int noOfGuest, double totalBaseCost) {
		if (noOfGuest <= 40) {
			return totalCessApplied = totalBaseCost * 0.04;
		} else if (noOfGuest <= 80) {
			return totalCessApplied = totalBaseCost * 0.08;
		} else if (noOfGuest <= 150) {
			return totalCessApplied = totalBaseCost * 0.10;
		} else {
			return totalCessApplied = totalBaseCost * 0.125;
		}
	}

	double getCess(int noOfGuest, double totalBaseCost) {
		return calculateCess(noOfGuest, totalBaseCost);
	}

	// Using return value of calcualteBAseCost, calculateTax & calCess to
	// calculateTotalCost for BanquetHall
	double calculateTheTotalCost(double totalBaseCost, double totalTaxApplied, double Cess, int noOfGuest) {
		totalTaxApplied = calculateTax(totalBaseCost);
		Cess = calculateCess(noOfGuest, totalBaseCost);
		return totalBaseCost + totalTaxApplied + Cess;
	}

	void printInvoice(int guestCount, double totalBaseCost) {
		System.out.println("     **** INVOICE DETAILS ****        ");
		System.out.println("Base Booking Cost of the Hall :  $" + baseCost);
		System.out.println("   Cost of Food(includes tax) :  $" + foodCost);
		System.out.println(" 	      Beverage Cost ");
		System.out.println("      (includes tax and tips) :  $" + beverageCost);
		System.out.println("-----------------------------   ------------");
		System.out.println("              Total Base Cost :  $" + totalBaseCost);
		System.out.println("             Tax on Base Cost :  $" + calculateTax(totalBaseCost));
		System.out.println(
				"     Service Cess (" + guestCount + " people) :  $" + calculateCess(guestCount, totalBaseCost));
		System.out.println("----------------------------- : ------------");
	}

}
