class Solution {
    public String English(int num){
        HashMap<Integer, String> ones = new HashMap<>();
        ones.put(1, "One");
        ones.put(2, "Two");
        ones.put(3, "Three");
        ones.put(4, "Four");
        ones.put(5, "Five");
        ones.put(6, "Six");
        ones.put(7, "Seven");
        ones.put(8, "Eight");
        ones.put(9, "Nine");
        HashMap<Integer, String> teens = new HashMap<>();

        teens.put(10, "Ten");
        teens.put(11, "Eleven");
        teens.put(12, "Twelve");
        teens.put(13, "Thirteen");
        teens.put(14, "Fourteen");
        teens.put(15, "Fifteen");
        teens.put(16, "Sixteen");
        teens.put(17, "Seventeen");
        teens.put(18, "Eighteen");
        teens.put(19, "Nineteen");
        HashMap<Integer, String> tens = new HashMap<>();

        tens.put(2, "Twenty");
        tens.put(3, "Thirty");
        tens.put(4, "Forty");
        tens.put(5, "Fifty");
        tens.put(6, "Sixty");
        tens.put(7, "Seventy");
        tens.put(8, "Eighty");
        tens.put(9, "Ninety");

        if(num<10){
            return ones.get(num);
        }
        if(num<20){
            return teens.get(num);
        }
        if(num<100){
            return tens.get(num/10)+ (num%10!=0 ? " "+English(num%10):"");
        }
        if(num<1000){
            return English(num/100) + " Hundred" + (num%100!=0 ?  " "+English(num%100):"");

        }
        if(num<1000000){
            return English(num/1000) +" "+ "Thousand" + (num%1000!=0?" "+English(num%1000):"");
        }
         if(num<1000000000){
            return English(num/1000000) +" "+ "Million" + (num%1000000!=0?" "+English(num%1000000):"");
        }
        
        return English(num/1000000000) + " " +"Billion" + (num%1000000000!=0?" "+English(num%1000000000):"");

    }
    public String numberToWords(int num) {

        if(num ==0){
            return "Zero";
        }

       return English(num);

        

    }
}