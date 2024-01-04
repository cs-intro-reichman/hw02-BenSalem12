/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String getS = args[0];
		for (int i = getS.length() - 1; i >= 0; i --) {
			System.out.print(getS.charAt(i));
		}
		System.out.println();
		System.out.println("The middle character is "+getS.charAt ((getS.length() - 1)/2));
	}
}
