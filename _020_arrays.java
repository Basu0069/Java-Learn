public class _020_arrays {
    public static void main(String[] args) {
        // int marks []= {98,45,79,80,99};
        // float marks[]= {98.1f,45.2f,79.2f,99.7f,80.1f};
        // String students []={"Harry","Rohan","Shubham","Lovish"};

        
        // System.out.println(marks.length);
        // System.out.println(marks[2]);

        // System.out.println(students.length);
        // System.out.println(students[2]);


        int num []={98,56,23,12,10};

        System.out.println(num.length);
        

        // Displaying the array :
        System.out.println("Printing using for loop");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }



        // Displaying the array in reverse manner:
        System.out.println("Printing using for loop in reverse order");
        for(int i=num.length -1;i>=0;i--){
            System.out.println(num[i]);
        }


        // Displaying the array using for each loop manner:
        System.out.println("Printing using for each loop");
        for(int element: num){
            System.out.println(element);
        }


    }
}
