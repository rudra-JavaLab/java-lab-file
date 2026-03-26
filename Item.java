import java.util.Scanner;

public class Item {
    int code;
    double price;

    void input(int c, double p) {
        code = c;
        price = p;
    }


    void display() {
        System.out.println(code + "\t\t" + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item items[] = new Item[5];  // Array of objects
        double total = 0;


        for (int i = 0; i < 5; i++) {
            items[i] = new Item();

            System.out.println("Enter code for item " + (i + 1) + ":");
            int code = sc.nextInt();

            System.out.println("Enter price for item " + (i + 1) + ":");
            double price = sc.nextDouble();

            items[i].input(code, price);
            total += price;
        }

        System.out.println("\nCode\t\tPrice");
        System.out.println("------------------------");

        for (int i = 0; i < 5; i++) {
            items[i].display();
        }

        System.out.println("------------------------");
        System.out.println("Total Price = " + total);
    }
}