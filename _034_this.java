

class EkClass{
    int a;

    public int getA(){
        return a;
    }


    EkClass(int a){
        this.a= a;  // refer kr rhe h is object ki a ko value ko !!

    }
    // This is a way for us to referecne an object of the class which is being create preferenced 
    // reference to current object 

    public int returnone(){
        return 1;

    }
}

public class _034_this {
    public static void main(String[] args) {
        EkClass e = new EkClass(5);
        System.out.println(e.getA());

    }
}
