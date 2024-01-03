/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		double sumChildren = 0;
		int num2Children = 0;
		int num3Children = 0;
		int numManyChildren =0;
		for (int i = 1;i < T ;i++) {
			boolean girl = false; //at list one girl
			boolean boy = false; //at list one girl
			int numChildren = 0;
			while (girl == false || boy == false) {
				double result = Math.random();
				// System.out.println(result);
				if (result > 0.5) {
					girl = true;
					numChildren += 1;
				} else {
					boy = true;
					numChildren += 1;
				}
				if (numChildren == 2) {
					num2Children += 1;
				}else if (numChildren == 3) {
					num3Children += 1;
				}else if (numChildren > 3) {
					numManyChildren += 1;
					}
				}
				sumChildren += numChildren;
			}
		double avreage = sumChildren/ T;
		System.out.println("Average: " + avreage + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + num2Children);
		System.out.println("Number of families with 3 children: " + num3Children);
		System.out.println("Number of families with 4 or more children: " + numManyChildren);
		if (num2Children > num3Children && num2Children > numManyChildren) {
			 System.out.println("The most common number of children is 2.");
		}else if (num3Children > num2Children && num3Children > numManyChildren) {
			 System.out.println("The most common number of children is 3.");
		}else if (numManyChildren > num2Children && numManyChildren > num3Children) {
			 System.out.println("The most common number of children is 4 or more.");
			}
	}
}
