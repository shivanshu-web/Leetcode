// class Solution {
//     public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
//         HashMap<Integer,Integer> map = new HashMap<>();
        
//         map.put(1,0);
//         map.put(2,31);
//         map.put(3,59);
//         map.put(4,90);
//         map.put(5,120);
//         map.put(6,151);
//         map.put(7,181);
//         map.put(8,212);
//         map.put(9,243);
//         map.put(10,273);
//         map.put(11,304);
//         map.put(12,334);
//         int AliceEnd = 0;
//         int BobArive =0;
//         String monthA ="" ;
//         String dayA ="";
//         String dayB = "";
                
//         String monthB = "";
//         int AR = 0;
//         int Bl = 0;
//         String Arm = "";
//         String Blm  = "";
//         String ARD = "";
//         String BLd = "";



//         for(int i =0;i<arriveAlice.length();i++){
//             if(i<2){
//                 monthA += leaveAlice.charAt(i);
//                 monthB += arriveBob.charAt(i);
//                 Arm += arriveAlice.charAt(i);
//                 Blm += leaveBob.charAt(i);


//             }
//             if(i>2){
//                 dayA += leaveAlice.charAt(i);
//                 dayB += arriveBob.charAt(i);
//                 ARD += arriveAlice.charAt(i);
//                 BLd += leaveBob.charAt(i);
//             }

//         }
//         AliceEnd = map.get(Integer.parseInt(monthA)) + Integer.parseInt(dayA);
//         BobArive = map.get(Integer.parseInt(monthB)) + Integer.parseInt(dayB);
//         AR = map.get(Integer.parseInt(Arm)) + Integer.parseInt(ARD);
//         Bl = map.get(Integer.parseInt(Blm)) + Integer.parseInt(BLd);
//         if(AliceEnd<BobArive ||AR>Bl ){
//             return 0;
//         }
//         if(AliceEnd>BobArive && AliceEnd>=Bl){
//             return Bl-BobArive+1;
//         }else if(Bl>AR && Bl>=AliceEnd){
//             return AliceEnd-AR+1;
//         }else if(AR==BobArive && Bl==AliceEnd){
//             return AliceEnd-AR+1;
//         }else if(AR<=BobArive && AliceEnd<Bl){
//             return AliceEnd-BobArive+1;
//         }else if(BobArive<=AR && Bl<AliceEnd){
//             return Bl-AR+1;
//         }else{
//              return AliceEnd-BobArive+1;
//         }
       

        
//     }
// }



class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 0);
        map.put(2, 31);
        map.put(3, 59);
        map.put(4, 90);
        map.put(5, 120);
        map.put(6, 151);
        map.put(7, 181);
        map.put(8, 212);
        map.put(9, 243);
        map.put(10, 273);
        map.put(11, 304);
        map.put(12, 334);

        
        int AR = map.get(Integer.parseInt(arriveAlice.substring(0, 2)))
                 + Integer.parseInt(arriveAlice.substring(3, 5));

        
        int AliceEnd = map.get(Integer.parseInt(leaveAlice.substring(0, 2)))
                       + Integer.parseInt(leaveAlice.substring(3, 5));

       
        int BobArive = map.get(Integer.parseInt(arriveBob.substring(0, 2)))
                       + Integer.parseInt(arriveBob.substring(3, 5));

        
        int Bl = map.get(Integer.parseInt(leaveBob.substring(0, 2)))
                 + Integer.parseInt(leaveBob.substring(3, 5));

        
        int start = Math.max(AR, BobArive);
        int end = Math.min(AliceEnd, Bl);

        return Math.max(0, end - start + 1);
    }
}