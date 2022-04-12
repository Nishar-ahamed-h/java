package example;
import java.util.Scanner;
public class Matrix_Max_Min {	
   public static void main(String[] args) {
		Scanner get=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int r=get.nextInt();
		System.out.println("Enter the Number of column:");
		int c=get.nextInt();	
		int a[][]=new int[r][c];
     	System.out.println("Type matrix values of A:");
	     for(int i=0;i<r;i++) {
	       for(int j=0;j<c;j++) {
    		 a[i][j]=get.nextInt(); 	
    		 }
		       }
	         int max,min;
	         max=min=a[0][0];
    	      for(int i=0;i<r;i++) {
 		     	for(int j=0;j<c;j++) {
			   	 if(a[i][j]>max) {
			     	 max=a[i][j];
			 	 }
			  	 else if(a[i][j]<min)
			         min=a[i][j];
			      }
			   	 } 
			    System.out.println("max="+max);
		        System.out.println("min="+min);
		       }
	        }
