public class funDemo {
    public static void main(String[] args)
    {
        Fun1 objFun1 = new Fun1();
        objFun1.show();
    }
}
class Fun1
{
    Fun2 obj=new Fun2();
    void show()
    {

        System.out.println("This is show function");
        display();
        obj.repeat();
    }
    void display()
    {
        System.out.println("This is display function");
        Fun2 obj=new Fun2();
        obj.repeat();
    }

}
class Fun2
{
    void repeat()
    {
        System.out.println("This is Fun2 function");

    }
}