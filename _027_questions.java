public class _027_questions {

    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }


    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static int fib(int n){
        /*if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }*/
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }


    public static void main(String[] args) {
        // Problem 1 
        // multiplication(7);

        // Problem 2 
        // pattern1(4);

        // Problem 3 
        // fibonacci series: 0,1,2,3,5,8,13,21,34
         
        // int result = fib(7);
        // System.out.println(result);



        // Problem 4 
        // Write a function to find average of a set of numbers passed as arguments 
        // do it by using varagrs 
        







    }



}
