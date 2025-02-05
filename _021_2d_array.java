public class _021_2d_array {
    public static void main(String[] args) {
     
        int marks [][]; // A 2-D Array 


        marks = new int [2][3];
        marks[0][0]= 101;
        marks[0][1]=102;
        marks[0][2]=103;
        marks[1][0]= 201;
        marks[1][1]=202;
        marks[1][2]=203;


// Displaying the array(for loop)
System.out.println("Printing using for loop");

for(int i=0;i<marks.length;i++){
    for(int j=0;j<marks[i].length;j++){
    System.out.print(marks[i][j]);
    System.out.print(" ");
    }
    System.out.println("");
}



// if u want to create 3d array then u can make it like this 
// String[][][] arr= new String[2][3][4];

        
    }
}
