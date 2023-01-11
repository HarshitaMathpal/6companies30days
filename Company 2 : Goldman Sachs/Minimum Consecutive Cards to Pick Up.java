class Solution {
    public int minimumCardPickup(int[] cards) {
        int count = Integer.MAX_VALUE;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<cards.length;i++){
            if(hm.containsKey(cards[i])){
                int previndx = hm.get(cards[i]);
                count = Math.min(count,(i-previndx+1));
            }
                hm.put(cards[i],i);
        }
        return count == Integer.MAX_VALUE ? -1 : count;
    }
}
