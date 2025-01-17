
// import java.util.Scanner;
// public class _004_takinginput {
//     public static void main(String[] args) {
//         System.out.println("Taking input from the user ");
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number 1");
//         // int a = sc.nextInt();
//         float a = sc.nextFloat();
//         System.out.println("Enter number 2");
//         // int b= sc.nextInt();
//         float b = sc.nextFloat();
//         // int sum= a+b;
//         float sum = a+b;

//         System.out.println("The sum of these numbers is");
//         System.out.println(sum);

//     }
    
// }

import java.util.Scanner;

public class _004_takinginput{

    public static void main(String[] args) {
        
        System.out.println("Taking input from the user");
        Scanner sc= new Scanner(System.in);

        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);

        // String str = sc.next();
        // ye sc next tera bs starting ke ek word ko hi lega okay puri line ko ni lega...
        String str = sc.nextLine();
        System.out.println(str);


    }
}


