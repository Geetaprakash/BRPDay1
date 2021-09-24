import java.util.Scanner;
class EvOd
{
 	 public static void main(String args[])
  	{
    		int n;
    		System.out.println("Enter a number");
    		Scanner input = new Scanner(System.in);
   		 n = input.nextInt();
   		 if ( n % 2 == 0 )
        	System.out.println("Entered number is even");
     	   else
        	System.out.println("Entered number is odd");
  	}
}






 /* If num is divisible by 2 it is even num
     * else odd number*/
/* 2%2=1 then even,2%3=0 then odd */