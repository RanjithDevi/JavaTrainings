package Trainings;

public class SmallestInArray {

	public static void main(String[] args) {
		 Integer[] a= {10,20,45,5,343};
		 int s=a[0];
		 for (int i=0;i<a.length-1;i++)
		 {
			if (s>a[i])
		    	s=a[i];
		 }
		 System.out.println(s);

	}

}
