import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args){
		System.out.println(count());
	}
	public static int count(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the digits to count the number:");

		int n=scan.nextInt();
		int result=0;
		while(n>0){
			n=n/10;
			result++;
		}
		return result;
	}
}
