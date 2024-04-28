public class constructor {
    public static void main(String[] args)
    {
        T objT=new T();
        S objS=new S();
    }
}
class S
{
    S()
    {
        System.out.println("Constructor of class S");
    }

}
class T
{
    T()
    {
        System.out.println("Constructor of class T");
    }
}
