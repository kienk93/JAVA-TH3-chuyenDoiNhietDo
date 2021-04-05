import java.util.Scanner;

public class HelloPeople {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        String peopleName;
        System.out.println("Nhập tên bạn : ");
        peopleName = scanner.nextLine();
        System.out.println("Hello : " + peopleName);
    }
}