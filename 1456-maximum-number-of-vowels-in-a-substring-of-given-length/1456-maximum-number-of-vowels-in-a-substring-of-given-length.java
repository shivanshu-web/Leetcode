class Solution {
    public int maxVowels(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('e',1);
        map.put('i',1);
        map.put('o',1);
        map.put('u',1);
        int count = 0;

        for(int i=0;i<k;i++){
            if(map.containsKey(s.charAt(i))){
                count++;
            }


        }

        int tempC = count;
        int left = 0;
        int right = k-1;
        while(right<s.length()-1){
            if(map.containsKey(s.charAt(right+1))){
                tempC++;
            }
            if(map.containsKey(s.charAt(left))){
                tempC--;
            }
            count = Math.max(count,tempC);
            right++;
            left++;

        }

        return count;


        
    }
}