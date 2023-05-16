package ClassAndObject.ObjectChange;


public class MyClass implements MyInterface {
    public void show() {
        System.out.println("This is MyClass.");
    }
    public static void main(String[] args) {
//        MyInterface myObj = new MyClass();
//        myObj.show(); // 输出: "This is MyClass."
        MyClass my = new MyClass();
        MyInterface adi = my;
        adi.show();
    }
}

