class Solution {
    public int lengthOfLongestSubstring(String s) {
      char[] chars = s.toCharArray();
      if(s == null || s.equals("")){
        return 0;
      }
      HashSet<Character> currSet = new HashSet<>();
      int max = 1;

      for(int l=0,r=0;r<chars.length;r++){
      if(currSet.contains(chars[r])) {
            //determine length
            max = Math.max(max, currSet.size());
            while(chars[l] != chars[r]){
              currSet.remove(chars[l]);
              l++;
            }
            l++;
            //currSet.add(chars[l]);
            continue;
        } else if(r==chars.length-1) {
            //determine length
            currSet.add(chars[r]);
            max = Math.max(max, currSet.size());
        } else if(!currSet.contains(chars[r])){
            currSet.add(chars[r]);
        }
        
      }
      return max;
    }
}
