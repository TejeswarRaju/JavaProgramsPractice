public class powerOfTwo {
	public static void main(String[] args) {
		int n = 4;
		if (n == 0) {
			System.out.println("no");
		} else if ((n & (n - 1)) == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");

		}
	}
}
