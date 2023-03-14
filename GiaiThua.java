import java.util.Scanner;

public class GiaiThua {
	public static void main(String[] args) {
		Integer result = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number: ");
		Integer number = scanner.nextInt();

		for (int i = 1; i <= number ; i++) {
			result *= i;
		}

		System.out.println(result);
	}
}
