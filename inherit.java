/**
 * A
 */
class A {

    int a;

    void geta(){
        System.out.println(this.a);
    }
}

/**
 * B
 */
class B extends A{
    int b;

    void getb(){
        System.out.println(this.b);
    }
    
    void add(){
        System.out.println(this.a + this.b);
    }
}

public class inherit {
    public static void main(String[] args) {
        B aObject = new B();
        
        aObject.a = 5;
        aObject.b = 10;

        aObject.add();
    }
}