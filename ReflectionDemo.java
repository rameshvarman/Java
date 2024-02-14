import java.lang.reflect.*;

public class ReflectionDemo {
    public static void main(String args[]){

        Employee1 e = new Employee1("Raj", 62000);

        Class cls = e.getClass();

        System.out.println(cls.getname());



    }
}
