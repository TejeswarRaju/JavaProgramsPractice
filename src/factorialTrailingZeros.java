import java.util.Scanner;

public class factorialTrailingZeros {
	public static void main(String[] a){
		trailingZeros();
	}
	/*logic for this program is that it combines factorial and deletes the last digit from the
	factorial. Count the number of zeros.
	* */
	//this method could be more efficient. It will crash if the n value is 20. For this, we need to develop the efficient method.
	//Below, I am writing an efficient method.
	public static void trailingZeros(){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println(fact);
		int result=0;
		for(int i=5;i<=n;i=i*5){
			result=result+n/i;

		}
		System.out.println(result);
	}
}
//Efficient method from here.
public static void trailingZeros(){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println(fact);
		int result=0;
		for(int i=5;i<=n;i=i*5){
			result=result+n/i;

		}
		System.out.println(result);
	}
Time complexity is theta logn.
