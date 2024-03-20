import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args){
palindrome(); //calling the palindrome method;
	}
	public static void palindrome(){
		Scanner scan=new Scanner(System.in);//taking the input from the user
		int n=scan.nextInt();//
		int ori_num=n;
//	the logic we are applying to find out palindrome is
//	first assign the given number(n) to original number(ori_num). write a reverse logic to reverse
//		the number. compare the ori_num==rev number. if original number equals to reverse number
//		then it is a palindrome otherwise it is not a palindrome.

		int rev=0;
		while(n>0){
			int lastdigit=n%10;
			rev=rev*10+lastdigit;
			n=n/10;
		}
		if(ori_num==rev){
			System.out.println("palindrome");
		}else{
			System.out.println("not palindrome");
		}
	}
}
