package Program.java;
import java.util.Scanner;
public class whileloop
    {
  public static void main(String[]args)
{
	Scanner get=new Scanner(System.in);
	int n;
	System.out.print("Enter a Number:");
	n=get.nextInt();
	while(n>=0) {
	System.out.print(n);
	n--;
}
}
}