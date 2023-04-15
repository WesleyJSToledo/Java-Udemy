package conditional_structure.range_values;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float value;
		String range;
		
		System.out.println("Enter the value:");
		value = sc.nextFloat();
		
		if(value >= 0 && value <= 25) {
			range = "[0, 25]";
		} else if(value > 25 && value <= 50) {
			range = "[25, 50]";
		} else if(value > 50 && value <= 75) {
			range = "[50, 75]";
		} else if(value >= 75 && value <= 100) {
			range = "[75, 100]";
		} else {
			range = "Invalid";
		}
		
		System.out.println("range " +range);

		sc.close();
	}

}
