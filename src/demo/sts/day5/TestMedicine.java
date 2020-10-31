package demo.sts.day5;

import java.util.Date;

class Tablet extends Medicine {

	public Tablet(float price, Date expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayLabel() {
		return this.getDetails() + ".\nStore in cool and dry place";
	}

}

class Syrup extends Medicine {

	public Syrup(float price, Date expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayLabel() {
		return this.getDetails() + ".\nFor Oral use only";
	}

}
class Ointment extends Medicine {

	public Ointment(float price, Date expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayLabel() {
		return this.getDetails() + ".\nFor External use only";
	}

}

public class TestMedicine {
	public static void main(String[] args) {
		Date now = new Date();
		Medicine[] meds = {new Syrup(123.45f, now), new Tablet(345.56f,  now), new Ointment(321.43f, now)};

		for (Medicine med : meds)
			System.out.println(med.displayLabel());
	}
}
