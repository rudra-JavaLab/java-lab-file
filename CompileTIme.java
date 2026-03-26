public class CompileTIme {
    int  add(){
        int a,b,c;
        a= 10;
        b=20;
        c= a+b;
        return c ;
    }
    void  add(int x,int y){
        int c;
        c= x+ y;
        System.out.println(c);
    }
    double add(int x,double y){
        double c;
        c= x + y;
        return c;
    }
    public static void main(String[] args) {
        CompileTIme t=new CompileTIme();

        int j = t.add();
        System.out.println(j);
        t.add(1000,230);
       double k = t.add(1000,230.67);
       System.out.println(k);
    }
}
