public class RecursionBasic {
	public static void main(String[] args) {
		int n=100;
		fun(n);
	}
	public static void fun(int n){
		if(1<=n){
			System.out.println(n);// eliminate this to print 1 to n;
			fun(n-1);
			System.out.println(n+"");//eliminate this to print n to 1
		}

	}
}
