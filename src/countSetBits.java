import java.util.Scanner;

public class countSetBits {
	static public void main(String[] args){
		Scanner scan=new Scanner(System.in);

		int n=scan.nextInt();

		int result=0;
		while(n>0){

			n=(n&(n-1));
			result+=1;

		}
		System.out.println(result);
	}
}
