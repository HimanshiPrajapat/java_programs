import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
    public static void main(String[] args)
    {
        try{
            FileWriter file=new FileWriter("candidate2.txt");
            file.write("This file has information of candidate\n");
            file.write("Name: Joy Fex, Age: 25\n");
            file.write("Name: Rajesh Mehta, Age: 22\n");
            file.close();
            System.out.println("File has been written into.");
        }
        catch(IOException e){
            System.out.println("Error...");
            e.printStackTrace();
        }
    }
}
