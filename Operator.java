public class Operator {
    public static void main(String[] arg)
    {
        Integer number=5;
        boolean res;
        if(res=number instanceof Integer)
        {
            System.out.println("number is an object of Integer. Hence:"+res);
        }
        else
        {
            System.out.println("number is not an object of Integer. Hence:"+res);
        }
    }
}
