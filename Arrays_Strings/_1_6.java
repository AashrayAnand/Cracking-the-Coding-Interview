public class _1_6 {
	public static void main(String [] args){
		String str = "aaabbcccccdeeeee";
		String str2 = "abc";
		System.out.println(compressed(str));
		System.out.println(compressed(str2));
	}

	public static String compressed(String str){
		String compressed = "";
		for(int i = 0; i < str.length(); i++){
			int curr = i;
			int count = 0;
			while(curr < str.length() && str.charAt(curr) == str.charAt(i)){
				curr++;
				count++;
			}
			compressed += str.substring(i, i + 1) + count;
			i = curr - 1;
		}
		if(compressed.length() < str.length()){
			return compressed;
		}

		return str;
	}
}
