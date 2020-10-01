package Trainings;

public class RemoveSpacesInString {
	public static void main(String[] args) {
		String text= "  Hello  Agni  !!  ";
		/*for (int i=0;i<text.length();i++)
		{
			text=text.replaceAll(" ","");
		}
		System.out.println(text);*/
		//System.out.println(text.trim());
		
		for (int i=0;i<text.length();i++)
		{
			text=text.replaceAll("^[ \t]","");
		}
		System.out.println(text); 
		
		
}
}
