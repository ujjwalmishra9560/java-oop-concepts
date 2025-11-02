class student1
{
    private String name;
    private int age;
public student1()
{
    System.out.println("default constructor in called");
    name="rosh";
    age=21;
}
public student1(String name){
    this.name=name;
    age=18;
}
public student1(String name , int age){
    this.name=name;
    this.age=age;
}
public void disp(){
    System.out.println(name);
    System.out.println(age);
}
}
public class cons3_overloading {
    public static void main(String[] args){
        student1 sc=new student1();
        sc.disp();
        student1 sc1=new student1("rahul");
        sc1.disp();
        student1 sc2=new student1("ujjwal",12);
        sc.disp();

    }
    
}
