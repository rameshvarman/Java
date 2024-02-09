public class MethodPrac {
    static int digit(int lenght, int breadth){
        int vol = lenght + breadth;
        return vol;

    }
    static void welcome() {
        System.out.println("Hi, User Welcome");
    }

    static boolean digit(int num){
        return num >= 10 && num <= 99;
    }

    public static void main(String args[]){
        welcome();
        System.out.println(digit(12,13));

        int num1 = 15;
        int num2 = 5;
        welcome();
        System.out.println("Your number is two digit number " + digit(num1));
        System.out.println("Your number is two digit number " + digit(num2));


    }
}
