class Student{
    int id ;
    String name;
     Student (){
      id  = 0;
      name = "Unknown";
    }
    Student(int i , String n){
         id=i;
         name=n;
    }
    void display(){
         System.out.println("Student id is "+id);
         System.out.println("Student name is "+name);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Rudra");
        s1.display();
        Student s2 = new Student();
        s2.display();
    }
}
