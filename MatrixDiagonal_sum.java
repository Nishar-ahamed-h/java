package example;
import java.util.Scanner;
public class MatrixDiagonal_sum  {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number of rows:");
	int r=input.nextInt();
	System.out.println("Enter the Number of column:");
	int c=input.nextInt();	
	int a[][]=new int[r][c];
	  System.out.println("Type matrix values of A:");
      for(int i=0;i<r;i++) {
       for(int j=0;j<c;j++) {
   		 a[i][j]=input.nextInt(); 
    	  }
        }
      int sum=0;
      for(int i=0;i<r;i++) {
    	  for(int j=0;j<c;j++) {
    		 sum= sum + a[i][j];
    	  }}
    		 System.out.println("Sum of Diagonals of the element=" +sum); 
}}
