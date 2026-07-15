class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sorted = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            sorted[i] = String.valueOf(chars);
        }

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : sorted) {
            map.put(str, new ArrayList<>());
        }

        for (int i = 0; i < strs.length; i++) {
            if (isAnagram(strs[i], sorted[i])) {
                map.get(sorted[i]).add(strs[i]);
            }
        }

        List<List<String>> res = new ArrayList<>();
        for (List<String> entry : map.values()) {
            res.add(entry);
        } 

        return res;
    }

    private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }

        return true;
    }
}
