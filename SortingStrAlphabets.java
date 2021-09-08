package TYSS;

public class SortingStrAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"apple","mango","banana","orange"};
		String max = s[0];
		for(int i =1; i<s.length;i++)
		{
			for(int j =i+1;j<s.length;j++) {
		
			if(s[i].length()<s[i].length())
			{
						String temp = s[i];
						s[i]=s[j];
						s[j]=temp;
				
			}	
			
		}
		}
		System.out.println(max);
		

	}
}
