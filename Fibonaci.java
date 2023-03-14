import java.util.Scanner;

public class Fibonaci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		int temp;
		int count = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("input number: ");
		int number = scanner.nextInt();
		System.out.println(a);
		System.out.println(b);
		while (count <= number - 3) {
			c = a + b;
			System.out.println(c);
			temp = b;
			b = c;
			a = temp;
			count++;
		}
	}
}
