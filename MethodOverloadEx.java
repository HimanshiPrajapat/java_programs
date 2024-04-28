public class MethodOverloadEx {
    public static void main(String[] args)
    {
        Details("Raj",85);
        Details("Rohan",93.9);
    }
    static  void Details(String name,int marks)
    {
        System.out.println("Welcome "+name);
        System.out.println("You got "+ marks+" marks in exam.");
    }
    static  void Details(String name,double marks)
    {
        System.out.println("Welcome -"+name);
        System.out.println("You got "+ marks+" marks in exam.");
    }
}
