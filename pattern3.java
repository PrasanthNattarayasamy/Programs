package prasanth;
import java.util.*;
public class pattern3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
