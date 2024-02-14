import java.time.LocalDate;

class Employee1{ // base class, parent class, super
    private String name;
    private double salary;

    Employee1(String n, double s){
        name = n;
        salary = s;
    }

    Employee1(){
        name = " ";
        salary = 0.0;
    }

    public String getname(){
        return name;
    }

    public void setname(String n){
        name = n;
    }

    public double getsalary(){
        return salary;
    }

    public void setsalary(double s){
        salary = s;
    }

    public void raisesalary(double percent){
        salary += salary*percent/100;
    }

    public void displaydetails(){
        System.out.println(name +  " , " + salary);
    }

    public boolean equals(Object o){
        if (this == o){
            return true;
        }

        if (o == null){
            return false;
        }

        if (this.getClass() != o.getClass()){
            return false;
        }

        Employee1 e = (Employee1)o;

        return this.name.equals(e.name) && this.getsalary() == e.getsalary();
    }
}
public class ObjectClass {
    public static void main(String agrs[]){
        String s1 = "Ramesh";
        String s2 = "Ramesh";
        String s3 = new String("Ramesh");
        String s4 = new String("Ramesh");

        System.out.println(s1==s2);
        System.out.println(s3.equals(s4));

        Employee1 e1 = new Employee1("Rameshvarman", 13000);
        //e1.raisesalary(10);
        //System.out.println(e1.getsalary());
        Employee1 e2 = new Employee1("Rameshvarman", 13000);

        System.out.println(e1.equals(e2));


    }
}
