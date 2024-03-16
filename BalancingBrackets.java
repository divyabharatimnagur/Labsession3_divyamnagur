
//=Question → 1)  Write a program of Balancing Brackets, use a suitable data structure to print whether the string entered is a Balanced Brackets or Unbalanced String

package com.balancebracket.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancingBrackets {

	
	 public static void main(String[] args) {
		 String input="([[{}]])";
		 boolean result= checkBalancedBracket(input);
		 if(result) {
			 System.out.println("Entered the string has Balanced Bracket");
		 }
		 else {
			 System.out.println("The String do not contain balanced Bracket");
			 
		 }
		   
		   }
	  
	 static boolean checkBalancedBracket(String input) {
		Stack<Character> stack=new Stack<>();
		   for(int i=0;i<input.length();i++) {
			   char c=input.charAt(i);
			    if(c=='('|| c=='{' || c=='[') {
			    	stack.push(c);
			    	continue;
			    	    }
			    if(stack.isEmpty()) {
			    	return false;
			    }
			    char temp;
			    switch(c) {
			    case ')':
			    	temp=stack.pop();
			    	if(temp=='{' || temp=='[') {
			    		return false;
			    	}
			    	break;
			    case '}':
			    	temp=stack.pop();
			    	if(temp=='(' || temp=='[') {
			    		return false;
			    	}
			    	break;
			    case ']':
			    	temp=stack.pop();
			    	if(temp=='(' || temp=='{') {
			    		return false;
			    	}
			    	break;
			    	default: 
			    		System.out.println("not valid bracket");			    
			    			    
		   }		 
	 }
		   return stack.isEmpty();
 			   
		   }
}
