import java.util.Arrays;
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Bài tập 1:
//        Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta nhập vào một số nguyên, in ra màn hình “Đây là số nguyên dương”
//        Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0, ngược lại in ra “Đây là số nguyên âm”.
        System.out.println("Bài tập 1: Nhập vào một số nguyên");
        int num1 = sc.nextInt();
        if (num1 >= 0) {
            System.out.println("Đây là số nguyên dương");
        } else {
            System.out.println("Đây là số nguyên âm");
        }

//        Bài tập 2:
//        Viết chương trình cho phép nhập vào một số nguyên dạng số, sau khi chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ.
//                VD: 1 -> Một, 2 -> Hai, …

        String[] numWords = {"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín", "Mười"};
        int num2;
        do {
            System.out.println("Bài tập 2: Nhập vào một số nguyên(0-10)");
            num2 = sc.nextInt();
        } while (num2 < 0 || num2 > 10);
        System.out.println(numWords[num2]);

//        Bài tập 3:
//        Viết chương trình cho phép nhập vào 3 số thực
//        Chương trình này sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác hay không.
        double[] sides1 = new double[3];
        System.out.println("Nhập cạnh a");
        sides1[0] = sc.nextDouble();
        System.out.println("Nhập cạnh b");
        sides1[1] = sc.nextDouble();
        System.out.println("Nhập cạnh c");
        sides1[2] = sc.nextDouble();

        Arrays.sort(sides1);
        if (sides1[0]+sides1[1]> sides1[2]) {
            System.out.println("3 cạnh của một tam giác");
        } else {
            System.out.println("Không phải 3 cạnh của một tam giác");
        }

//        Bài tập 4:
//        Viết chương trình cho phép nhập vào 3 số
//        Chương trình sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác vuông hay không.
        double[] sides2 = new double[3];
        System.out.println("Nhập cạnh a");
        sides2[0] = sc.nextDouble();
        System.out.println("Nhập cạnh b");
        sides2[1] = sc.nextDouble();
        System.out.println("Nhập cạnh c");
        sides2[2] = sc.nextDouble();
        Arrays.sort(sides2);
        if (Math.hypot(sides2[0],sides2[1]) == sides2[2] && (sides2[0] > 0)) {
            System.out.println("3 cạnh của một tam giác vuông");
        } else {
            System.out.println("Không phải 3 cạnh của một tam giác vuông");
        }

//        Bài tập 5:
//        Viết chương trình cho phép nhập vào một số nguyên
//        Nếu số đó chia hết cho 3 thì hiển thị FIZZ
//        Nếu số đó chia hết cho 5 hiển thị BUZZ
//        Nếu số đó chia hết cả 3 và 5 thì hiển thị FIZZBUZZ
        System.out.println("Bài tập 5: Nhập vào một số nguyên");
        int num5 = sc.nextInt();
        boolean isDivisibleBy3 = num5%3==0;
        boolean isDivisibleBy5 = num5%5==0;
        if (isDivisibleBy3 && isDivisibleBy5) {
            System.out.println("FIZZBUZZ");
        } else if (isDivisibleBy3) {
            System.out.println("FIZZ");
        } else if (isDivisibleBy5) {
            System.out.println("BUZZ");
        }
    }

}