package prg;
import java.util.*;
public class StringReverse {
	 public static void main(String[] args) { 
		  System.out.println("Enter the string:");  
		  String string = "My Name is Nishar Ahamed";     
		  String reversed = "";    
          for(int i = string.length()-1; i >= 0; i--){    
          reversed = reversed + string.charAt(i);    
		     }                
		     System.out.println("Original string: " + string);    
		     System.out.println("Reverse of given string: " + reversed);    
		      }    
		  }   