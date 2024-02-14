class A{
    void display(){
        System.out.println("From Class A");
    }
}

class B extends A{
    void display(){
        System.out.println("From Class B");
    }
}

class C extends A{
    void display(){
        System.out.println("From Class C");
    }
}

class D extends A{

}


public class MultipleInheritance {
    public static void main(String args[]){

       /* B b = new B();
        C c = new C();

        b.display();
        c.display();

        */

        D d = new D();
        d.display();

    }
}
