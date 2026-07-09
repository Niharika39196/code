class Solution {
    public String longestCommonPrefix(String[] strs) {

        String s = "";

        for (int i = 0; i < strs[0].length(); i++) {

            char index = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length() || index != strs[j].charAt(i)) {
                    return s;
                }
            }

            s += index;
        }

        return s;
    }
}