public class controlstatmentWithMethod {
    public static void main(String[] args)
    {
        Details(25);
        Details(90);
        Details(65);

    }
    static void Details(int marks){
        if(marks<35)
          System.out.println("Fail");
        else if(marks>=35 && marks<65)
            System.out.println("B Grade");
        else if(marks>=65 && marks<75)
            System.out.println("A Grade");
        else if(marks>=75 && marks<100)
            System.out.println("O Grade");
        else
            System.out.println("Invalid marks entered");
    }
}
