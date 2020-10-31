package com.abc.exp;

public class DateDemo {
	private int day,month,year;
	
	private final int max_day =31;
	private final int max_month = 12;
	private final int max_year = 1984;

	public String toString() {
		return "dateclass [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) throws InvalidDayException {
		if (day <= this.max_day && day >0)
			this.day = day;
		else 
			throw new InvalidDayException("Day cannot be greater than "+this.max_day);
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) throws InvalidMonthException {
		if (month > 0 && month <= this.max_month)
			this.month = month;
		else 
			throw new InvalidMonthException("Month cannot be greater than "+this.max_month);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) throws InvalidYearException {
		if (year <= this.max_year)
			this.year = year;
		else 
			throw new InvalidYearException("Year cannot be greater than "+ this.max_year );
	}
	
	
	public static void main(String[] args) {
		DateDemo d1 = new DateDemo();
		try {
			d1.setDay(3);
			d1.setMonth(10);
			d1.setYear(1985);
		} catch (InvalidDayException e) {
			System.out.println(e.getMessage());
		} catch (InvalidYearException e) {
			System.out.println(e.getMessage());
		} catch (InvalidMonthException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(d1);
	}
	
}
