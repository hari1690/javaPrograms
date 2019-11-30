package javaPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class duplicateElementsInTwoArrays {

	public static void main(String[] args) {
		
		//Find duplicate elements in two arrays - need two loops, and yes, nested.
		/*Pseudocode
		 for each in A do
    		for each in B do
       				if (current item of A equals to current item of B)
           				say yes!
    			done
				done
		 */

		//Initialize arrays   
        int [] a = new int [] {1,2,3,4,5};
        int [] b = new int[] {8,1,3,4,6};
        HashSet<Integer> map = new HashSet<Integer>();
        for (int i :a)
        	map.add(i);
        	for (int i:b) {
        		if (map.contains(i))
        		{System.out.println(i);
        		}
        	}
        	      
        /* - Easiest method like the duplicate elements in an array
         * 
         * for(int i = 0; i < a.length; i++) {  
            for(int j = 0; j < b.length; j++) {  
                if(a[i] == b[j])  
                    System.out.println("Array A and B contains both elements"+ a[i]);  
            }  
        }  */	
   
    }  
        	
        
	}


