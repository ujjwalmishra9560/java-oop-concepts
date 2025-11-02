class Student
{
    private int age; //jp bhi varaibale print kre wo bhr se excess ho rha he so using private
    private String name; //data should be hidden

    public void setAge(int age) //local var se instance var set kr rhe he 
{ // isko call krenge tabi data set hoga

    this.age=age;
}
public int getAge()
{
    return age ;
}
public void setName(String name)
{ // isko call krenge tabi data set hoga
    this.name=name;
}
public String getName()
{
    return name;
}
    public void show()
    {
        System.out.println(name + "  " + age);
    }

}
public class encap2{
    public static void main(String[] args){
        Student obj=new Student();

        Student obj1=new Student();
        //obj.age=18;
        //obj.name="Ujjwal";  //error 

        // System.out.println(obj.age);    //error as age variable is private so cannot acess from outside
        
        obj.setAge(20);
        obj.setName("ujjwal");
        obj.show();



        obj1.show(); //yha pe default value ayyegi because setdata call nai hua
        
        
        
        obj1.setAge(18);
        obj1.setName("mishra");
        obj1.show();


        System.out.println(" ");


       // jaise agr show() use nai krna to phir 
       int stud1Age = obj.getAge();
       System.out.println(stud1Age);

       String stud1Name =obj.getName();
       System.out.println(stud1Name);

    }
}