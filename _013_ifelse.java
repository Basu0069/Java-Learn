import java.util.Scanner;

public class _013_ifelse {
    public static void main(String[] args) {
        
        int age;
        System.out.println("Enter your age");

        Scanner sc = new Scanner(System.in);
        age= sc.nextInt();


        switch(age){
            case 18:
            System.out.println("You are going to become an Adult");
            break;

            case 23:
            System.out.println("You are going to join a Job!");
            break;

            case 60:
            System.out.println("You are going to get retired!");
            break;
            
            default:
            System.out.println("Enjoy Your life!");
            break;

            }




        /* 
        if(age>56){
            System.out.println("Your are experienced!");
        }
        else if (age>46){
            System.out.println("You are semi - experienced");
        }
        else if(age>36){
            System.out.println("You are semi- semi experienced");
        }
        else{
            System.out.println("You are not experienced");
        }
            if(age>2){
            System.out.println("You are not a baby!");
            }

        */



    }
}
