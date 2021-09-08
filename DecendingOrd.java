package TYSS;

public class DecendingOrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b[]= {30,20,10,40,50};
		for(int i =0;i<b.length;i++)
		{
			for(int j =i+1;j<b.length;j++)
			{
				if(b[i] < b[j])
				{
					int temp = b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}	
		}
		for(int i =0;i<b.length;i++)
			System.out.println(b[i]);

	}

}
