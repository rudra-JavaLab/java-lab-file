class Fact {
    int n = 5;

    int factorial() {
        int f = 1;
        for(int i=1;i<=n;i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String args[]) {
        Fact obj = new Fact();
        System.out.println(obj.factorial());
    }
}