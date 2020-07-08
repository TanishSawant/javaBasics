class Calc1 {
    public int add(int ... i) {
        int sum = 0;
        for (int j : i) {
            sum = sum + j;
        }
        return sum;
    }
}

public class varargs {
    public static void main(String[] args) {
        Calc1 obj = new Calc1();
        System.out.println(obj.add(5, 3, 8, 4));
    }
}