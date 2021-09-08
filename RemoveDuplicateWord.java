package TYSS;

import java.util.HashSet;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		String s = "Welcome to india Welcome to Banglore";
		String[] str = s.split(" ");
		HashSet<String> set = new HashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		for (String word : set)
		{
			System.out.println(word);
		}

	}


}
