
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean girl = false; //at list one girl
		boolean boy = false; //at list one girl
		int numChildren = 0;
		while (girl == false || boy == false) {
			double result = Math.random();
			// System.out.println(result);
			if (result > 0.5) {
				girl = true;
				System.out.print("g ");
				numChildren += 1;
			} else {
				boy = true;
				System.out.print("b ");
				numChildren += 1;

			}
			
		}
		System.out.println();
		System.out.println("You made it... and you now have " + numChildren + " children."); 
	}
}
