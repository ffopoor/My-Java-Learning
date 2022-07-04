import java.util.Scanner;

public class FindWeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number");
		//Receive information from command prompt.
		int Days  = sc.nextInt();
		int Weeks = Days/7;
		int Remainder = Days%7;
		System.out.println("You have "+Weeks+" weeks and "+Remainder+" days");
		}

}
