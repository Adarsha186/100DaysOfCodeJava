class Solution {
    public boolean wordPattern(String pattern, String s) {
        String st[] = s.split(" ");
        if(pattern.length()!=st.length){return false;}
        HashMap<Character,String> h = new HashMap<>();
        Set<String> hs = new HashSet<>();
        for(int i=0;i<st.length;i++){
            char x = pattern.charAt(i);
            if(h.containsKey(x)){
                if(!st[i].equals(h.get(x))){
                    return false;
                }
            }
            else{
                if(hs.contains(st[i])){
                    return false;
                }
                h.put(x,st[i]);
                hs.add(st[i]);
            }
        }
        return true;
    }
}