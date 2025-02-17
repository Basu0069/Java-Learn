
class Cylinder{
    private int radius;
    private int height;


    public Cylinder(int radius,int height){
        this.radius= radius;
        this.height = height;
    }

    public int getRadius(){
        return radius;

    }

    public void setRadius(int radius){
        this.radius= radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height= height;
    }



    


    public double surfaceArea(){
        return 2*Math.PI *radius * radius + 2* Math.PI*radius*height;
    }

    public double volume(){
        return Math.PI*radius * radius*height;
    }



}



class  Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        this.length=4;
        this.breadth=5;
    }


    public Rectangle(int lenght, int breadth){
        this.length= lenght;
        this.breadth= breadth;

    }

    public int getLength(){
        return length;
    }


    public int getBreadth(){
        return breadth;
    }
}



public class _033_Questions {
    public static void main(String[] args) {

        
        // Problem 1 --> Create a class Cylinder and use getters and setters to set its radius and height.
        Cylinder myCylinder = new Cylinder(9, 12);
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

        

        // Problem 2
        // Do this again problem 1 by using constructor 

        // Problem 3 
        // overload a constructor used to intiailzw a rectangle of length 4 and breadth 5 for using custom paramters

        Rectangle r = new Rectangle();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());



    }
}
