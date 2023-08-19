package prasanth;
import java.util.*;
public class marsnum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int step=0;
		int sum=0;
		while(temp>0) {
			sum+=temp%10;
			temp/=10;
		}
		while(sum>=10) {
			temp=sum;
			sum=0;
			while(temp>0) {
				sum=temp%10;
				temp/=10;
				step++;
			}
		}
			System.out.println(step);
	}
}
