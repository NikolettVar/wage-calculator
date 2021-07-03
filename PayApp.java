/*
*PayApp.java
*N Varadi
*19 10 2020
*/

import java.util.Scanner;

public class PayApp{
	public static void main(String args[]){

	double basicHoursWorked;
	double basicPayRate;
	double overtimeHoursWorked;
	final double OVERTIMERATE;
	double basicPayForTheWeek;
	double overtimePayForTheWeek;
	double totalPayForTheWeek;

	Scanner keyboard;
	Pay myPay;

	keyboard = new Scanner(System.in);
	myPay = new Pay();

	System.out.println("Bob, please enter how many basic hours you worked this week");
		basicHoursWorked = keyboard.nextDouble();
		myPay.setHoursWorked(basicHoursWorked);

	System.out.println("Bob, please enter how many overtime hours you worked this week");
		overtimeHoursWorked = keyboard.nextDouble();
		myPay.setOvertimeHours(overtimeHoursWorked);

	System.out.println("Bob, please enter you basic rate of pay");
		basicPayRate = keyboard.nextDouble();
		myPay.setBasicPayRate(basicPayRate);

		myPay.compute();

	basicPayForTheWeek = myPay.getBasicPayForTheWeek();
	overtimePayForTheWeek = myPay.getOvertimePayForTheWeek();
	totalPayForTheWeek = myPay.getTotalPayForTheWeek();

	System.out.println("Bob, you have earned " + basicPayForTheWeek +" euro basic pay this week");
	System.out.println("Bob, you have earned " + overtimePayForTheWeek + " euro overtime pay this week");
	System.out.println("Bob, your total pay for the week is: " + totalPayForTheWeek);
	}
}
