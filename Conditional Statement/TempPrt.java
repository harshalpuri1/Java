import java.util.*;

public class TempPrt {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Temperature: ");
		Double temp = sc.nextDouble();
		
		if (temp < 100){
			System.out.println("You Don't have a fever.");
		} else {
			System.out.println("You have a fever, Please take care.");
		}
        sc.close();
	}
}