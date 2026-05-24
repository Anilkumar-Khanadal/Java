package day4;

/*switch(variable)
{
case value1 : statement;
case value2 : statement;
case value3 : statememt;
default : statement;
} */

// If we have more number of condition then we can use switch statememnt

public class SwitchCaseStatement {

	public static void main(String[] args) {

		int weekNo = 6;
		switch (weekNo) {
		case 1:System.out.println("Sunday"); break;
		case 2:System.out.println("Monday"); break;
		case 3:System.out.println("Tuesday"); break;
		case 4:System.out.println("Wednesdy"); break;
		case 5:System.out.println("Thursday"); break;
		case 6:System.out.println("Friday"); break;
		case 7:System.out.println("Saturday"); break;
		default:System.out.println("Invalid week number"); break;
		}
	}
}
