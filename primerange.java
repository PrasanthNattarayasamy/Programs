package prasanth;
import java.util.*;
public class primerange {
	 public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      int a=sc.nextInt();
	      int b=sc.nextInt();
	      int flag;
	      for(int i=a+1;i<b;i++){
	        if(i==1||i==0)
	        continue;
	        flag=1;
	        for(int j=2;j<=i/2;j++){
	          if(i%j==0){
	            flag=0;
	            break;
	          }
	        }
	        if(flag==1)
	        System.out.println(i);
	      }
	  }
	}



//this program prints the prime numbers in a given range 
