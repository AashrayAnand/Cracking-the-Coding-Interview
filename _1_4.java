public class _1_4 {
	public static void main(String [] args){
		String value = "acblacbl";
		System.out.println(palindromePermutation(value));
	}

	public static boolean palindromePermutation(String str){
		int[] characters = new int[128];
		
		for(int i = 0; i < str.length(); i++){
			characters[str.charAt(i)]++;
		}
		boolean oddSingle = false; // checks if there is more than one character that occurs and odd number of times, which would mean it is not a palindrome permutation
		for(int i = 0; i < characters.length; i++){
			if(characters[i] % 2 == 1){
				if(oddSingle){
					return false;
				}
				oddSingle = true;
			}
		}
		return true;
	}
}
