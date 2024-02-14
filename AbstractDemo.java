abstract class member {
    String massge;

    abstract void welcomemessage();

}

class Student extends member{
    void welcomemessage(){
        System.out.println("Hello Studnet");
    }

}

class Teacher extends member{
    void welcomemessage(){
        System.out.println("Hello Teacher");
    }

}


public class AbstractDemo {
    public static void main (String args[]){

        Student s1 = new Student();
        Teacher t1 = new Teacher();

        member[] m = new member[4];
        m[0] = new Student();
        m[1] = new Teacher();
        m[2] = new Teacher();
        m[3] = new Student();

        s1.welcomemessage();

        for(member Member:m){
            Member.welcomemessage();
        }

    }
}
