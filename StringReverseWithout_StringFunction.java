package prg;
import java.util.Scanner;
public class StringReverseWithout_StringFunction {
	public static void main(String[] args) {		   
		String s;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a String: ");  
		s=sc.nextLine();                      
		System.out.print("After reverse string is: ");        //int i=s.length();
		for(int i=s.length();i>0;--i)                         //while(i>0)               
		{                                                     //print(s.charAt(i-1)); 
		System.out.print(s.charAt(i-1));                      //i--;
		}  
	  }  
   }	
                   
  
