
//interface
interface Fruits1{
    public abstract void taste();
    public void eat();

}
class Mango1 implements Fruits1{
    public void taste(){
        System.out.println("Mango is sweet.");
    }
    public void eat()
    {
        System.out.println("Let's eat Fruits.");
    }
}
public class EX4 {
    public static void main(String[] args)
    {
        Mango1 m=new Mango1();
        m.eat();
        m.taste();
    }
}
