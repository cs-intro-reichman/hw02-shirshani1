/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int firstNum= ((int)(Math.random() * (10)));
		System.out.print(firstNum);
		int secNum = 0;
		do {
			secNum= ((int)(Math.random() * (10)));
			if (secNum > firstNum) {
				System.out.print(" " + secNum);}
			firstNum = secNum;
		} while (secNum > secNum);
	}
}
