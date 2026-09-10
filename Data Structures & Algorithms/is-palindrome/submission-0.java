class Solution {
    /*
    Was it a car or a cat I saw?
    Was it a car or ?a cat I saw?
    */

    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int len = chars.length;
        //count the number of alpha numeric chars
        int actualI=0;
        int actualJ=0;
        for(int i=0,j=len-i-1;i<j;){
            char c = chars[i];
            if(!((c >= 'a' && c <= 'z') 
            ||(c >= 'A' && c <= 'Z')
            || (c >= '0' && c <= '9'))){
                i+=1;
                continue;
            }
            char d = chars[j];
            if(!((d >= 'a' && d <= 'z') 
            ||(d >= 'A' && d <= 'Z')
            || (d >= '0' && d <= '9'))){
                j-=1;
                continue;
            }
            actualI++;
            actualJ--;
            if(chars[i] != chars[j]){
                return false;
            }
            i++;
            j--;
        }
        if(actualJ-actualI>1){
            return false;
        }
        return true;
    }
}
