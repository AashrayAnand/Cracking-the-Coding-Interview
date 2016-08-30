public class _1_9 {
	public static void main(String[] args){
		String str = "waterbottle";
		String str2 = "erbottlewat";
		System.out.println(isRotation(str,str2));
	}

	public static boolean isRotation(String str, String str2){
		if(str.length() != str2.length() || str.length() == 0){
			return false;
		}

		return isSubstring(str2 + str2, str);
	}	
	
	public static boolean isSubstring(String big, String small){
		return big.indexOf(small) >= 0;
	}
}
