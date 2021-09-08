package TYSS;

public class SameLengthStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[]= {"bye","who","hi","to","Amma"};
		String max = s[0];
		for(int i =1; i<s.length;i++)
		{
			if(max.length()<s[i].length())
			{
				max=s[i];
				
			}
			else if (max.length()==s[i].length())
			{
				
				System.out.println("String have the max length: "+s[i]);
			}
				
		}
		System.out.println("String have the max length: "+max);
	}


}
