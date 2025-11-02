class Student
{
    private int age; //jp bhi varaibale print kre wo bhr se excess ho rha he so using private
    private String name; //data should be hidden

    public void setdata()
{ // isko call krenge tabi data set hoga
    age=18;
    name="Ujjwal";
}

    public void show()
    {
        System.out.println(name + "  " + age);
    }

}
public class encap1{
    public static void main(String[] args){
        Student obj=new Student();

        Student obj1=new Student();
        //obj.age=18;
        //obj.name="Ujjwal";  //error 

        // System.out.println(obj.age);    //error as age variable is private so cannot acess from outside
        
        obj.setdata();
        obj.show();
        obj1.show(); //yha pe default value ayyegi because setdata call nai hua
        obj1.setdata();
        obj1.show();
    }
}