class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

      List<Map.Entry<Integer,Integer>> ent= new ArrayList<>(mp.entrySet());
      ent.sort((a,b)->b.getValue()-a.getValue());

      int[] arr=new int[k];
         for(int i=0;i<k;i++){
            arr[i]=ent.get(i).getKey();
         }
         return arr;
    }
}
