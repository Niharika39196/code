class Solution {
    public boolean isPalindrome(String s) {
       
       String a = s.toLowerCase();
       char[] arr = a.toCharArray();
       int left = 0;
       int right = arr.length - 1;

       while(left<right){
        if(Character.isLetterOrDigit(arr[left]) && Character.isLetterOrDigit(arr[right])){
            if(arr[left]==arr[right]){
                left++;
                right--;
            }else{
                return false;
                
            }
        }else if(!Character.isLetterOrDigit(arr[left])){
            left++;
        }else{
            right--;
        }
       }

       return true;
    }
}