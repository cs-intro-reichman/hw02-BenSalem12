
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int countG = 0;
		int countB = 0;
		int sumC;
		String s = "";
		while (countG == 0 || countB == 0){
			if(Math.random() < 0.5){
				countG ++;
				s += "g ";
				
			}
			else{
				countB ++;
				s += "b ";
			}
		}
		sumC = countG + countB;
		System.out.println(s);
		System.out.print("You made it... and you now have " +  sumC + " children.");
	}
}
