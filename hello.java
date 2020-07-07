class Calc {
    float num1;
    float num2;
    float res;

    public void add() {
        System.out.println("Adding.....");
        
        res = this.num1 + this.num2;
    }

    public Calc() {
        this.num1 = 5;
        this.num2 = 5;
    }
}

class QuickStart {
    public static void main(String[] args) {
        System.out.println("Hello, World.");
        Calc obj = new Calc();
        obj.add();
        System.out.println(obj.res);
    }
    
}
