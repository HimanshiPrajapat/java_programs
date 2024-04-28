public class Parameterized_const {
    public static void main(String[] args)
    {
        //constructor overloading
        T1 objT=new T1();
        S1 objS=new S1(10,20);
        S1 objS1=new S1();
        T1 objT1 =new T1();
    }
}
class S1
{
    S1()
    {
        System.out.println("Constructor of class S1");
    }
    S1(int x,int y)
    {
        System.out.println("The value of X is "+x+"\n"+"The value of Y is "+y);
    }
    S1(int x,int y,int z)
    {
        System.out.println("The value of X is "+x+"\n"+"The value of Y is "+y);

    }

}
class T1
{
    T1()
    {
        System.out.println("Constructor of class T1");
    }
}

