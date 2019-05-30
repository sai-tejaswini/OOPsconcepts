import java.util.Scanner;

public class CountVowels {
	public static void main(String args[]) {
		int i =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String ch = sc.next();
		char k[] = ch.toCharArray();
		for(char check : k) {
			switch(check){
				case 'a'  :
				case 'e'  :
				case 'i'  :
				case 'o'  :
				case 'u'  :
				case 'A'  :
				case 'E'  :
				case 'I'  :
				case 'O'  :
				case 'U'  :i++;
			}
		}
		System.out.println(i);	
	}
}
