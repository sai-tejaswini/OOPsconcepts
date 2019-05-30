import java.util.Scanner;

public class ArrayInsertion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size ");
		int len = sc.nextInt();
		int []a = new int[len];
		System.out.println("Enter elements into the array");
		for(int i=0; i<len; i++) {
			a[i] = sc.nextInt();
		}
	}
}
