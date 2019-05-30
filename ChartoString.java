import java.util.Scanner;

public class ChartoString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of charecters");
		int n = sc.nextInt();
		char a[] =new char[n];
		for(int i=0; i<n ; i++) {
			a[i] = sc.next().charAt(0);
		}
		String str = new String(a);
		System.out.println(str);
	}
}
