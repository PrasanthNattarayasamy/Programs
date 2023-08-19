package prasanth;
import java.util.*;
public class spnumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n!=0) {
			int fact=1;
			int rem=n%10;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=fact+sum;
			n/=10;
		}
		if(sum==temp) {
			System.out.println(temp + " is a special number.");
		}
		else {
			System.out.println(temp + " is not a special number.");
		}
	}
}
