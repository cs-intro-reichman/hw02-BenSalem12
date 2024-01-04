/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T  = Integer.parseInt(args[0]);
		int countG = 0;
		int countB = 0;
		double avg = 0;
		int sumC;
		int count2C = 0;
		int count3C = 0;
		int count4C = 0;
		double countT = 0;
		for (int i = 1; i <= T; i++){
			countG = 0;
			countB = 0;
			while (countG == 0 || countB == 0){
				if(Math.random() < 0.5){
					countG ++;					
				}
				else{
					countB ++;
				}
			}
			sumC = countG + countB;
			if (sumC == 2){
				count2C ++;
			}
			if (sumC == 3){
				count3C ++;
			}
			if (sumC >= 4){
				count4C ++;
			}
			countT =  countT + sumC;
		}
		avg = countT / T;
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + count2C);
		System.out.println("Number of families with 3 children: " + count3C);
		System.out.println("Number of families with 4 or more children: " + count4C);
		if ((count2C >= count3C) && (count2C >= count4C)){
			System.out.println("The most common number of children is 2.");
		}
		if ((count3C > count2C) && (count3C >= count4C)){
			System.out.println("The most common number of children is 3.");
		}
		if ((count4C > count2C) && (count4C > count3C)){
			System.out.println("The most common number of children is 4 or more.");
		}
	}
}
