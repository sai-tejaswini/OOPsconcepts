import java.util.Scanner;

public class ArrayReverse {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size ");
		int len = sc.nextInt();
		int []a = new int[len];
		int b[] = new int[len];
		int blen = len-1 ;
		System.out.println("Enter elements into the array");
		for(int i=0; i<len; i++,blen--) {
			a[i] = sc.nextInt();
			b[blen] = a[i];
		}
		System.out.println();
		for(int k=0 ; k<len ;k++ ) {
			System.out.println(b[k]);
		}
	}
}
