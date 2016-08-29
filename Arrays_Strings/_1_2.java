public class _1_2 {
	public static void main(String [] args){
		String value = "abcde";
		String value2 = "acebd";
		System.out.println(isPermutation(value,value2));
	}

	public static boolean isPermutation(String str, String str2){
		if(str.length() != str2.length()){
			return false;
		}
		int[] values = new int[128];
		int[] values2 = new int[128];
		for(int i = 0; i < str.length(); i++){
			values[str.charAt(i)]++;
			values2[str2.charAt(i)]++;
		}
		for(int i = 0; i < values.length; i++){
			if(values[i] != values2[i]){
				return false;
			}
		}
		return true;
	}
}
