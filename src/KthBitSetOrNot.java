public class KthBitSetOrNot {
	public static void main(String[] a){
		int n=52;
		int k=2;
		int mask=1;
		int r=mask<<k;
		if((n&r)!=0){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}

	}
}
