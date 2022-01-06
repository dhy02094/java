package re;

public class Date {
	
	int year, month, day;
	
	
	public boolean isLeapYear() {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else
		{
		return false;
		}
	}
	
	public int getMonthLastDay(int month) {
		int [] last_days = new int [] {-1,31,28,31,30,31,30,31,31,30,31,30,31};
		
		if (this.isLeapYear()) {
			last_days[2] = 29;
		}
		return last_days[month];
	}
	
	public String getWeekday() {
		int total_days = 0;
		String [] weekdays = new String[] {"일","월","화","수","목","금","토"};
		
		for (int i=1; i<year; i++) {
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				total_days += 366;
			}
			else {
				total_days += 365;
			}
		}
		for (int i=1 ; i<month; i++ ) {
			total_days += this.getMonthLastDay(i);
		}
		total_days += day;
		
		return weekdays[total_days % 7];
	}
	

}
