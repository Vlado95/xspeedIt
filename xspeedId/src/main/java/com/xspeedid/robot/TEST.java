package com.xspeedid.robot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.internal.runners.statements.ExpectException;

public class TEST {
	
	
	
	
	
	
	// you can also use imports, for example:
	// import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

//	class Solution {
//	    public int solution(int[] A) {
//	        // write your code in Java SE 8
//	        
//	        int j = 0, i;
//	        for(i = 0; i < A.length; i++)
//	        {
//	           if (A[i] <= 0)  
//	           {
//	               int temp;
//	               temp = A[i];
//	               A[i] = A[j];
//	               A[j] = temp;
//	               j++;  
//	           }
//	        }
//	        
//	        
//	        int A2[] = new int[A.length-j];
//	       int k=0;
//	       for(int o=j;o<A.length;o++)
//	           {
//	               A2[k] = A[o];
//	               k++;
//	           }
//	           
//	        int s;
//	      
//
//	      for(s = 0; s < k; s++)
//	      {
//	        if(Math.abs(A2[s]) - 1 < k && A2[Math.abs(A2[s]) - 1] > 0)
//	          A2[Math.abs(A2[s]) - 1] = -A2[Math.abs(A2[s]) - 1];
//	      }
//
//	      for(s = 0; s < k; s++)
//	        if (A2[s] > 0)
//	          return s+1;  
//	      
//	      return k+1; 
//	      
//	    }
//	}
	
	public static Integer[] getDigits(int num) {
	    List<Integer> digits = new ArrayList<Integer>();
	    collectDigits(num, digits);
	    return digits.toArray(new Integer[]{});
	}
	
	private static void collectDigits(int num, List<Integer> digits) {
	    if(num / 10 > 0) {
	        collectDigits(num / 10, digits);
	    }
	    digits.add(num % 10);
	}
	
	
    public static String solution(String S, String T) {
	    String[] namesList = S.split(",");
	    StringBuilder sb = new StringBuilder();
	    int i1 = 2;
	    int i2 = 2;
	    for(String names : namesList ){
	    	String[] name = names.split(" ");
	    	if(name.length==3){
	    		String email = name[0].substring(0, 1).toLowerCase()+"_"+name[1].substring(0, 1).toLowerCase()+"_"+name[2].toLowerCase()+"@"+T.toLowerCase()+".com";
	    		
	    		if(sb.toString().contains(email)){
	    			email = name[0].substring(0, 1).toLowerCase()+"_"+name[1].substring(0, 1).toLowerCase()+"_"+name[2].toLowerCase()+""+i1+"@"+T.toLowerCase()+".com";
	    			i1++;
	    		}
		    	sb.append(names+" < "+email+" >,");				

	    	}
	    	if(name.length==2){
	    		String email =name[0].substring(0, 1).toLowerCase()+"_"+name[1].toLowerCase()+"@"+T.toLowerCase()+".com";
	    		
	    		if(sb.toString().contains(email)){
	    			email = name[0].substring(0, 1).toLowerCase()+"_"+name[1].toLowerCase()+""+i2+"@"+T.toLowerCase()+".com";
	    			i2++;
	    		}
	    		sb.append(names+" < " +email+">,");	
	    	}
	  
	    }
	    return sb.toString();
   }

	public static void main(String[] args) {
		String number = "12345678933333348484854";
		List<Integer> integers = Arrays.asList(1,2,3);
		Integer sum = integers.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println( sum );
		
		
		//int count = numDigits(number);
		int count = number.length();
		
		System.out.println(count);
		
		  Integer[] digits = getDigits(123456789);
		    System.out.println(Arrays.toString(digits));
		
		    
		 System.out.println( "solution ==> "+solution("Martin Luther King,Melanchon Jean,Claude Francois,Twahirwa Vlado,Terri Vlado,Thibault Vlado", "diji"));
//	    for(int i = 1; i <= count; i++)
//	    {
//	        if(digit == getDigit(number, i))
//	            return i;
//	    }
		    
		    
		  //  int num = 5542;
		    String numb = String.valueOf(number);
		    for(int i = 0; i < count; i++) {
		    	
		        Integer j = Character.digit(number.charAt(i), 10);
		        if(j==-1){
		        	throw new NumberFormatException("mauvaise format d'article");
		        }
		        System.out.println("digit: " + j);
		    }
		    
		    
		    
		    
		    StringBuilder sb = new StringBuilder();
		    List<Integer> list = new ArrayList<Integer>();
		    list.add(1);
		    list.add(4);
		    list.add(6);

		    String s;

		    for (Integer x : list) {
		        sb.append(x.toString());
		    }
		    s = sb.toString();
		    System.out.println(s);

		   // Integer finalResult = Integer.parseInt(sb.toString());
		    
		    int cout = 1;
	        while (cout < 11) {
	            System.out.println("Count is: " + cout);
	            cout++;
	        }
	        String[] splits = "hello hallo ,tjena hej ,tere".split(",");
	        for(String sp : splits)
	        System.out.println("f: " + sp);
	        
	     //   if(Character.isDigit(codePoint))
		    
		    

	}
	
	
	
	
	




}
