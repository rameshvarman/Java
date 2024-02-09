public class varargs {
    static int minvalue(int... vars) {
        int min = Integer.MAX_VALUE;
        System.out.println(min);
        for (int k : vars) {
            if (k < min)
                min = k;
        }
            return min;
        }

    public static void main(String args[]){
        int m = minvalue(5, 6, 9);
        System.out.println(m);


    }
}
