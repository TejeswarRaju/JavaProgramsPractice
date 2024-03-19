import java.util.Scanner;

public class ReverseNumbers {
	public static void main(String[] args){
		System.out.println(reverse());
	}
	public static int reverse(){
		Scanner scan=new Scanner(System.in); // used to take the input from the user
		System.out.println("Enter the number to reverse:"); // asking the user to give the input to the user
		int n= scan.nextInt(); // taking the input from the user

		int rev=0;//intializing new variable reverse with 0; it will store the variables

		while(n>0){       // creating a while loop it should run until the number becomes 0;

			int lastdigit=n%10; //taking tha last digit from the given number by doing modulus operation
			rev= rev*10+lastdigit;// this operation helps us to get our number in appropriate place.
			n=n/10; //this operation helps us to remove the last digit from the number to divide further
		}
		return rev;
	}
}
