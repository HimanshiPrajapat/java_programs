public class instance_var {
    String name = "Jack";
    int marks = 90;

    public void instance_variable() {
        System.out.println(name + " Scored" + " marks " + marks + "%");
    }

    public static void main(String[] arg) {
        instance_var vt = new instance_var();
        vt.instance_variable();
    }

}