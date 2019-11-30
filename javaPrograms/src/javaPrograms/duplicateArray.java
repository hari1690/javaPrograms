package javaPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class duplicateArray {

	public static void main(String[] args) {
		
		//Find duplicate elements in a array
		// TODO Auto-generated method stub

		//Initialize array   
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
          
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
        
     // Second solution : use HashSet data structure to find duplicates
        HashSet<String> store = new HashSet<String>();
        store.add("Ravi");    
        store.add("Vijay");    
        store.add("Ravi");    
        store.add("Ajay"); 
        store.add("vijaykumar");
        store.add("1234");
        store.add("123");
        store.add("123");
        //Traversing elements  
        Iterator<String> itr2 = store.iterator();
        while(itr2.hasNext()) {
        	System.out.println(itr2.next());
        }    
   
    }       
	}


