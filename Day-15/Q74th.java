import java.util.*;

public class Q74th {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(1);

        // Step 1: Sort in ascending
        Collections.sort(list);

        // Step 2: Reverse to get descending
        Collections.reverse(list);

        System.out.println("Descending (Sort + Reverse): " + list);
    }
}
