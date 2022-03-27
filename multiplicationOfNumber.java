import java.util.Scanner;
public class multiplicationOfNumber
  {
   public static void main(String[] args) {
	System.out.println("Enter the Number");
	Scanner get=new Scanner(System.in);
	int a,b;
	a=get.nextInt();
	b=get.nextInt();
	for(a=1;a<=b;a++)
	{
      System.out.println(a+ "*"+ b + "=" +a*b);
	}
   }
  }

