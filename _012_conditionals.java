public class _012_conditionals {
    public static void main(String[] args) {
        
        int age = 18;
        boolean cond = (age==18);

        if(cond){
            System.out.println("Yes boy you can drive!");
        }
        else{
            System.out.println("No boy you cannot drive yet!");

        }


        boolean a = true;
        boolean b = false;

        // if(a && b){
        //     System.out.println("Y");
        // }
        // else{
        //     System.out.println("N");
        // }

        // System.out.println("For Logical OR");

        // if (a || b){
        //     System.out.println("Y");
        // }
        // else{
        //     System.out.println("N");
        // }




        System.out.println("For Logical Not");
        System.out.print("Not(a) is" );
        System.out.println(!a);
        System.out.println("Not(b) is ");
        System.out.println(!b);
        

    }
}
