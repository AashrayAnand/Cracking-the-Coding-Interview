public class _1_3{
	public static void main(String [] args){
		String value = "this is a string with blanks";
		System.out.println(URLify(value));
	}

	public static String URLify(String str){
		for(int i = 0; i < str.length(); i++){
			if(str.substring(i, i + 1).equals(" ")){
				str = str.substring(0,i) + "%20" + str.substring(i + 1);
			}
		}
		return str;
	}
}
