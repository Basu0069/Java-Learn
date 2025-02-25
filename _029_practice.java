

class Employee{
     int salary;
     String name;


     public int getSalary(){
        return salary;

     }

     public String getName(){
        return name;
     }

     public void setName(String n){
        name = n;
     }
}


class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating");
    }
    public void callFriend(){
        System.out.println("Calling mukul...");
    }


}

class Square{
    int side;

    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
        
    }
    public void fire(){
        System.out.println("Firing on the enemy");

    }
}

public class _029_practice {
    public static void main(String[] args) {
        
        // Porblem 1 
        // Create a class employee with following properties and methods 
        //  * salary(property)(int)
        //  * getSalary(method returning int)
        //  * name(property)(string)
        //  * getName(method returning string)
        //  * setName(method changing name)
         

        //  Employee harry = new Employee();
        //  harry.setName("CodewithHarry");
        //  harry.salary= 233;
        //  System.out.println(harry.getSalary());
        //  System.out.println(harry.getName());


        //  Problem 2
        // Create a class cellphone with methods to print " ringing..", "vibrating"..,etc.
        // CellPhone asus= new CellPhone();
        // asus.callFriend();
        // asus.vibrate();
        // asus.ring();



        // Problem 3
        // Create a class square with a method to initialize its side, calculasting area,perimeter etc;


        // Square sq= new Square();
        // sq.side= 3;
        // System.out.println(sq.area());
        // System.out.println(sq.perimeter());



        // Problem 4
        // Create a class TOmmy Vecetti for rockstar games capable of hittin(print hitting), running , firing, etc.

        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();






    }
}
