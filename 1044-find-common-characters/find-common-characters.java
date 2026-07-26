class Solution {
    public List<String> commonChars(String[] words) {

        List<String> list = new ArrayList<>();

        String start = words[0];

        // Go through each character of the first word
        for (int i = 0; i < start.length(); i++) {

            char ch = start.charAt(i);
            boolean common = true;

            // Check if the character exists in every other word
            for (int j = 1; j < words.length; j++) {

                int index = words[j].indexOf(ch);

                if (index == -1) {
                    common = false;
                    break;
                }

                // Remove the matched character so it cannot be used again
                words[j] = words[j].substring(0, index)
                         + words[j].substring(index + 1);
            }

            if (common) {
                list.add("" + ch);
            }
        }

        return list;
    }
}