// Jab bhi adjacent same characters milen → delete both
// Adjacent removal → Stack approach

import java.util.*;

public class Adjacent{

    static String superReducedString(String s) {
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = stack.length();

            if (len > 0 && stack.charAt(len - 1) == c) {
                stack.deleteCharAt(len - 1); // remove matching pair
            } else {
                stack.append(c);
            }
        }

        return stack.length() == 0 ? "Empty String" : stack.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();   // input string
        System.out.println(superReducedString(s));

        sc.close();
    }
}
