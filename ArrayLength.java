public class ArrayLength {
    public  static void main(String[] args)
    {
        String[] cities={"Delhi","Mumbai","Lucknow","Pune","Chennai"};
        int[] numbers={25,93,48,95,74,63,87,11,36};
        System.out.println("Number of cities:"+cities.length);
        System.out.println("Length of Num List:"+numbers.length);
        System.out.println(cities[2]);
        System.out.println(numbers[6]);
        cities[1]="Bangalore";
        System.out.println(cities[1]);
    }
}
