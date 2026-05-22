// Shortest Distance to Traget String in a Circular Array
import java.util.*;

class Q78th{
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int d = Math.abs(i - startIndex);
                int circularDist = Math.min(d, n - d);
                minDist = Math.min(minDist, circularDist);
            }
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}
