package org.gitsample;

import java.util.LinkedHashMap;
import java.util.Map;

public class GitSample {

	public static void main(String[] args) {
		
		System.out.println("GIT SAMPLE");
		
		String s = "java program";
		Map<Character, Integer> n = new LinkedHashMap<>();
		for (int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			if(n.containsValue(n.get(c))) {
				Integer integer = n.get(c);
				n.put(c,integer+1);
			}else {
				n.put(c,1);
			}
		}
	System.out.println(n);
	}
	
	
	
	
}
