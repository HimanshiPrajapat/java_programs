//static variable is same as instance var except the 'static' keyword it is declared inside the class but outside a method or constructor
public class static_var {
    //if static variable not declared static it will give error
    public static String name;
    public static int marks;
    public static void main(String[] arg)
    {
        name="jack";
        marks=90;
        System.out.println(name+" Scored"+" marks "+marks+"%");
    }
}
