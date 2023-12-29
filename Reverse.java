/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String theWord= args[0];
		int theWordLen= theWord.length();
		String newWord = "";
		for (int i = (theWordLen-1) ;i >=0; i--) {
			char theChar = theWord.charAt(i);
			newWord += theChar;
		}
		System.out.println(newWord);
		System.out.println("The middle character is " + newWord.charAt(((theWordLen/2))));
	}
}
