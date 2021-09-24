import java.io.*;
import java.util.*;
public class EvenOdd{
	// Returns 0 if n is even, else odd
	static int isEven(int num)
	{
		return (num & 1);
	}
	public static void main(String args[])
	{
		int num = 6;
		if(isEven(num)==0)
			System.out.print("Even");
		else
			System.out.print("Odd");
	}
}







/* 0&1=0,0 &0=0,1&0=0,1&1=1 */
/*00001000 & 00000110 =00000000(6)*/