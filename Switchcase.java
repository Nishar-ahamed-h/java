package Program.java;
import java.util.Scanner;
public class Switchcase
   {
	public static void main(String[] args) 
	{
	Scanner get=new Scanner(System.in);
	String choise;
	System.out.print("Enter the No:");
	choise=get.next();
    switch(choise)
    {
    case "A":
    	System.out.print("Apple");
    	break;
    case "B":
    	System.out.print("Ball");
    	break;
    case "C":
    	System.out.print("Cup");
    	break;
    default:
        System.out.print("Product");
        break;
    }
	}

}
