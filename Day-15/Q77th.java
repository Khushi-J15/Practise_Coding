import java.util.*;
public class Q77th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s="";
        char[] dic = {'A','a','E','e','I','i','O','o','U','u'};
        for (int i = 0; i < str.length(); i++) {
            int c = 0;
            for (int j = 0; j < dic.length; j++) {
                if(str.charAt(i)==dic[j])
                {
                    c++;
                }
            }
            if(c==0)
            {
                s = s + str.charAt(i);
            }
        }
        System.out.println(s);
    }
}
