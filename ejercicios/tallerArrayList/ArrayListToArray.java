import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("cadena");
        lista.add("cadena");
        lista.add("cadena");

        System.out.println("ArrayList: " + lista);
        String[] arreglo = lista.toArray(new String[lista.size()]);
        System.out.println("Array: " + arreglo);
    }
}
