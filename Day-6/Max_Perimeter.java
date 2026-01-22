// Construct Non-Degenerate Triangle
// If there are several valid triangles having the maximum perimeter:

// Choose the one with the longest maximum side.
// If more than one has that maximum, choose from them the one with the longest minimum side.
// If more than one has that maximum as well, print any one them.

import java.util.*;

class Max_Perimeter {
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        Collections.sort(sticks);

        for (int i = sticks.size() - 1; i >= 2; i--) {
            int a = sticks.get(i - 2);
            int b = sticks.get(i - 1);
            int c = sticks.get(i);

            if (a + b > c) {
                return Arrays.asList(a, b, c);
            }
        }

        return Arrays.asList(-1);

    }

    public static void main(String[] args){

        List<Integer> al = maximumPerimeterTriangle(Arrays.asList(1,2,3,4,5,10));

        System.out.println(al);
    }
}
 
