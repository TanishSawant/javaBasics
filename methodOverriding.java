class A1 {
    public void show() {
        System.out.println("In A");
    }
}

/**
 * B
 */
class B1 extends A1{
    @Override
    public void show() {
        System.out.println("In B");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        B1 obj = new B1();
        obj.show();
    }
}