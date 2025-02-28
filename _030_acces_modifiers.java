

class MyEmployee{
    private int id;
    private String name;

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

public class _030_acces_modifiers {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();

        // harry.id=45;
        // harry.name="CodewithHarry";--> throws and error due ot private access modifier 
        // you cannt acces private from it 



        // Ye isliye use krte h taki proper name ke andar name jaaye aur i
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());

        
        

    }
    
}



