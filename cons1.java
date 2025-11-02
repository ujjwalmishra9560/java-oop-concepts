class Student
{
    private int age;
    private String name;

    Student(String name , int age )
    {
        this.name=name;
        this.age=age;
    }
// constructor me iski jarurat nai he 

// public void setAge(int age)
// {
//     this.age=age;
// }
// public void setName(String name)
// { 
//     this.name=name;
// }
public int getAge()
{
    return age ;
}
public String getName()
{
    return name;
}
}
public class cons1{
    public static void main(String[] args){
        // yhi he call to construcutor
        // object creation me hi 
        Student obj=new Student("Rahul",10);

        // obj.setAge(20);
        // obj.setName("ujjwal");
        System.out.println(obj.getAge());
        int stud1Age = obj.getAge();
        System.out.println(stud1Age);

        System.out.println(obj.getName());
       String stud1Name =obj.getName();
       System.out.println(stud1Name);

    }
}