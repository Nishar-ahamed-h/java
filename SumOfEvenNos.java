package javaProgram;
import java.util.Scanner;
public class SumOfEvenNos 
   {
	public static void main(String args[])
	{
	 Scanner get=new Scanner (System.in);
	 System.out.println("Enter the number:");
	 int A,B,Sum=0;
	 A=get.nextInt();
	 B=get.nextInt();
	 for(int i=1;i<=B;i++)
		 Sum=Sum+2;
	 System.out.println(Sum); 
	 	}
}
