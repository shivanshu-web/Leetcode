class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int count = ransomNote.length();
        int count1 = magazine.length();

        if(count>count1){
            return false;
        }

        HashMap<Character , Integer> map1 = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>();
       
        for(int i = 0; i<count;i++){
            char cha = ransomNote.charAt(i);
            map1.put(cha,map1.getOrDefault(cha,0)+1);

        }

        for(int i = 0; i<count1;i++){
            char ch = magazine.charAt(i);
             map2.put(ch,map2.getOrDefault(ch,0)+1);
            
        }

        for(int i = 0; i<count;i++){
            char ch = ransomNote.charAt(i);
            if(map2.containsKey(ch)){
                int val = map1.get(ch);
                if(map2.get(ch)<val){
                    return false;
                }

            }else{
                return false;
            }
        }

        return true;



        



        
    }
}