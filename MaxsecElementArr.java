package TYSS;

public class MaxsecElementArr {

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
		System.out.println("2nd max element is"+b[1]);
		System.out.println("2nd min element"+b[b.length-2]);

	}

}
