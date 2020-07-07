public class array {
    public static void main(String[] args) {
        int a[] = {5, 3, 9, 2};
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println(findGreatest(a));
    }

    public static int findGreatest(int a[]) {
        int gr = 0;

        for (int i : a) {
            if (i>gr) {
                gr = i;
            }
        }
        return gr;
    }
}