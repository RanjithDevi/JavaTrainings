package Trainings;

public class VovwelsInString {

	public static void main(String[] args) {
		String txt="Godisloveandaffection";
		int a=0,e=0,j=0,o=0,u=0;
		txt=txt.toLowerCase();
		//char[] ch=txt.toCharArray();
		//System.out.println(ch);
		
		for (int i=0;i<txt.length();i++)
		{
			if (txt.charAt(i)=='a')
				a=a+1;
			if (txt.charAt(i)=='e')
				e=e+1;
			if (txt.charAt(i)=='i')
				j=j+1;
			if (txt.charAt(i)=='o')
				o=o+1;
			if (txt.charAt(i)=='u')
				u=u+1;
		}
		System.out.println( "a Occurance : " +a );
		System.out.println( "e Occurance : " +e );
		System.out.println( "i Occurance : " +j );
		System.out.println( "o Occurance : " +o);
		System.out.println( "u Occurance : " +u);
	}

}
