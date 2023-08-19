package prasanth;
import java.util.*;
public class armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0,digit;
		int temp=num;
		int temp1=num;
		int count=0;
		while(temp>0) {
			temp/=10;
			count++;
		}
		if(count==3) {
			while(temp1>0) {
				 digit=temp1%10;
				 sum+=(digit*digit*digit);
				 temp1/=10;
			}
		}
		else if(count==4) {
			while(temp1>0) {
				 digit=temp1%10;
				 sum+=(digit*digit*digit*digit);
				 temp1/=10;
			}
		}
		if(num==sum) {
			System.out.println("Ams number");
		}
		else {
			System.out.println("Not ams number");
		}
	}

}
