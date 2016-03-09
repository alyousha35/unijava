import java.util.Scanner;
import java.util.Arrays;

public class binarysearching {

public static void main(String args[]) {
Scanner input = new Scanner(System.in);
	int a[] = new int [10];
int k = 0;
System.out.println("Enter 10 Integers");
for (int c=0; c<a.length; c++)
	a[c]=input.nextInt();
System.out.println("Enter Key");
k = input.nextInt();

System.out.println(binarySearch(a,k));
}

public static boolean binarySearch(int a[], int k){
	Arrays.sort(a);
	int f =  0, l = a.length - 1;
	for( int c=0; c < a.length; c++){
		int m = (f+l)/2;
		if (a[m]==k)
			return true;
		else if (a[m]>k)
			l = m-1;
		else
			f = m+1;
	}
	return false;
}
}