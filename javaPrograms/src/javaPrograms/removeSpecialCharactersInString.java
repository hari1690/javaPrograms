package javaPrograms;


public class removeSpecialCharactersInString {

	public static void main(String[] args) {
		
		String text = "This - text ! has \\ /allot # of % special % characters"; 
		text = text.replaceAll("[^a-zA-Z0-9]", ""); 
		System.out.println(text); 
		
		String textWithBold = "This is bold"; 
		textWithBold = textWithBold.replaceAll("[^a-zA-Z0-9\\s+]", ""); 
		System.out.println(textWithBold); }

        
	}


