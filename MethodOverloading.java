public class MethodOverloading {
    static int max(int a, int b){
        return a > b?a:b;
    }

    static double max(double a, double b){
        return a >b ? a: b;
    }
    public static void main(String args[]){
        System.out.println(max(5,8));
        System.out.println(max(5.71,6.2));
    }
}
