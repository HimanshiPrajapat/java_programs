public class ElseIfJava {
    public static void main(String[] args)
    {
        String name[]={"Mohan","Rohan","Sohan"};
         int Roll[]={25,36,71};
         if(name[0]=="Mohan" && Roll[1]==25)
             System.out.println("Details of Mohan");
         else if (name[2]=="Rohan" && Roll[1]==36)
             System.out.println("Details of Sohan");
         else if(name[2]=="Sohan" && Roll[2]==71)
             System.out.println("Details of Sohan");
         else
             System.out.println("Invalid Details");
    }
}
