class Solution {
    public String largestOddNumber(String num) {
        while(num.length()>0){
            char last = num.charAt(num.length()-1);
            if(last%2!=0){
                return num;
            }else{
                num = num.substring(0, num.length()-1);
            }
        }
        return "";
    }
}