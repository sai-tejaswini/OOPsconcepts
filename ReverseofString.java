import java.util.Scanner;

public class ReverseofString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String a = sc.next();
		char b[] = a.toCharArray();
		int len = b.length;
		char c[] = new char[len];
		int clen = len-1;
		for(int i=0; i<len ; i++ , clen--) {
			c[clen] = b[i];
		}
		for(int j=0; j<len ; j++) {
			System.out.print(c[j]);
		}
	}
}
