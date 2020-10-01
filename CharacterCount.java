package Trainings;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		String text="God is love";
		int s=0, len=text.length();
		Map<Character, Integer>  map = new LinkedHashMap<Character, Integer>();
		{
			for (int i=0;i<=len-1;i++)
			{
			 s=0;
			 for (int j=0; j<len-1;i++)
			 {
			 if (text.charAt(i)==text.charAt(j))
			 {
				s=s+1;
				map.put(text.charAt(i),s);
				
			 }
			 System.out.println(map);
			}
		}
		}
	}
	}

