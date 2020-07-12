import java.util.LinkedList;

/**
 * linkedList
 */
public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> _losAnimales = new LinkedList<String>();
        _losAnimales.add("Perro");
        _losAnimales.add("Gata");
        _losAnimales.add("el loro");
        _losAnimales.add("el caballo");

        for (String i : _losAnimales) {
            System.out.println(i);
        }
        _losAnimales.removeLast();
        System.out.println(_losAnimales);
    }
}