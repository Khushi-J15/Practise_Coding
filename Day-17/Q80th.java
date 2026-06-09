// Words Within Two Edits of Dictionary.

class Q80th {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> res = new ArrayList<>();

        for(String query : queries){
            if(hasMatch(query, dictionary)){
                res.add(query);
            }
        }

        return res;
    }

    boolean hasMatch(String query, String[] dictionary){
        boolean found = false;

        for(String dict : dictionary){
            int diff = 0;

            for(int j=0; j<dict.length(); j++){
                if(dict.charAt(j) != query.charAt(j)){
                    diff++;
                }
                if (diff > 2) break;
            }

            if (diff <= 2) {
                return true;
            }

        }

        return found;
    }
}

// Input: queries = ["word","note","ants","wood"], dictionary = ["wood","joke","moat"]
// Output: ["word","note","wood"]
