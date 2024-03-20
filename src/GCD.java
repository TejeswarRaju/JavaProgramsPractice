import java.util.Scanner;

public class GCD {
	public static void main(String[] ar){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(gcd(a,b));

	}
	/* the logic is first we need to fing minimum of given two integers
	* After finding minimum. we need check whether those numbers are dividing those two integers.
	* */
	public static int gcd(int x,int y){
		int result=Math.min(x,y);
		while(result>0){
			if(x%result==0&&y%result==0){
				break;
			}
			result--;
		}
		return result;
	}
	//Efficient method.
	//Euclidean algorithm
		while(x!=y){
			if(x>y){
				x=x-y;
			}else{
				y=y-x;
			}

		}
		return x;
	}
//efficient method than above program is
if(y==0){
			return x;
		}
			return gcd(y,x%y);
}
}
