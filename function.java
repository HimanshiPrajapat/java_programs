public class function {
    public static void main(String[] args)
    {
        Fun objFun1 = new Fun();
        objFun1.noshowno();
        objFun1.noshowyes(10);
        int y=objFun1.yesshowno();
        System.out.println("Value of y is "+y);
        int add=objFun1.yesshowyes(10,20);
        System.out.println("Value of add is "+add);
    }
}
class Fun
{
    void noshowno()
    {
        System.out.println("Function with no return type and no parameter");
    }
    void noshowyes(int x)
    {
        System.out.println("Function with no return type and  parameter");
    }
    int yesshowno()
    {
        //System.out.println("Function with  return type and no parameter");
        int y=40;
        return y;
    }
    int yesshowyes(int a,int b)
{
    //System.out.println("Function with  return type and parameter");
    int z;
    z=a+b;
    return (z);
}
}