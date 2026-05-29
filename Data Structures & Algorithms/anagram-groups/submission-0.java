class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            int[] arr = new int[26];
            //fill char array for key
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                arr[ch - 'a']++; 
            }

            String key = Arrays.toString(arr);
            map.computeIfAbsent(key, list -> new ArrayList<>()).add(str);
        }

        return map.values().stream().collect(Collectors.toList());
    }
}
