import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in celcius");
        double temp = input.nextDouble();
       double tempf = (temp*1.8)+32;
       System.out.println("The temperature in fahrenheit is "+tempf);
    }
}
