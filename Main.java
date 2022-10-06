import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        int countSNT = 0;
        int count = 0;

        for (int i = 1; ; i++) {

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(i);
                countSNT++;
            }

            count = 0;

            if (countSNT == number) {
                break;
            }

        }
    }
}
