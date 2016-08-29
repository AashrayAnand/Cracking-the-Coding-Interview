import java.util.*;

public class _1_1 {
	public static void main(String [] args){
		String value = "abcdefghi";
		String value2 = "aabbccddeeffgghhii";
		System.out.println(isUnique(value));
		System.out.println(isUnique(value2));
	}

	public static boolean isUnique(String str){
		if(str.length() > 128) return false;
		boolean[] set = new boolean[128];
		for(int i = 0; i < str.length(); i++){
			int curr = str.charAt(i);
			if(set[curr]){
				return false;
			}
			set[curr] = true;
		}
		return true;
	}
}
