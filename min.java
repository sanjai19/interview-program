package TYSS;

public class min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"bye","who","hi","to","Amma"};
		String min = s[0];
		for(int i =1; i<s.length;i++)
		{
			if(min.length()>s[i].length())
			{
				min=s[i];
				
			}
	
		}
		for(int i =0; i<s.length;i++)
		{
			if(min.length()==s[i].length())
			{
				System.out.println(s[i]);
			}
		}
		
	}

}
