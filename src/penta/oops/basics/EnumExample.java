package penta.oops.basics;
enum Day
{
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY
	
}
public class EnumExample {

	public static void main(String[] args) {
		
		
		Day day=Day.SATURDAY;
		
		switch(day)
		{
		case SUNDAY :
			System.out.println("Fun Day-Party In Mg road");
			break;
		case MONDAY:
			System.out.println("Mood Off Day");
			break;
		case TUESDAY:
			System.out.println("Somewhat Okay");
			break;
		case WEDNESDAY:
			System.out.println("Medium Day");
			break;
		case THURSDAY:
			System.out.println(" Waiting for friday");
			break;
		case FRIDAY:
			System.out.println("Excited about weekend");
			break;
		case SATURDAY:
			System.out.println("Party in Kora");
			break;
		}

	}

}
