public class _024_Method_Overloading {


    static void  tellJoke(){
    System.out.println("I invented a new world!");
    }

    static void change(int a){
        a=98;
    
    }
    static void change2(int arr []){
        arr[0] =98;
    
    }

    static void foo(){
        System.out.println("Good morning bro!");

    }

    static void foo(int a){
        System.out.println("Good morning" + a + "bro!");

    }

    public static void main(String[] args) {
        
        // tellJoke();

        // How to create object in java--- 
        // Calc obj = new Calc();
        // c= obj.sum(2,3);




    
        
        // Case 1: Changing the Integer 
        // int x = 45;
        // change(x);
        // System.out.println("The value of x after running change is: "+ x);
        
        
        
        // Case 1: Changing the array

        // NOTE: In case of arrays the reference is passed same is the case for object passing to methods.
        
        int marks[]= {52,73, 77,89,98,94};
        change2(marks);
        System.out.println("The value of x after running change is: "+ marks[0]);



        // METHOD OVERLOADING-- two or more methods can have same name but different parameters.Such methods are called overloaded methods. 



        // foo();
        // foo( 3000);

        // Arguments are actual! 
        
        

         





          




    }
}
