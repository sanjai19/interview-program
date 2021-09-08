package TYSS;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[]= {"raja","bye","who","hi","to","Amma"};
		String max = s[0];
		for(int i =1; i<s.length;i++)
		{
			if(max.length()<s[i].length())
			{
				max=s[i];
				
			}
	
		}
		for(int i =0; i<s.length;i++)
		{
			if(max.length()==s[i].length())
			{
				System.out.println(s[i]);
			}
		}
		
	}


}
