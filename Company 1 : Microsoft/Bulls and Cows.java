class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i) != guess.charAt(i)){
                 if(hm.containsKey(secret.charAt(i))){
                    hm.put(secret.charAt(i), hm.get(secret.charAt(i))+1);
                }else{
                    hm.put(secret.charAt(i), 1);
                }
            }
        }

        for(int i=0; i<guess.length(); i++){
            if(guess.charAt(i)==secret.charAt(i)){
                bull++;
            }
            else if(hm.containsKey(guess.charAt(i)) && hm.get(guess.charAt(i))>0){
                        cow++;
                        hm.put(guess.charAt(i), hm.get(guess.charAt(i))-1);
            }
        }
        String ans = bull + "A" + cow + "B";
        return ans;
    }
}
