class Solution {
    public int[] listToArray(ArrayList<Integer> list) {
        int[] res = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }

    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            for (Integer num : nums) {
                list.add(num);
            }
        }

        return listToArray(list);
    }
}