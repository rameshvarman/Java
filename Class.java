import javax.xml.transform.stream.StreamSource;

class Box{
    int length; // instance variables
    int breadth;
    int height;

    static int boxcount;

    Box(int l, int b, int h){ //creating a constructor
        length = l;
        breadth = b;
        height = h;
        boxcount++;
    }

    static {
        System.out.println("from the static block");
        boxcount = 0;
    }
    Box(){
        length =-1;
        breadth = -1;
        height = -1;
        boxcount++;
    }

    Box(int l){
        length = breadth = height = l;
        boxcount++;
    }


    void setdime(int l, int b, int h){ //constructo
        this.length = l;
        this.breadth = b;
        this.height =h;

    }

    int volume(){
       return length * breadth * height;
    }

    int Surfacearea(){
        return length + height;
    }

    boolean isEqual(Box b){
        if(length == b.length && breadth == b.breadth && height == b.height)
            return true;
            return false;
    }

}

public class Class {

    public static void main (String args[]){

        Box blackbox = new Box(12, 15, 19); // creating an object
        blackbox.setdime(13,15,19);

        System.out.println("Blackbox volume is " + blackbox.volume()); // invoking method means calling by object
        System.out.println("Blackbox Surfaceare is " + blackbox.Surfacearea());

        Box woodenbox = new Box(14,12,15);

        System.out.println("Woodenbokx volume is " + woodenbox.volume());


        System.out.println(blackbox.length + woodenbox.length);

        Box b1 = new Box(13,15,19);
        Box b2 = new Box();
        System.out.println(b1.height);

        System.out.println("The blackbox is or equal to " + blackbox.isEqual(b1)); // passing an object as arument

        System.out.println(Box.boxcount);



    }
}
