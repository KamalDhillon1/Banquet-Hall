package Constructor;

public class BanquetHall {
	double totalBaseCost;
	double totalCessTax;
	double totalCost;
	double totalBaseCostTax;

	double calculateBaseCost(double foodCost, double beveragesCost, double tip) {
		totalBaseCost = foodCost + beveragesCost + tip;
		return totalBaseCost;
	}

	// calculate tax as per alberta
	double calculateTax(double totalBaseCost) {
		this.totalBaseCostTax = totalBaseCost;
		this.totalBaseCost = totalBaseCost * 0.5;
		return this.totalBaseCostTax;
	}

	double calculateCess(int noOfGuest, double totalBaseCost) {
		if (noOfGuest <= 40) {
			totalCessTax = totalBaseCost * 0.04;
		} else if (noOfGuest > 40 && noOfGuest <= 80) {
			totalCessTax = totalBaseCost * 0.10;
		} else {
			totalCessTax = totalBaseCost * 0.125;

		}
		return totalCessTax;
	}

	double calculateTheTotalCost(double totalBaseCost, double totalBaseTax, double totalCessTax) {
		totalCost = totalBaseCost + totalBaseTax + totalCessTax;
		return totalCost;
	}

}
