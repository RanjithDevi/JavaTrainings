package Trainings;

public class CharOccurInString {

	public static void main(String[] args) {
		String text="JavaProgramming";
		int s=0;
		char[] ch=text.toCharArray();
		for (int i=0;i<ch.length-1;i++)
		{
			if (ch[i]=='m')
				s=s+1;
		}
		System.out.println("Number of times m occured : " +s );
	}

}
