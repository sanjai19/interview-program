package TYSS;

public class StrWithoutlng {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String rev = "";
		String s= "india";
		char[] ch=s.toCharArray();
		int count =0;
		for (char c : ch) {
			count++;
	
		}
		System.out.println(count);
		for(int i=count-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		
		}
		System.out.println(rev);
	}
	

}
