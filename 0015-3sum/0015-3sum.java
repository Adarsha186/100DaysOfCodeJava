class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3){
            return new ArrayList<>();
        }
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        HashSet<List<Integer>> s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum  = nums[i]+nums[j];
                if(m.containsKey(-sum)){
                    int x = m.get(-sum);
                    if(x!=i && x!=j){
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[x]); l.add(nums[i]); l.add(nums[j]);
                        Collections.sort(l);
                        s.add(l);
                    }
                }
            }
        }
        return new ArrayList<>(s);
    }
}