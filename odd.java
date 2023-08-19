package prasanth;
import java.util.*;
public class odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int even=0,odd=0;
		int digit;
		while(n>0) 
		{
			digit=n%10;
			n=n/10;
			if(digit%2==0) 
				odd=odd+digit;
			else
				even=even+digit;
		}
	
	System.out.print(" "+even+" "+odd);
}
	}
