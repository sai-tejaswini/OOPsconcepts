import java.util.Scanner;

public class Pallindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		int a = n;
		int temp=0;
		while(a>0) {
			temp = (temp*10)+(a%10);
			a = a/10;
		}
		if(temp == n)
			System.out.println("Pallindrome");
		else
			System.out.println("Not a Pallindrome");
		
	}
}
