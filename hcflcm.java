package prasanth;
import java.util.*;
public class hcflcm {
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the number a:");
	      int a=sc.nextInt();
	      System.out.println("Enter the number b:");
	      int b=sc.nextInt();
	      int x=a;
	      int y=b;
	      while(x!=y){
	        if(x>y){
	          x=x-y;
	        }
	        else{
	          y=y-x;
	        }
	      }
	      System.out.println(x);
	      System.out.println((a*b)/x);
	  }
}
