package withoutenum;

public class TestConstants {

	public static void main(String[] args) {
		
		Day day=new Day();
		day.setDay(WeekDays.SATURDAY);

		System.out.println("Day : "+day.getDay());
	}

}
