package Trainings;

public class CommonElements {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int[] b= {40,50,60,70,80};
		int s=0;
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=i;j<b.length;i++)
			{
				if (a[i]==b[j])
					System.out.println(b[j]);
					
					
			}
		}
		

	}

}
