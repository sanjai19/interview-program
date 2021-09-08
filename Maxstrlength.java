package TYSS;

public class Maxstrlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[]= {"Hi","bye","sanjai","writes","read"};
		String max = s[0];
		for(int i =1; i<s.length;i++)
		{
			if(max.length()<s[i].length())
			{
				max=s[i];
			}
				
		}
		System.out.println("String have the max length: "+max);
	}

}
