package TYSS;

import java.util.HashSet;

public class FindDuplicateStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "india";
		// step 1 create set collection &add all char class into set
		HashSet<Character> set = new HashSet<Character>();
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
			if(count>1)
			{
			System.out.println(Ch+"="+count);
			}
		}
		

	}


}
