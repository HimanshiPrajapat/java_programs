import java.util.Scanner;
public class scanner_input {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name,Roll no,Marks,Grade");
        String name=sc.nextLine();  //used to read line
        int RollNo =sc.nextInt();   //used to read int
        double Marks=sc.nextDouble();  //used to read double
        char Grade=sc.next().charAt(0); // used to read till space

        System.out.println("Name:"+name);
        System.out.println("RollNo:"+RollNo);
        System.out.println("Marks:"+Marks);
        System.out.println("Grade:"+Grade);

        sc.close();
    }
}
