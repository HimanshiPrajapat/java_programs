public class classA
{
    public static void main(String[] args)
    {
        classB objB =new classB();
        classB objB1 =new classB();
        objB.display();
        objB.show();
        objB1.display();
        objB1.show();
        classC objC =new classC();
        objC.display();
        objC.show();
    }
}
class classB
{
    void show()
    {
        System.out.println("This is show function....");
    }
    void display()
    {
        System.out.println("This is display function....");
    }
}
class classC
{
    void show()
    {
        System.out.println("This is show function....");
    }
    void display()
    {
        System.out.println("This is display function....");
    }
}