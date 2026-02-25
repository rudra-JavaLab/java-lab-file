import java.util.Scanner;

public class Area_perimeter {
    public static void main(String[] args) {
        System.out.println("Enter the length of a rectangle:");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        System.out.println("Enter the width of a rectangle:");
        int w = sc.nextInt();
        System.out.println("area of the rectangle is "+(l*w));
        System.out.println("The perimeter is ");
        int per = 2*(l+w);
        System.out.println(per);
    }
}
