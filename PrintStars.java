public class PrintStars
{
	public static void main(String args[])
	{
	int r=5;
	for(int i=0;i<r;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" *");
				
			}
			System.out.println();
		}
	}
}


/*Iteration1:i=0,0<4(true),j=0,j<=0(true):it will print (*),Now the value of j and i increased to 1.*/
/* Iteration2:i=1, 1<4(true),j=1,j<=1(true):it will print(**),Now the value of j and i increased to 2*/
/* Iteration3:i=2, 2<4(true),j=2,j<=2(true):it will print(***),Now the value of j and i increased to 3*/
/* Iteration4:i=3, 3<4(true),j=3,j<=3(true):it will print(****),Now the value of j and i increased to 4*/	
/* Iteration5:i=4, 4<4(false),j<4(false):it will print(*****)*/