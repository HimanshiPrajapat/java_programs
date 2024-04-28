public class Example1 {

        //final String name="Rajesh";
        String name="Rajesh";
        //final int age=20;//By "final" keyword we will not be able to override
        int age=20;

        public static void main(String[] args)
        {
            Example1 ex=new Example1();
            ex.name="Sanjay";
            ex.age=25;
            System.out.println("Name: "+ex.name);
            System.out.println("Age: "+ex.age);
        }
    }



