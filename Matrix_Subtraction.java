package example;
import java.util.Scanner;
public class Matrix_Subtraction {
	public static void main(String[] args) {			
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Number of rows :");
		int m=input.nextInt();
		System.out.println("Enter the Number of columns :");
		int n=input.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		int c[][]=new int[m][n];
		System.out.println("Enter the value of a:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=input.nextInt();
				}}
	    	System.out.println("Enter the value of b:");	
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					b[i][j]=input.nextInt();
				}}
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
				    c[i][j]=a[i][j]- b[i][j];}}
		    System.out.println("Enter the difference of a-b:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
	     	System.out.print(c[i][j]+ " ");				
				}
			System.out.println();
			   }		
	          }
             }
