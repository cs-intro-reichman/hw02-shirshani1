/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int sum = 1;
		int num= Integer.parseInt(args[0]);
		String printed = (num + " is a perfect number since " + num + " = 1"); 
		for (int i = 2; i< num; i++) {
			if (num%i == 0) {
				sum =+ i;
				// System.out.println(i);
				printed += (" + " + i);}
			}
		// System.out.println(sum);
		if (num == sum) {
			System.out.println(printed);
			System.out.println(sum);
			} else {
				System.out.println(num + " is not a perfect number");
				}
		}
		
}
