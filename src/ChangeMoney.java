import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] srgs) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.println("Mời pạn nhập số tiền USD");
        usd = scanner.nextDouble();
        double changeMoney = usd * vnd;
        System.out.println("Giá trị VND : " + changeMoney);
    }
}