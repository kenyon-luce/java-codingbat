package exercises;

public class Warmup1 {

////SLEEP IN
/*
 * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
 * We sleep in if it is not a weekday or we're on vacation. 
 * Return true if we sleep in.
 */
	static boolean weekday = true;
	static boolean vacation = false;
	
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		return (vacation || !weekday);
	}
////
	
	public static void main(String[]args) {	
		System.out.println("Should I sleep in? " + sleepIn(weekday, vacation));
	}
}
