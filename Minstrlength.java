package TYSS;

public class Minstrlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[]= {"Hi","bye","sanjai","write","read"};
		String min = s[0];
		for(int i =1; i<s.length;i++)
		{
			if(min.length()>s[i].length())
			{
				min=s[i];
			}
				
		}
		System.out.println("String have the min length: "+min);
	}

}
