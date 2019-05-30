import java.util.Scanner;

public class Averageofnumber_array {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array ");
		int size = sc.nextInt();
		int []a = new int[size];
		int sum =0;
		System.out.println("enter elements");
		for(int i=0; i<size ; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		int res = sum/size;
		System.out.println(res);
	}
}
