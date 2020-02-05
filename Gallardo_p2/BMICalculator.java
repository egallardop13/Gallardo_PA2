package BMICalculator;
import java.util.*;

public class BMICalculator {
  Scanner scn = new Scanner(System.in);
private double weight;
private double height;
private double bmi;
private String category;
public void readUserData() {
  //read unit type
	System.out.println("Which type of data would you be using today, metric or imperial?");
	int n = readUnitType();
	//read measurement data
	readMeasurementData(n);

}
private void readMeasurementData(int n) {
	 //readmetric data
	if (n == 1) {
		readMetricData();
	}
	//read imperial data
	if (n == 2) {
		readImperialData();
	}
	if (n < 0) {
		System.out.println("something failed in read unit type");
	}
	
}
private int readUnitType() {
	 String type = scn.nextLine();
	 int a = type.compareToIgnoreCase("metric");
	 int b = type.compareToIgnoreCase("imperial");
	 if (a == 0) {
		 return 1;
	 }
	 if (b == 0) {
		 return 2;
	 }
	 if(a!=0 && b!=0) {
		 System.out.println("You did not enter a correct type of data, try again");
		 readUnitType();
	 }
	 return -1;
}
private void readMetricData() {
	 System.out.print("Your weight in kilograms is "); 
	 setWeight(scn.nextDouble());
	 System.out.print("Your height in meters is "); 
	 setHeight(scn.nextDouble());
}
private void readImperialData() {
	 System.out.print("Your weight in pounds is "); 
	 setWeight(scn.nextDouble()*703);
	 System.out.print("Your height inches is "); 
	 setHeight(scn.nextDouble());
}
public void calculateBmi() {
	//calculates bmi 
     bmi = getWeight()/(getHeight()*getHeight());
		//bmi category
     calculateBmiCategory(bmi);
}
private void calculateBmiCategory(double bmi) {
	if(bmi < 18.5) {
		category = "Underweight";
	}
	if (bmi < 25 && bmi >= 18.5) {
		category = "normal weight";
	}
	if(bmi < 30 && bmi>=25) {
		category = "Overweight";
	}
	if (bmi >= 30) {
		category = "Obesity";
	}
}
public void displayBmi() {
	System.out.println("Your BMI is "+ getBmi() + " and it falls under the category " + getBmiCategory());
}
public double getWeight() {
	return weight;
}
private void setWeight(double weight) {
	this.weight = weight;
}
public double getHeight() {
	return height;
}
private void setHeight(double height) {
	this.height = height;
}
public double getBmi() {
	return bmi;
}
public String getBmiCategory() {
	return category;
}





}