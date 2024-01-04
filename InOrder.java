/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int num1;
		int num2;
		int temp = (int) (Math.random() * 10);
		do{
			System.out.print(temp + " ");
			num1 = temp;
			num2 = (int) (Math.random() * 10);
			temp = num2;
		} while(num2 >= num1);
	}
}
