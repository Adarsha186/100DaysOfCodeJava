class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int st=0,max=0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(st));
                st++;
            }
            set.add(s.charAt(i));
            if(i-st+1>max){max=i-st+1;}
        }
        return max;
    }
}