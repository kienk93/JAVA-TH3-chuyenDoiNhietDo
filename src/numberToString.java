import java.util.Scanner;

public class numberToString {
    public static void main(String[] abcd) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số để chuyển thành chữ :");
        int num = scanner.nextInt();
        int hangTram = num / 100;
        int hangChuc = (num % 100) / 10 ;
        int hangDonVi = (num % 100) % 10 ;
        // check từ 10 -> 20
        switch (num) {
            case 10:
                System.out.print("ten");
                break;
            case 11:
                System.out.print("eleven");
                break;
            case 12:
                System.out.print("twelve");
                break;
            case 13:
                System.out.print("thirteen");
                break;
            case 14:
                System.out.print("fourteen");
                break;
            case 15:
                System.out.print("fifteen");
                break;
            case 16:
                System.out.print("sixteen");
                break;
            case 17:
                System.out.print("seventeen");
                break;
            case 18:
                System.out.print("eighteen");
                break;
            case 19:
                System.out.print("nineteen");
                break;
            default:
                System.out.print("");
        }
        // check hàng trăm
        switch (hangTram) {
            case 1:
                System.out.print("One hundred and");
                break;
            case 2:
                System.out.print("Two hundred and");
                break;
            case 3:
                System.out.print("Three hundred and");
                break;
            case 4:
                System.out.print("Four hundred and");
                break;
            case 5:
                System.out.print("Five hundred and");
                break;
            case 6:
                System.out.print("Six hundred and");
                break;
            case 7:
                System.out.print("Seven hundred and");
                break;
            case 8:
                System.out.print("Eight hundred and");
                break;
            case 9:
                System.out.print("Nine hundred and");
                break;
            default:
                System.out.print("");
        }
        // check hàng chục
        switch (hangChuc) {

            case 2:
                System.out.print(" twenty");
                break;
            case 3:
                System.out.print(" thirty");
                break;
            case 4:
                System.out.print(" forty");
                break;
            case 5:
                System.out.print(" fifty");
                break;
            case 6:
                System.out.print(" sixty");
                break;
            case 7:
                System.out.print(" seventy");
                break;
            case 8:
                System.out.print(" eighty");
                break;
            case 9:
                System.out.print(" ninety");
                break;
            default:
                System.out.print("");
        }
        // check hàng đơn vị
        switch (hangDonVi) {
            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print(" one");
                break;
            case 2:
                System.out.print(" two");
                break;
            case 3:
                System.out.print(" three");
                break;
            case 4:
                System.out.print(" four");
                break;
            case 5:
                System.out.print(" five");
                break;
            case 6:
                System.out.print(" six");
                break;
            case 7:
                System.out.print(" seven");
                break;
            case 8:
                System.out.print(" eight");
                break;
            case 9:
                System.out.print(" nine");
                break;
        }
    }
}