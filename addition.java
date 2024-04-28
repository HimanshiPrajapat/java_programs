import java.util.Scanner;

public class addition {
    public  static void main(String[] args)
    {
int ch;
        int X;
        float Y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice: 1-Addition, 2-Subtraction, 3-Multiplication ,4-Division");
         ch=sc.nextInt();
        X=sc.nextInt();
        Y=sc.nextFloat();

        Q objQ= new Q();
        objQ.add(X,Y);
        /*switch(ch)
        {case 1:
        {


            objQ.add(X,Y);
            break;
        }
        case 2:
        {


            objQ.sub(X,Y);
            break;
        }
        }*/
}
}
class Q {

    void add(int c, float d) {
        System.out.println(c + d);
    }

   // void sub(int c, float d) {
    //    System.out.println(c - d);
   // }
}
