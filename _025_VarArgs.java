// Varargs- Aap ek function ko ek se zada arguments de skte h okey 


public class _025_VarArgs {

    // static int sum(int a, int b){
    //     return a+b;
    // }

    // static int sum(int a, int b,int c ){
    //     return a+b+c;
    // }

    // static int sum(int a, int b,int c ,int d){
    //     return a+b+c+d;
    // }
// YOu dont hav to make these all function here like this so just have to pass argument here like that 


static int sum(int x,int ...arr){
    // Available as int arr [];

    int result = x;
    for(int a: arr){
        result += a;
    }
    return result;

}



public static void main(String[] args) {
    
    System.out.println("Welcome to Varargs Tutorial");
    System.out.println("THe sum of 4 and 5 is : " + sum(0));
    System.out.println("THe sum of 4 and 5 is : " + sum(4,5));
    System.out.println("THe sum of 4, 3  and 5 is : " + sum(4,3,5));
    System.out.println("THe sum of 2,4, 3  and 5 is : " + sum(2,4,3,5));
    
}    
}
