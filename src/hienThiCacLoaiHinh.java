import java.util.Scanner;

public class hienThiCacLoaiHinh {
    public static void main(String srgs[]) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("1: Print the rectangle");
        System.out.println("2: Print the square triangle");
        System.out.println("3: Print isosceles triangle");
        System.out.println("4: Exit");
        System.out.println("Nhập số để chạy");
        num = input.nextInt();
        switch (num) {
            case 1:
                for (int i = 0; i < 4; i++) {
                    System.out.println("  ");
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*");
                        System.out.print(" ");
                    }
                }
                break;
            case 2:
                int numTriangle;
                System.out.println("5: Bottom-left");
                System.out.println("6: Top-left");
                System.out.println("7: Bottom-right");
                System.out.println("8: Top-right");
                numTriangle = input.nextInt();
                switch (numTriangle) {
                    case 5:
                        // Bottom-left
                        for (int i = 0; i < 5; i++) {
                            System.out.println("");
                            for (int j = 0; j <= i; j++) {
                                System.out.print("*");
                            }
                        }
                        break;

                    case 6:
                        // Top-left
                        System.out.println("");
                        for (int i = 0; i < 5; i++) {
                            System.out.println("");
                            for (int j = 5; j > i; j--) {
                                System.out.print("*");
                            }
                        }
                        break;
                    case 7:
                        // Bottom-right
                        for(int i=5;i>0;i--) {
                            System.out.println("");
                            for(int j=1;j<=i;j++) {
                                System.out.print(" ");
                            }
                            for (int j=5;j>=i;j--) {
                                System.out.print("*");
                            }
                        }
                        break;
                    case 8:
                        // Top-right
                        for (int i=0;i<5;i++) {
                            System.out.println("");
                            for (int j=0;j<i;j++) {
                                System.out.print(" ");
                            }
                            for (int j=5;j>i;j--) {
                                System.out.print("*");
                            }
                        }
                        break;
                }
                break;
            case 3:
                for (int i = 0; i < 6; i++) {
                    System.out.println("");
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                }
                for (int i = 0; i < 5; i++) {
                    System.out.println("");
                    for (int j = 5; j > i; j--) {
                        System.out.print("*");
                    }
                }
                break;
            default:
                System.out.println("Exit");

        }

    }
}