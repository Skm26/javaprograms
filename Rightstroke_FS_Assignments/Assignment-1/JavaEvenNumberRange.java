package assignment1;
import java.util.*;
public class JavaEvenNumberRange {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to get the range of Even numbers : ");
		int n = sc.nextInt();
		for(int i=2;i<=n;i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}
		sc.close();
	}

}
