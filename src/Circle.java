public class Circle {
    public static int count ;
    public static double pi = 3.14 , sum;
    private int r ;
    public Circle (int r1) {
        this.r = r1;
       sum = r1 * r1 * pi ;
       count ++ ;
    }
    public void show () {
        System.out.println(sum);
    }
}
