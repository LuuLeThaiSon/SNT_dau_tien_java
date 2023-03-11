public class Main {
    public static void main(String[] args) {
        Boolean flag;
        Integer count = 0;
        for (int i = 401; i < 500 ; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}

