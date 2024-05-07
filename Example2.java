//Polymorphism
class color
{
    void paint()
    {
        System.out.println("I'm Painting.");
    }
}
class RedPaint extends color{
    void paint()
    {
        System.out.println("I'm Painting with Red color.");
    }
}
class BluePaint extends color{
    void paint()
    {
        System.out.println("I'm Painting with Blue color.");
    }
}
public class Example2{
    public static void main(String args[])
    {
        color c;
        c=new RedPaint();
        c.paint();
        c=new BluePaint();
        c.paint();
    }
}
