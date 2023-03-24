import java.util.Scanner;

public class GiaiThua {
	public static void main(String[] args) {
		Integer result = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number: ");
		Integer number = scanner.nextInt();

//		for (int i = 1; i <= number ; i++) {
//			result *= i;
//		}
//
//		System.out.println(result);

		System.out.println(giaiThua(number));
	}

	public static int giaiThua(int n) {
		if (n==0) {
			return 1;
		} else {
			return n * giaiThua(n - 1);
		}
	}
}
