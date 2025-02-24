
// Verb--->Methods-->getSalary(),increment()

// Oops terminlogy 
// 1.Abstraction - > Hiding internal details 
// 2.Encapsulation-> The act of putting various components together(in a capsule).
// 3.Inheritance->The act of deriving new things from existing things 
// 4. Polymorphism- one entity many forms 

//  ek java file mei bs ek public file ho skti h bs okay 

class Employee{
    int id;    //attribute 1
    String name;   //attribute 2 

    int salary;

    
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);

    }

    public int getSalary(){
        return salary;
    }
}

public class _028_Custom_CLass{
    public static void main(String[] args) {
    System.out.println("This is our custom class");

    Employee harry = new Employee(); // Instantiating a new Employee Object 
    Employee john = new Employee();  

    
    harry.id=12;
    harry.salary=344;
    harry.name="CodewithHarry";

    john.id=17;
    john.salary=500;
    john.name="John Khdnaerwah";

    john.printDetails();
    harry.printDetails();
    // System.out.println(harry.id);
    // System.out.println(harry.name);

    int salary= john.getSalary();
        System.out.println(salary);
    }
}















