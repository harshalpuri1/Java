import java.util.*;

public class GetNo {
	public static void main (String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no: ");
	int n = sc.nextInt();
	
		if ( n>=0 ) {
			System.out.println(n + " is a Positive Number" );
		} else {
			System.out.println(n + " is a Negative Number" );
		}
	sc.close();
}
}