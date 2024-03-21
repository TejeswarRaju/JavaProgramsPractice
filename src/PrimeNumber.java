import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args){
		primeNumber();
	}
	public static void primeNumber(){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n==1){
			System.out.println("it is not a prime Number");
		}else if(n==2||n==3){
			System.out.println("it is a prime Number");
		}else if(n%2==0||n%3==0){
			System.out.println("it is not a prime Number");
		}else {
			boolean isPrime=true;
			for (int i = 5; i * i < n; i = i + 6) {
				if (n % i == 0 && n % (i + 2) == 0) {
					isPrime =false;
					break;
				}
			}
			if(isPrime){
				System.out.println("it is a prime Number");
			}else{
				System.out.println("it is not a prime Number");
			}
		}
		}
	}

