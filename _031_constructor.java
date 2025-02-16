

class MyEmployee{
    private int id;
    private String name;


    // Aap log constructor ke sath bi method overload kr skte ho 
    public MyEmployee(){
        id= 45;
        name = "Your-Name-Here";
    }
    // Ye constructor automatically invoke ho jata h



    // U can do it with passing parameters too see 
    public MyEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }

    public MyEmployee(String myName){
        id = 1;
        name = myName;
    }


    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name =n;
    }

    public void setId(int i){
        this.id= i;
    }


    public int getId(){
        return id;
    }
}

public class _031_constructor {
    public static void main(String[] args) {
        
        // MyEmployee harry = new MyEmployee("Basu",12);
        MyEmployee harry = new MyEmployee();
        // harry.setName("CodeWithHarry");
        // harry.setId(21);
        // Ab ham baar baar thodi na setname vgera likhte rhege toh we will create constructor. 
        // a member function used to intitalize an object while creating it. 

        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
