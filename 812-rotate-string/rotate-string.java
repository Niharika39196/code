class Solution {
    public boolean rotateString(String s, String goal) {
        /*if(s.equals(goal)){
            return true;
        }

        if(s.length() != goal.length()){
            return false;
        }

        char[] arr = s.toCharArray();
        int n = arr.length ;

        for(int j=0; j<n; j++){
            char temp = arr[0];
            for(int i = 0; i < n - 1; i++){
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = temp;
            if (new String(arr).equals(goal)) {
                return true;
            }
        }
        
        
        
        return false; */

     String a = "";
     if(s.length()!= goal.length()){
        return false;
     }else{
        a = s + s;
     }

     if(a.contains(goal)){
        return true;
     }else{
        return false;
     }
    }
}