import java.util.Scanner;
class CharCount
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int count, temp=0;

		System.out.println("Enter the string - ");
		String a = sc.next();
		char strarr[] = a.toCharArray();

		int len = strarr.length;

		char arr[] = new char[len];

		for(int i=0; i<len ; i++)
		{
			count = 1;
			temp = 0;

			for(int j=i+1; j<len ; j++)
			{
				if(strarr[j] == strarr[i])
					count++;
			}
			for(int z=0; arr[z] != '\0' ; z++)
			{
				if(strarr[i] == arr[z])
				{
					temp++;
					break;
				}
			}
			if(temp == 0)
			{
				arr[i] = strarr[i];
				System.out.println(strarr[i] + "" + count);
			}
		}
	}
}