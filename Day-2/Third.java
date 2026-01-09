import java.util.*;

class Third {
    public static void main(String[] args){
        String s = "(((8) + ((9 + 90)))";
        System.out.println("The Max Depth of the paranthesis is : " + maxDepth(s));
    }

    public static int maxDepth(String s){

        int ans = 0;
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(') st.push(ch);
            else if(ch == ')') st.pop();

            ans = Math.max(ans, st.size());
        }

        return ans;
    }
}
