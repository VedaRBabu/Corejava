package lab7;

public class JunitDate {
	private int intDay,intMonth,intYear;

	public JunitDate(int intDay, int intMonth, int intYear) {
		super();
		this.intDay = intDay;
		this.intMonth = intMonth;
		this.intYear = intYear;
	}

	
	public int getIntDay() {
		return intDay;
	}

	
	public void setIntDay(int intDay) {
		this.intDay = intDay;
	}


	public int getIntMonth() {
		return intMonth;
	}

	
	public void setIntMonth(int intMonth) {
		this.intMonth = intMonth;
	}

	public int getIntYear() {
		return intYear;
	}

	
	public void setIntYear(int intYear) {
		this.intYear = intYear;
	}

	@Override
	public String toString() {
		return""+intDay+"/"+intMonth+"/"+intYear;
	}
	
}


