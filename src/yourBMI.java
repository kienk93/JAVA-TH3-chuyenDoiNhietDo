import java.util.Scanner;

public class yourBMI {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight (in kilogram):");
        weight = scanner.nextDouble(); // nhập giá trị cân nặng

        System.out.print("Your height (in meter):");
        height = scanner.nextDouble(); // nhập giá trị chiều cao
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n"); // tính BMI

        if (bmi < 18)
            System.out.printf("%-18.3f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-25.3f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-30.3f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.3f%s", bmi, "Obese");
    }
}