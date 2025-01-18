import java.util.Scanner;
public class _005_percentage {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter subject one marks");
        float a = sc.nextFloat();
    System.out.println("Enter subject two marks");
        float b = sc.nextFloat();
    System.out.println("Enter subject three marks");
    float c = sc.nextFloat();
    System.out.println("Enter subject four marks");
        float d = sc.nextFloat();
    System.out.println("Enter subject five marks");
        float e = sc.nextFloat();

        float sum= a+b+c+d+e;
        float p= (sum/500)*100;
        System.out.println(p);
    }
}