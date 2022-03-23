package Program.java;
import java.util.Scanner;  
public class PrintingEvenNo  
{  
public static void main(String[] args)   
{  
int number, i;  
Scanner Sc=new Scanner(System.in);  
System.out.print("Enter the Number: ");  
number = Sc.nextInt();    
i=2;   
System.out.print("Lit of even numbers: ");  
 while(i<=number)  
{  
System.out.print(i +" ");   
  i=i+2;  
}     
}  
}  