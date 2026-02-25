import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Please enter the first number");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        System.out.println("Please enter the second number");
        num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is "+sum);
    }
}
