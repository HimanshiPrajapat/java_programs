//Hybrid Inheritance
class Grandfather
{
    public void showG()
    {
        System.out.println("He is Grandfather.");
    }
}
//inherits Grandfather properties 
class Father extends Grandfather
{
    public void showF()
    {
        System.out.println("He is Father.");
    }
}
//inhertis father properties
class Son extends Father{
    public void showS()
    {
        System.out.println("He is Son.");
    }
}
public class Daughter extends Father{
    public void showD()
    {
        System.out.println("She is Daughter.");
    }

    public static void main(String args[])
    {
        Son objS=new Son();
        objS.showS();
        objS.showF();
        objS.showG();
        Daughter objD=new Daughter();
        objD.showD();
        objD.showF();
        objD.showG();
    }
}