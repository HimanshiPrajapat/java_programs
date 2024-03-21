public class local_var {
    public void local_variable()
    {
        String name="Jack";
        int marks=90;
        System.out.println(name+" Scored"+" marks "+marks+"%");
    }
    //local variables can't be accessed outside the method or constructor
    //public void notlocal_variable()
   // {
    //    System.out.println(name+" Scored"+" marks "+marks+"%");
    //}
    public static void main(String[] arg)
    {
        local_var vt=new local_var();
        vt.local_variable();//notlocal_variable()
    }
}
