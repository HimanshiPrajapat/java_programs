import java.io.File;
public class DeleteFile {
    public static void main(String[] args)
    {
        File file=new File("candidate2.txt");
        if(file.delete())
        {
            System.out.println("Deleted Successfully:"+file.getName());
        }
        else
        {
            System.out.println("Error.....");
        }
    }
}
