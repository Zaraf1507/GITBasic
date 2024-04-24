package org.gitsample;

public class GitSample {

	public static void main(String[] args) {
		
		System.out.println("GIT SAMPLE");
		
		String str = "Java program";
		String output = "";
		for (int i=str.length()-1; i>=0; i--) {
			char c =  str .charAt(i);
			output = output+c;			
		}
		System.out.println("Reverse of string:"+ output);
				
	}
	
	
	
}
