import java.util.Scanner;
public class primeNumber
   {
	public static void main(String[] args) 
	  {
       Scanner get = new Scanner(System.in);  
       System.out.print("Enter a number : ");  
       int n = get.nextInt();  
       if (isPrime(n))
         {  
          System.out.println(n + " is a prime number");  
         }
       else 
         {  
          System.out.println(n + " is not a prime number");  
         }  
	   }  
	     public static boolean isPrime(int n)
	     {  
	     if (n <= 1) 
	     {  
          return false;  
		  }	
	      for (int i = 2; i < Math.sqrt(n); i++) {  
          if (n % i == 0) {  
          return false;  
		     }  		       }  
	      return true;  
		   }  
		}  
/*
  import java.util.Scanner;
  public class primeNumber {
     public static void main(String[] args) {   
        int temp, num;
        boolean isPrime = true;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        in.close();
        for (int i = 2; i&lt;= num/2; i++) {
            temp = num%i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) 
            System.out.println(num + "number is prime");
            else
                System.out.println(num + "number is not a prime");
             }
           }  
	           */
