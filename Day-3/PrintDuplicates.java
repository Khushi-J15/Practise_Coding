// WAP TO PRINT DUPLICATES Chars of a STRING [Space is also considered duplicate char]
import java.util.Map;
import java.util.HashMap;

class PrintDuplicates{

    public static void main(String[] args){

        String str = "avvvuiuibdcf";

        Map<Character, Integer> map = new HashMap<>();
        // calculating frequency
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        StringBuilder res = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(map.get(ch) > 1){
                res.append(ch); 
                map.put(ch, 0); // only one time use 
            }
        }

        System.out.println(res);
    }
}

// note : order is also preserved 

// output
// vui
