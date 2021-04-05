public class sntNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Enter the prime number to find : ");
        int check = 0;
        for (int i = 2; i < 100; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    check++;
                }
            }
            if (check == 1) {
                System.out.print(i + " ");
            }
            check = 0;
        }
    }
}