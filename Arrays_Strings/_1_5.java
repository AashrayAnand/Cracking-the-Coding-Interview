import java.util.*;

public class _1_5 {
	public static void main(String [] args){
		String value = "abcdefh";
		String value2 = "abddefh";
		String value3 = "able";
		String value4 = "cable";
		System.out.println(oneAway(value,value2));
		System.out.println(oneAway(value3,value4));
	}

	public static boolean oneAway(String str, String str2){
		if(Math.abs(str.length() - str2.length()) > 1){
			return false;
		}
		
		int[] strCharacters = new int[128];
		int[] strCharacters2 = new int[128];
		int differences = 0; // can have 2 differences if same length, only one if different length
		for(int i = 0; i < str.length(); i++){
			int curr = str.charAt(i);
			strCharacters[curr]++;
		}
		for(int i = 0; i < str2.length(); i++){
			int curr = str2.charAt(i);
			strCharacters2[curr]++;
		}
		for(int i = 0; i < strCharacters.length; i++){
			if(strCharacters[i] != strCharacters2[i]){
				differences++;
			}
		}

		return (differences <= 1) || (differences <= 2 && (str.length() == str2.length()));		
	}
}
