/*How to receive information from command prompt?
When we learn java ,sometimes we need receive information from command prompt to dubug our procedure */
import java.util.Scanner;//import a class that will be used

public class HelloJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();//receive a number from command prompt
		System.out.println(x);
	}

}