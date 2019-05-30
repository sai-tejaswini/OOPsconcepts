import java.util.Scanner;

public class SortArrayinString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No.of strings to be enter is ");
		int n = sc.nextInt();
		String a[] = new String[n];
		System.out.println("Enter strings ");
		for(int i=0; i<n ; i++) {
			a[i] = sc.next();
		}
		
		for(int j=0 ; j<n ; j++) {
			for(int k= j+1 ; k<n ; k++ ) {
				if(a[j].compareTo(a[k]) > 0 ) {
					String temp = a[j];
					a[j] = a[k];
					a[k] = temp;
				}
			}
		}
		System.out.println("Sorted strings ");

		for(int i=0; i<n ; i++) {
			System.out.println(a[i] +" ");
		}
	}
}
