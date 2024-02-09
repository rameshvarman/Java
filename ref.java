class rect {
    int length;
    int breadth;
    int height;


    rect(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    boolean isEqual(rect r){
        r.length++;
        if(length == r.length && breadth == r.breadth && height == r.height)
            return true;
        return false;
    }


}
public class ref { // passing by reference

    public static void main(String args[]){

        rect r1 = new rect(5, 6 ,7);
        System.out.println(r1.length);

        rect r2 = new rect(5, 6, 7);
        System.out.println((r1.isEqual(r2)));
        System.out.println(r2.length);
    }
}
