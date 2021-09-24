import java.util.*;  
public class PatteA  
{  
public static void main(String[] args)  
{  
int i, j, num=8;  
for (i = 0
; i<= num; i++)   
{ 
for (j = 0; j<=num/ 2; j++)   
{  
if ((j == 0 || j ==  num/ 2) && i != 0 || i == 0  && j !=  num/ 2 || i ==  num/ 2)   
System.out.print("*");  
else  
System.out.print(" ");  
}  
System.out.println();  
}  
}  
}  
