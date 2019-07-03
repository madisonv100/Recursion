
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter the numbers you want to turn into a fibonacci sequence :");
        int num = scan.nextInt();
        
		FibanacciCalculator calulator = new FibanacciCalculator(num);
		System.out.println(calulator.fibbI(num));

	}

}
