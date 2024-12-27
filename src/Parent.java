public class Parent {
    public Parent(){
        this("constructor");
        System.out.println("Parent Class Default Constructor");
        
    }

    public Parent(String s) {
        System.out.println("Parent Class Param  " + s);
    }
}
