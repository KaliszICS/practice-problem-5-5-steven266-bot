public class PracticeProblem {

	public static void main(String args[]) {
	}
public static boolean isPalindrome(String word) {
   
    String cleaned = word.replace(" ", "").toLowerCase();
    
   
    String reversed = "";
    for (int i = cleaned.length() - 1; i >= 0; i--) {
        reversed += cleaned.charAt(i);
    }
  
    return cleaned.equals(reversed);
}

}
