class Solution {

    public String encode(List<String> strs) {
        if (strs.size() == 0) {
            return new String();
        }
        StringBuilder res = new StringBuilder();
        for (String str : strs) {
            int size = str.length();
            res.append(size).append("#").append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> resList = new ArrayList<>();
        for (int i = 0; i < str.length(); ) {
            int j = i;
            while (str.charAt(j) != '#') j++;
            int len = Integer.parseInt(str.substring(i, j));
            i = j + 1; 
            j = i + len;
            resList.add(str.substring(i, j));
            i = j;
        }
        return resList;
    }
}
