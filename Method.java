public class Method {
    // Methods carried out specifc task
    // Method is a block of code it only runs when it is call
    // method getting inputs as parameters
    static int boxVolume(int length, int breadth, int height){ // method definition
        int vol;
        vol = length + breadth + height;
        return vol;
    }

    static void printline(){
        System.out.println("----------------------------");
    }
    public static void main(String args[]){
        printline();
        System.out.println( "The volume is " + boxVolume(12,15,11)); // passing arguments
        printline();


    }
}
