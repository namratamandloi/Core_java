package in.co.Basics;

public class TestSwitchCase {
	public static void main(String[] args)
	{
		int numbers=2;
		String day;
		switch (numbers)
		{
		case 1:
			day = "sunday";
			break;
		case 2:
			day = "monday";
			break;
		case 3:
			day = "tuesday";
			break;
		case 4:
			day = "wednesday";
			break;
		case 5:
			day = "thursday";
			break;
		case 6:
			day = "friday";
			break;
		case 7:
			day = "saturday";
			break;
		default:
			day = "Invalid Day";
		}
		System.out.println("The day is :" + day);
	}

}
