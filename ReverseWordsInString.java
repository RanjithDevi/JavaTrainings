package Trainings;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String text="I love Agni";
		/*StringBuffer str=new StringBuffer(text);
		StringBuffer strrev=str.reverse();
		System.out.println(strrev);*/
		
		String[] temp = text.split(" ");
		String rev="";
		System.out.println(temp.length);
		System.out.println(temp[0]);
		System.out.println(temp[1]);
		System.out.println(temp[2]);
		for (int i=temp.length-1;i>=0;i--)
		{
			rev=rev+temp[i]+" ";
			
		}
		System.out.println(rev);
	}

}
