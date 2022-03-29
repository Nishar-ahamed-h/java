import java.io.*;
public class stringCount 
    {
    public static void main(String[] args) {    
    String s = "This is Nishar H";    
	        int count = 0;    	              
	        for(int i = 0; i < s.length(); i++) {    
	            if(s.charAt(i) != ' ')    
	                count++;    
	        }    
	        System.out.println("Total number of characters in a string: " + count);    
	    }    
	}     
	