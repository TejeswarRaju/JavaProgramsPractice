import java.util.Scanner;

public class factorialTrailingZeros {
	public static void main(String[] a){
		trailingZeros();
	}
	/*logic for this program is it is a combnation of factorial and delete the last digit from the
	factorial. count the number of zeros.
	* */
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
