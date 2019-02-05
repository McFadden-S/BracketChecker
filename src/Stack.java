
import java.util.ArrayList;
import java.util.List;

/* **********************************************************
 * Programmer:      Shae McFadden
 * Class:           CS40S
 * 
 * Assignment:      3.2
 *
 * Description:     class implements a char stack data structure
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Stack
 {  // begin class
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
 	
        int sizeS = 0; //current size of stack
        ArrayList<Character> stack = new ArrayList<>(); //holds stack values
        
     
 	// ********** constructors ***********
 	
        /*
         Purpose: default constructor for stack object
         Interface: none
         Return: none
        */
        public Stack(){
            
        }//end of default constructer
        
        /*
         Purpose: initalized constructor for stack object
         Interface: size (int), values (int[])
         Return: none
        */
        public Stack(char[] n){
            for(int i = 0; i < n.length; i++){
                stack.add(n[i]);
                sizeS++;
            }//end of for loop
        }//end of initalized constructor
     
 	// ********** accessors **********
 	
        /*
        Purpose: checks if stack is empty
        Interface: none
        Returns: boolean true if empty
        */
        public boolean Empty(){
            boolean em = true;
            
            if(sizeS>0){
                em = false;
            }
            
            return em;
        }//end of empty
        
        /*
        Purpose: reads top value of stack
        Interface: none
        Returns: int of top value of stack, zero if none
        */
        public char Peek(){
            char n = 0;
            
            if (!(this.Empty())){
                n = stack.get(sizeS-1);
            }//end of if
            
            return n;
        }//end of peek
        
 	// ********** mutators **********
        
        /*
        Purpose: adds value to top of stack
        interface: value to be added (int)
        returns: none
        */
        public void Push(char n){
            stack.add(n);
            sizeS++;
        }//end of push
        
        /*
        Purpose: removes value of the stack
        interface none
        returns value removed
        */
        public char Pop(){
            char n = 0;
            
            if(!(this.Empty())){
                n = stack.get(sizeS-1);
                stack.remove(sizeS-1);
                sizeS--;
            }//end of if    
            return n;
        }//end of pop
 }  // end class