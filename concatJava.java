public class concatJava {
    public static void main(String[] args)
    {
        char []name ={'J','a','c','k'};
        String welcomeMsg= new String(name);
        String fname,lname;
        fname="Ram";
        lname=" Sharma";
        System.out.println("Welcome " + welcomeMsg);
        //System.out.println(fname+" "+lname);
        System.out.println(fname.concat(lname));
    }
}
