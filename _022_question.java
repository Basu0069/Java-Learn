public class _022_question {
    public static void main(String[] args) {
        
        Practice Problem 1 
Calculate the sum of float numbers

        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum=0;

        for(float element: marks){
            sum= sum+element;
        }
        System.out.println("The value of sum is "+ sum);
        
        
        Problem2 : Find if the element is present in the array or not 
        
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num=45.7f;
        boolean isInArray = false;
        for(float element: marks){
         if(num==element){
            isInArray= true;
            break;
         }
        }

        if(isInArray){
       System.out.println("The value of sum is present in the array");
        }
        else{
            System.out.println("the value is no present in the array");
        }



    Practice Problem 3 
        Create a program for add two matrices of size 2*3 

        int [][] mat1 = { {1, 2, 3},
                          {4, 5, 6}};
        
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};

        int [][]result= {{0, 0, 0},
                        {0, 0, 0}};
        
    for(int i=0;i<mat1.length;i++){ // row number of times 
    for(int j=0;j<mat1[i].length;j++){ // column number of time 
        System.out.printf("Setting value for i= %d and j= %d\n", i, j);
        result[i][j]= mat1[i][j] + mat2[i][j];
    }
        System.out.println("");

}  
 Printing the elements of a 2-d array 

    for(int i=0;i<mat1.length;i++){ // row number of times 
    for(int j=0;j<mat1[i].length;j++){ // column number of time 
        // System.out.printf("Setting value for i= %d and j= %d\n", i, j);
        System.out.print(result[i][j]+ " ");
        result[i][j]= mat1[i][j] + mat2[i][j];
    }
        System.out.println("");

    }

    

    Practice Problem 5 
    int [] arr = {1, 2, 3, 4, 5, 6};
    int l= arr.length;
    int n= Math.floorDiv(l,2);
    int temp;
    for(int i=0;i<n;i++){
        // Swap a[i] and a[l-1-i]
        // |3| |4| ||
        
        temp= arr[i];
        arr[i]= arr[l-i-1];
        arr[l-i-1]= temp;   
    }
    for(int element: arr){
        System.out.println(element + " ");
    }


    Write a program to find the maximum element in an array 

        Practice Problem 6 
    int [] arr = {1,-2100 ,-3, 455, 5, 34, 67 };
    int max= Integer.MIN_VALUE;
    for(int e: arr){
        if(e>max){
            max=e;
        }
    }
    System.out.println("The value of the maximum element is this array is :"+ max);
    


    Practice Problem 6 
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.MAX_VALUE);
     

    Practice Problem 7 
    boolean isSorted= true; 
    int [] arr= {1,2,3,5,6,7,8};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                isSorted= false;
                break;

            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
             System.out.println("The Array is unsorted");
        }



    }
}
