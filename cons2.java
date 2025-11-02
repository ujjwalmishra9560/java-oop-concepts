class demo{
    private int a;
    private int b;

    public demo()
    {
        System.out.println("zero parameterized constructor by programer");
    }
    
    
    public demo(int a, int b)
{
    this.a=a;
    this.b=b;

 }

 public demo(int a)
    {
        System.out.println("one paramerterized constructor by programer");
    }
void disp()
{
    System.out.println(a);
    System.out.println(b);

}
}
public class cons2 
{
    public static void main(String[] args)
    {
        demo d=new demo();   
        d.disp();

        System.out.println("");

        demo d1=new demo(10,20);
        d1.disp();

System.out.println("");

        demo d2=new demo(10);
        d2.disp();

    }
    
}