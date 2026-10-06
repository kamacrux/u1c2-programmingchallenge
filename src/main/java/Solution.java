public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return (t1+t2+t3+t4)/4;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int)(average+0.5);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        return roundedAverage>=65;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return shares*price;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        if (totalStock >= 0) {
            return (int)(totalStock+0.5);
        } else {
            return (int)(totalStock-0.5);
        }
        
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
        int tens = (int)(userDouble/10);
        int ones = (int)(userDouble%10/1);
        int tenths = (int)(userDouble%10%1*10%10);  
        int hundredths = (int)(userDouble%10%1*100%100);
        tens = (tens+1)%10;
        ones = (ones+1)%10;
        tenths = (tenths+1)%10;
        hundredths = (hundredths+1)%10;
        userDouble = (tens*10)+(ones*1)+((double)tenths/10)+((double)hundredths/100);
        return userDouble;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(120.90));
        //231.01
    }

}
