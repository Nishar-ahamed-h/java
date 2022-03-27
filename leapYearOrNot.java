import java.util.Scanner;
public class leapYearOrNot
   {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the Year");
	int n=input.nextInt();
	if((n%4==0&&n%100!=0)||(n%400==0))
		System.out.print(n+ " is a leap yaer ");
	else 
	    System.out.print(n+ " is not a leap yaer ");
    } 	        
	}