import java.util.Scanner;

public class Factorial {
	public static void main(String[] a){
		factorial();
	}
	public static void factorial(){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		/*Logic for Factorial
		* we are taking a new variable fact and initializing it to 1.
		* we wrote iterative method that it should run for n times.
		* fact=fact*iterative variable(i)
		* printing fact.
		* */
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println(fact);


	}
}
