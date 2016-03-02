import java.util.Scanner;
public class Searching{
	public static void main(String args[]){
		Scanner Input = new Scanner(System.in);
		int a[]=new int[10];
		System.out.print("Enter 10 integers");
		for(int c=0; c<a.length; c++)
			a[c]= Input.nextInt();
			System.out.print("Enter key");
			int k = Input.nextInt();
			System.out.print(sequentialSearch(a,k));
	}
	public static boolean sequentialSearch(int a[], int k){
		for(int c=0; c<a.length; c++)
			if (a[c] == k)
				return true;
		return false;
	}
}