class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer>map = new HashMap<>();
        int[] arr2 = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            arr2[i] = arr[i];
        }

        Arrays.sort(arr2);
        int ans[] = new int[arr.length];
        int rank = 1;
        for(int i=0; i<arr.length; i++){
             if(!map.containsKey(arr2[i])){
                map.put(arr2[i], rank);
                rank++;
             }
        }

        for(int i=0; i<arr.length; i++){
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}