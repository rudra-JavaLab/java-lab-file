class Swap {
    int num;

    Swap(int n) {
        num = n;
    }

    void swap(Swap obj) {
        int temp = num;
        num = obj.num;
        obj.num = temp;
    }

    void display() {
        System.out.println(num);
    }

    public static void main(String[] args) {
        Swap a = new Swap(10);
        Swap b = new Swap(20);

        a.swap(b);

        a.display();
        b.display();
    }
}
