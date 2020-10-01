package Trainings;

public class ArrayContainsElement {

	public static void main(String[] args) {
		int[] a= {1,3,4,76,34,68};
		int givenno=767, c=0;
		for (int i=0;i<=a.length-1;i++)
		{
			if (a[i]==givenno)
				c=1;
		}
		if (c==1) 
			System.out.println("The given number is present in the array");
		else
			System.out.println("The given number is not present in the array");
	}

}
