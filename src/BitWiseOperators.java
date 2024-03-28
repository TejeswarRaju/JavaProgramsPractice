public class BitWiseOperators {
	public static void main(String[] args){
		//And Operator
		int x=8;
		int y=9;
		System.out.println(x&y);
		//OR operator
		int u=5;
		int z=9;
		System.out.println(u|z);
		//XOR operator
		System.out.println(u^z);
		//~operator
		System.out.println(~x);
		// left shift operator Formula:(x*2^y)
		System.out.println(x<<1);
		//right Shift Operator Formula:(x/2^y)
		System.out.println(x>>1);
		//unsigned right Shift operator
		int a=-2;
		System.out.println(a>>>1);
		int mask=1;
		System.out.println(mask<<3);
	}
}
