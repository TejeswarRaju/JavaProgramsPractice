import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args){
		System.out.println(count()); // function calling count method
	}
	public static int count(){

		Scanner scan=new Scanner(System.in); //Taking the input from the user

		System.out.println("Enter the digits to count the number:");//telling the user to enter Numbers

		int n=scan.nextInt();// taking the user input number

		int result=0;// Assign a new variable result and store it with 0

		while(n>0){ //creating a loop

			n=n/10;        //we can count digits by dividing that number by 10. this loop
			               // will run until the n becomes 0. when n becomes 0 then it comes out of the loop.
			               // each iteration the result will increase by 1.
			result++;
		}

		return result;      //printing the result with return type.
	}
}
