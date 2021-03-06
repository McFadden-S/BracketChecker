// **********************************************************************
// Programmer:	Shae McFadden
// Class:	CS40S
//
// Assignment:	3.2
//
// Description:	This program will read in string of brackets and print whether
//              they are balenced
//
// Input:	Input of the strings will come from a file 
//
// Output:	output the brackets read and whether balanced or not
// ***********************************************************************

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.text.DecimalFormat;

public class main
{  // begin class
	public static void main(String args[]) throws IOException
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
            String strin; 
            char[] input;
            
	// ***** create objects *****
		
            Stack stack;
            BufferedReader fin;
                
	// ***** create input stream *****
	
            try{
                fin = new BufferedReader(new FileReader("BracketData.txt"));
            
		
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME:        Shae McFadden");
		System.out.println("Class:       CS40S");
		System.out.println("Assignment:  3.2");
		System.out.println("**********************************");
		
	// ***** main *****
	
            strin = fin.readLine();
            while(strin != null){
                
                System.out.println(strin + " Is Balenced: " + CheckBracket(strin));
                
                strin = fin.readLine();
            }//end of eof while loop
                
            }//end of try
            catch(FileNotFoundException e){
                System.out.println("file not found");
            }//end of catch
	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
        
        /*
        Purpose: takes string of brackets and checks to see if they are balanced
        In: string of brackets
        Out: boolean
        */
        private static boolean CheckBracket(String strin){
            boolean check = true;
            char[] input = strin.toCharArray();
            int index = 0;
            
            if(input.length!=0){
                Stack opens = new Stack();
                
                while(index < input.length && check){
                    if((input[index] == '(' || input[index] == '{' || input[index] == '[') && (index < input.length-1)){
                        opens.Push(input[index]);
                        index++;
                    }//end of if opening
                    else if (opens.Peek() == '(' && input[index] == ')' || opens.Peek()+2 == input[index]){
                        opens.Pop();
                        index++;  
                    }//end of else if current matches type current open
                    else{
                        check = false;
                    }//end of else 
                }//end of while
                
                if(!opens.Empty()){
                    check = false;
                }//end of if 
            }//end of if
            else{
                check = false;
            }//end of else
            return check;
        }//end of check bracket   
}  // end class