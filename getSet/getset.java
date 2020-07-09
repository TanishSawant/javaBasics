package getSet;
/**
 * Innergetset
 */
class Student {
    private int rollno;
    private String name;
    
    public void getName(final String name) {
        this.name = name;
    }

    public void getRoll(final int roll) {
        this.rollno = roll;
    }

    public void setName() {
        System.out.println(this.name);
    }

    public void setRoll() {
        System.out.println(this.rollno);
    }
}

public class getset {
    public static void main(final String[] args) {
        final Student foo = new Student();
        foo.getName("Pablo");
        foo.getRoll(103);
        foo.setName();
        foo.setRoll();
    }
}