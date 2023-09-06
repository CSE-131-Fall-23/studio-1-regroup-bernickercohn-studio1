package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println ("Please enter the first integer you would like to be averaged:");
		int n1 = in.nextInt();
		System.out.println ("Please enter the second integer you would like to be averaged:");
		int n2 = in.nextInt();
		
		System.out.println ("The average of " + n1 + " and " + n2 + " is: " + ((n1 + n2)/2.0));
	}

}
