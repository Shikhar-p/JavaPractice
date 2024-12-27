public class Child extends Parent{
    public Child() {
        this("Constructor");
        System.out.println("Child Class Default Constructor");
    }
    public Child(String s) {
        System.out.println("Child Class Param Constructor " + s);
    }
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
