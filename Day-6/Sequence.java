import java.util.*;

// Sequence Equation : pehle dekhte hain i kahan pada hai,
// phir us position par jo number aata hai uska index nikaalte hain.

class Sequence {
    public static List<Integer> permutationEquation(List<Integer> p) {
        List<Integer> al = new ArrayList<>();

        // 1 based indexing is used thats'why x+1 ans ans+1
        
        for(int i=1; i<=p.size(); i++){
            int x = p.indexOf(i); // pehle dekhte hain index i kahan pada hai 'p' list me and getting its index
            int ans = p.indexOf(x+1); // repeat above step firse x index number dhundo 'p' list me and get its index, this index + 1 is the current ans at this iteration.
            al.add(ans + 1);
        }
        
        return al;

    }

    public static void main(String[] args){
        List<Integer> ans = permutationEquation(Arrays.asList(5,2,1,3,4));

        System.out.println(ans);
    }

}

// o/p : [4, 2, 5, 1, 3]
