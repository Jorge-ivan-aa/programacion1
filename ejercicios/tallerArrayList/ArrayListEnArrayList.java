import java.util.ArrayList;

public class ArrayListEnArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> lista = new ArrayList<>();
        ArrayList<Integer> vacio1 = new ArrayList<>();
        ArrayList<Integer> vacio2 = new ArrayList<>();
        ArrayList<Integer> vacio3 = new ArrayList<>();

        lista.add(vacio1);
        lista.add(vacio2);
        lista.add(vacio3);

        System.out.println("ArrayList: " + lista);
    }
}
