/*
*Pay.java
*N Varadi
*19 10 2020
*/

public class Pay{

	private double basicHoursWorked;
	private double basicPayRate;
	private double overtimeHoursWorked;
	private final double OVERTIMERATE;
	private double basicPayForTheWeek;
	private double overtimePayForTheWeek;
	private double totalPayForTheWeek;

		public Pay(){
			basicHoursWorked = 0.00;
			basicPayRate = 0.00;
			overtimeHoursWorked = 0.00;
			OVERTIMERATE = 1.5;
			basicPayForTheWeek = 0.00;
			overtimePayForTheWeek = 0.00;
			totalPayForTheWeek = 0.00;

		}

	//input methods

	public void setHoursWorked(double basicHoursWorked){
		this.basicHoursWorked = basicHoursWorked;
	}

	public void setBasicPayRate(double basicPayRate){
		this.basicPayRate = basicPayRate;
	}

	public void setOvertimeHours(double overtimeHoursWorked){
		this.overtimeHoursWorked = overtimeHoursWorked;
	}

	//process
	public void compute(){

	basicPayForTheWeek = basicHoursWorked * basicPayRate;
	overtimePayForTheWeek = overtimeHoursWorked * (basicPayRate * OVERTIMERATE);
	totalPayForTheWeek = basicPayForTheWeek + overtimePayForTheWeek;
	}

	//output
	public double getBasicPayForTheWeek(){
		return basicPayForTheWeek;
	}

	public double getOvertimePayForTheWeek(){
		return overtimePayForTheWeek;
	}

	public double getTotalPayForTheWeek(){
			return totalPayForTheWeek;
	}

}
