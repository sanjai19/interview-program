package TYSS;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharStr {

	public static void main(String[] args) {
				
		String s = "Killer";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for (Character Ch : set) {
			System.out.print(Ch);
			
		}
		
		
	}

}
