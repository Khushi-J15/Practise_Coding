class Reverse {

    public static void main(String[] args){
        String str = "Think Twice";

        // REVERSING WHILE PRESERVING THE POSITION
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        String[] arr = {""};
    
        for(int i=0; i<n; i++){
            arr = str.split(" ");
        }

        // arr[0] = Think , arr[1] = Twice ...

        for(int i=0; i<arr.length; i++){
            String temp = reverse(arr[i]);
            sb.append(temp);
            if(i == arr.length - 1) continue;
            sb.append(" ");
        }

        System.out.println(sb);
    }

    public static String reverse(String temp){

        StringBuilder res = new StringBuilder(temp);
        return res.reverse().toString();

    }
}

// knihT eciwT
