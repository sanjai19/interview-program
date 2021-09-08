package TYSS;

import java.util.LinkedHashSet;

public class OnlyUniqueStrUsingLinkedset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Killer";
		// step 1 create set collection &add all char class into set
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		//step 2 compare each char of the set with all the char of given string
		for (Character Ch : set)
		{
			int count=0;
			for(int i=0; i<s.length();i++)
			{
				if (Ch == s.charAt(i))
				{
					count++;
				}
			}
			if(count==1)
			{
			System.out.print(Ch);
			}
		}
	}

}
