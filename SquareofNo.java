package Program.java;
import java.util.Scanner;
public class SquareofNo {
	  	  public static void main(String[]args)
	{
		Scanner get=new Scanner(System.in);
		int n,i=1;
		System.out.print("Enter a Number:");
		n=get.nextInt();
		while(i<=n) {
		System.out.print(i*i);
		i++;
	}
	}
	}
